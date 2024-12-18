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
package org.apache.sling.scripting.sightly.apps.vanilla.components.navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class itemContent__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_itemcontent = getProperty("itemcontent");
out.write("<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n  ~ Copyright 2021 Adobe\n  ~\n  ~ Licensed under the Apache License, Version 2.0 (the \"License\");\n  ~ you may not use this file except in compliance with the License.\n  ~ You may obtain a copy of the License at\n  ~\n  ~     http://www.apache.org/licenses/LICENSE-2.0\n  ~\n  ~ Unless required by applicable law or agreed to in writing, software\n  ~ distributed under the License is distributed on an \"AS IS\" BASIS,\n  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  ~ See the License for the specific language governing permissions and\n  ~ limitations under the License.\n  ~\n  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->\n");
out.write("\n\n\n<!--<li class=\"nav-item dropdown\">\n    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n        Dropdown\n    </a>\n    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n        <a class=\"dropdown-item\" href=\"#\">Action</a>\n        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n        <div class=\"dropdown-divider\"></div>\n        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n    </div>\n</li>\n-->\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------

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
addSubTemplate("itemContent", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _dynamic_item = arguments.get("item");
Collection var_attrmap0_list_coerced$ = null;
out.write("\n    ");
{
    boolean var_unwrapcondition1 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_item, "link"), "valid")));
    if (!var_unwrapcondition1) {
        out.write("<a");
        {
            Object var_attrmap0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_item, "link"), "htmlAttributes");
            {
                Object var_attrvalue2 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_item, "current")) ? "page" : renderContext.getObjectModel().resolveProperty(_dynamic_item, "current")));
                {
                    Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "attribute");
                    {
                        boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
                        if (var_shoulddisplayattr5) {
                            out.write(" aria-current");
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
                boolean var_attrvalue6 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_item, "data")) ? true : false);
                {
                    Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
                    {
                        boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (false != var_attrvalue6)));
                        if (var_shoulddisplayattr9) {
                            out.write(" data-cmp-clickable");
                            {
                                boolean var_istrueattr8 = (var_attrvalue6 == true);
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
            out.write(" class=\"cmp-navigation__item-link nav-link\"");
            {
                boolean var_ignoredattributes10_field$_aria__002d__current = true;
                {
                    boolean var_ignoredattributes10_field$_data__002d__cmp__002d__clickable = true;
                    {
                        boolean var_ignoredattributes10_field$_class = true;
                        {
                            java.util.Map var_ignoredattributes10 = obj().with("aria-current", var_ignoredattributes10_field$_aria__002d__current).with("data-cmp-clickable", var_ignoredattributes10_field$_data__002d__cmp__002d__clickable).with("class", var_ignoredattributes10_field$_class);
                            if (var_attrmap0_list_coerced$ == null) {
                                var_attrmap0_list_coerced$ = renderContext.getObjectModel().toCollection(var_attrmap0);
                            }
                            long var_attrindex13 = 0;
                            for (Object var_attrname11 : var_attrmap0_list_coerced$) {
                                {
                                    Object var_attrnameescaped12 = renderContext.call("xss", var_attrname11, "attributeName");
                                    if (renderContext.getObjectModel().toBoolean(var_attrnameescaped12)) {
                                        {
                                            Object var_isignoredattr14 = var_ignoredattributes10.get(var_attrname11);
                                            if (!renderContext.getObjectModel().toBoolean(var_isignoredattr14)) {
                                                {
                                                    Object var_attrcontent15 = renderContext.getObjectModel().resolveProperty(var_attrmap0, var_attrname11);
                                                    {
                                                        Object var_attrcontentescaped16 = renderContext.call("xss", var_attrcontent15, "attribute", var_attrnameescaped12);
                                                        {
                                                            boolean var_shoulddisplayattr17 = (((null != var_attrcontentescaped16) && (!"".equals(var_attrcontentescaped16))) && ((!"".equals(var_attrcontent15)) && (!((Object)false).equals(var_attrcontent15))));
                                                            if (var_shoulddisplayattr17) {
                                                                out.write(" ");
                                                                out.write(renderContext.getObjectModel().toString(var_attrnameescaped12));
                                                                {
                                                                    boolean var_istrueattr18 = (var_attrcontent15.equals(true));
                                                                    if (!var_istrueattr18) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontentescaped16));
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
                                var_attrindex13++;
                            }
                        }
                    }
                }
            }
            var_attrmap0_list_coerced$ = null;
        }
        out.write(">");
    }
    {
        Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "title"), "text");
        out.write(renderContext.getObjectModel().toString(var_19));
    }
    if (!var_unwrapcondition1) {
        out.write("</a>");
    }
}
out.write("\n");


// End Of Main Sub-Template Body ------------------------------------------------------------------
    }



    {
//Sub-Sub-Templates Initialization ----------------------------------------------------------------



//End of Sub-Sub-Templates Initialization ---------------------------------------------------------
    }
    
});


//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

