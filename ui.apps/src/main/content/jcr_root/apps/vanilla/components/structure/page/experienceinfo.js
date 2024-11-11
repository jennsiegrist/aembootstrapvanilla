/*******************************************************************************
 * Copyright 2016 Adobe Systems Incorporated
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
"use strict";

use(["/libs/wcm/foundation/components/utils/ResourceUtils.js", "/libs/sightly/js/3rd-party/q.js"], function (ResourceUtils, Q) {
    var titlePropPromise = Q.defer();
    var experienceTitlePromise = Q.defer();
    var descriptionPropPromise = Q.defer();
    
    var CONST = {
            JCR_TITLE: "jcr:title",
            JCR_CONTENT: "jcr:content",
            JCR_DESCRIPTION: "jcr:description",
            LAST_MODIFIED: "cq:lastModified"
        };
    
    return granite.resource.getParent().then(function (parentRes) {
        var name = parentRes.name;
        
        var titleProp = granite.resource.properties[CONST.JCR_TITLE];
        if (!titleProp) {
            ResourceUtils.getResource(granite.resource.path + "/" + CONST.JCR_CONTENT)
                .then(function (contentResource) {
                    titleProp = contentResource.properties[CONST.JCR_TITLE];
                    titlePropPromise.resolve(titleProp);
                });
        } else {
            titlePropPromise.resolve(titleProp);
        }
        
        var descriptionProp = granite.resource.properties[CONST.JCR_DESCRIPTION];
        if (!descriptionProp) {
            ResourceUtils.getResource(granite.resource.path + "/" + CONST.JCR_CONTENT)
                .then(function (contentResource) {
                    descriptionProp = contentResource.properties[CONST.JCR_DESCRIPTION];
                    descriptionPropPromise.resolve(descriptionProp);
                });
        } else {
            descriptionPropPromise.resolve(descriptionProp);
        }
        
        titlePropPromise.promise.then(function (foundTitle) {
            if (!foundTitle) {
                experienceTitlePromise.resolve(name);
            } else {
                experienceTitlePromise.resolve(foundTitle);
            }
        });
        
        var lastModifDate = granite.resource.properties[CONST.LAST_MODIFIED];
        
        return {
            id: name,
            description: descriptionPropPromise.promise,
            experienceTitle: experienceTitlePromise.promise,
            analyzeUrl: parentRes.path,
            lastModifiedDate: lastModifDate
        };
    });
});
