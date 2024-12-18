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

public final class navigation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_navigation = null;
Object _global_template = null;
Object _global_grouptemplate = null;
Object _global_hascontent = null;
out.write("\n");
_global_navigation = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Navigation.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_grouptemplate = renderContext.call("use", "group.html", obj());
_global_hascontent = (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_navigation, "items"), "size"), 0)));
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<nav");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_navigation, "id");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" id");
                    {
                        boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                        if (!var_istrueattr2) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" class=\"cmp-navigation navbar navbar-expand-lg navbar-dark bg-primary\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\"");
    {
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_navigation, "data"), "json");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" data-cmp-data-layer");
                    {
                        boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                        if (!var_istrueattr6) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_navigation, "accessibilityLabel");
        {
            Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
            {
                boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                if (var_shoulddisplayattr11) {
                    out.write(" aria-label");
                    {
                        boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                        if (!var_istrueattr10) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" role=\"navigation\">");
    {
        Object var_templatevar12 = renderContext.getObjectModel().resolveProperty(_global_grouptemplate, "group");
        {
            Object var_templateoptions13_field$_items = renderContext.getObjectModel().resolveProperty(_global_navigation, "items");
            {
                java.util.Map var_templateoptions13 = obj().with("items", var_templateoptions13_field$_items);
                callUnit(out, renderContext, var_templatevar12, var_templateoptions13);
            }
        }
    }
    out.write("</nav>");
}
out.write("\n");
{
    Object var_templatevar14 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions15_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            String var_templateoptions15_field$_classappend = "cmp-navigation";
            {
                java.util.Map var_templateoptions15 = obj().with("isEmpty", var_templateoptions15_field$_isempty).with("classAppend", var_templateoptions15_field$_classappend);
                callUnit(out, renderContext, var_templatevar14, var_templateoptions15);
            }
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

