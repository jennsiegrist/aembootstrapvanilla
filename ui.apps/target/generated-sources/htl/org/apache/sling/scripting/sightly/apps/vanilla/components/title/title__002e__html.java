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
package org.apache.sling.scripting.sightly.apps.vanilla.components.title;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class title__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_title = null;
Object _global_template = null;
Object _global_text = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_attrmap10_list_coerced$ = null;
_global_title = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Title.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_text = renderContext.getObjectModel().resolveProperty(_global_title, "text");
if (renderContext.getObjectModel().toBoolean(_global_text)) {
    {
        Object var_tagvar0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_title, "type"), "elementName");
        if (renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("<");
            out.write(renderContext.getObjectModel().toString(var_tagvar0));
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("<h1");
        }
        {
            String var_attrcontent1 = ((((((("cmp-title__text " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "marginBottom"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingBottom"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTop"), "attribute"))) + "\n ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "alignment"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
            out.write("\"");
        }
        {
            Object var_attrvalue2 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "data"), "json");
            {
                Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "attribute");
                {
                    boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
                    if (var_shoulddisplayattr5) {
                        out.write(" data-cmp-data-layer");
                        {
                            boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                            if (!var_istrueattr4) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_global_title, "id");
            {
                Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
                {
                    boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                    if (var_shoulddisplayattr9) {
                        out.write(" id");
                        {
                            boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                            if (!var_istrueattr8) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\n    ");
        {
            Object var_unwrapcondition11 = (((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "link"), "valid"))) ? (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "link"), "valid"))) : renderContext.getObjectModel().resolveProperty(_global_title, "linkDisabled")));
            if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition11)) {
                out.write("<a");
                {
                    Object var_attrmap10 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "link"), "htmlAttributes");
                    {
                        String var_attrname_class12 = "class";
                        {
                            Object var_mapcontains_class13 = renderContext.getObjectModel().resolveProperty(var_attrmap10, "class");
                            {
                                Object var_attrcontentescaped14 = renderContext.call("xss", var_mapcontains_class13, "attribute", "class");
                                {
                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontentescaped14) && (!"".equals(var_attrcontentescaped14))) && ((!"".equals(var_mapcontains_class13)) && (!((Object)false).equals(var_mapcontains_class13))));
                                    if (var_shoulddisplayattr15) {
                                        out.write(" ");
                                        out.write(renderContext.getObjectModel().toString(var_attrname_class12));
                                        {
                                            boolean var_istrueattr16 = (var_mapcontains_class13.equals(true));
                                            if (!var_istrueattr16) {
                                                out.write("=\"");
                                                out.write(renderContext.getObjectModel().toString(var_attrcontentescaped14));
                                                out.write("\"");
                                            }
                                        }
                                    }
                                }
                            }
                            if (!renderContext.getObjectModel().toBoolean(var_mapcontains_class13)) {
                                out.write(" class=\"cmp-title__link\"");
                            }
                        }
                    }
                    {
                        boolean var_attrvalue17 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_title, "data")) ? true : false);
                        {
                            Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                            {
                                boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (false != var_attrvalue17)));
                                if (var_shoulddisplayattr20) {
                                    out.write(" data-cmp-clickable");
                                    {
                                        boolean var_istrueattr19 = (var_attrvalue17 == true);
                                        if (!var_istrueattr19) {
                                            out.write("=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                            out.write("\"");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        boolean var_ignoredattributes21_field$_data__002d__cmp__002d__clickable = true;
                        {
                            boolean var_ignoredattributes21_field$_class = true;
                            {
                                java.util.Map var_ignoredattributes21 = obj().with("data-cmp-clickable", var_ignoredattributes21_field$_data__002d__cmp__002d__clickable).with("class", var_ignoredattributes21_field$_class);
                                if (var_attrmap10_list_coerced$ == null) {
                                    var_attrmap10_list_coerced$ = renderContext.getObjectModel().toCollection(var_attrmap10);
                                }
                                long var_attrindex24 = 0;
                                for (Object var_attrname22 : var_attrmap10_list_coerced$) {
                                    {
                                        Object var_attrnameescaped23 = renderContext.call("xss", var_attrname22, "attributeName");
                                        if (renderContext.getObjectModel().toBoolean(var_attrnameescaped23)) {
                                            {
                                                Object var_isignoredattr25 = var_ignoredattributes21.get(var_attrname22);
                                                if (!renderContext.getObjectModel().toBoolean(var_isignoredattr25)) {
                                                    {
                                                        Object var_attrcontent26 = renderContext.getObjectModel().resolveProperty(var_attrmap10, var_attrname22);
                                                        {
                                                            Object var_attrcontentescaped27 = renderContext.call("xss", var_attrcontent26, "attribute", var_attrnameescaped23);
                                                            {
                                                                boolean var_shoulddisplayattr28 = (((null != var_attrcontentescaped27) && (!"".equals(var_attrcontentescaped27))) && ((!"".equals(var_attrcontent26)) && (!((Object)false).equals(var_attrcontent26))));
                                                                if (var_shoulddisplayattr28) {
                                                                    out.write(" ");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrnameescaped23));
                                                                    {
                                                                        boolean var_istrueattr29 = (var_attrcontent26.equals(true));
                                                                        if (!var_istrueattr29) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontentescaped27));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var_attrindex24++;
                                }
                            }
                        }
                    }
                    var_attrmap10_list_coerced$ = null;
                }
                out.write(">");
            }
            {
                Object var_30 = renderContext.call("xss", _global_text, "text");
                out.write(renderContext.getObjectModel().toString(var_30));
            }
            if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition11)) {
                out.write("</a>");
            }
        }
        out.write("\n");
        if (renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("</");
            out.write(renderContext.getObjectModel().toString(var_tagvar0));
            out.write(">");
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("</h1>");
        }
    }
}
out.write("\n");
{
    Object var_templatevar31 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions32_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_text));
        {
            String var_templateoptions32_field$_classappend = "cmp-title";
            {
                java.util.Map var_templateoptions32 = obj().with("isEmpty", var_templateoptions32_field$_isempty).with("classAppend", var_templateoptions32_field$_classappend);
                callUnit(out, renderContext, var_templatevar31, var_templateoptions32);
            }
        }
    }
}
out.write("\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

