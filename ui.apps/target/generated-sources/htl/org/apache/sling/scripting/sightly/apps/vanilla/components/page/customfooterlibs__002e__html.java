/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.vanilla.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customfooterlibs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
out.write("\n");
_global_clientlib = renderContext.call("use", "core/wcm/components/commons/v1/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
    {
        boolean var_templateoptions1_field$_async = true;
        {
            String var_templateoptions1_field$_categories = "vanilla.base";
            {
                java.util.Map var_templateoptions1 = obj().with("async", var_templateoptions1_field$_async).with("categories", var_templateoptions1_field$_categories);
                callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
            }
        }
    }
}
out.write("\n\n<script>\n\n</script>\n<div class=\"accordion\" id=\"accordionExample\">\n    <div class=\"accordion-item\">\n        <h2 class=\"accordion-header\" id=\"headingOne\">\n            <button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n                Accordion Item #1\n            </button>\n        </h2>\n        <div id=\"collapseOne\" class=\"accordion-collapse collapse show\" aria-labelledby=\"headingOne\" data-bs-parent=\"#accordionExample\">\n            <div class=\"accordion-body\">\n                <strong>This is the first item's accordion body.</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.\n            </div>\n        </div>\n    </div>\n    <div class=\"accordion-item\">\n        <h2 class=\"accordion-header\" id=\"headingTwo\">\n            <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n                Accordion Item #2\n            </button>\n        </h2>\n        <div id=\"collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#accordionExample\">\n            <div class=\"accordion-body\">\n                <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.\n            </div>\n        </div>\n    </div>\n    <div class=\"accordion-item\">\n        <h2 class=\"accordion-header\" id=\"headingThree\">\n            <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n                Accordion Item #3\n            </b>\n        </h2>\n        <div id=\"collapseThree\" class=\"accordion-collapse collapse\" aria-labelledby=\"headingThree\" data-bs-parent=\"#accordionExample\">\n            <div class=\"accordion-body\">\n                <strong>This is the third item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.\n            </div>\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

