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

public final class item__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_item = getProperty("item");
out.write("<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n  ~ Copyright 2021 Adobe\n  ~\n  ~ Licensed under the Apache License, Version 2.0 (the \"License\");\n  ~ you may not use this file except in compliance with the License.\n  ~ You may obtain a copy of the License at\n  ~\n  ~     http://www.apache.org/licenses/LICENSE-2.0\n  ~\n  ~ Unless required by applicable law or agreed to in writing, software\n  ~ distributed under the License is distributed on an \"AS IS\" BASIS,\n  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  ~ See the License for the specific language governing permissions and\n  ~ limitations under the License.\n  ~\n  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->\n");
out.write("\n");


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
addSubTemplate("item", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _global_grouptemplate = null;
Object _global_itemcontenttemplate = null;
Object _dynamic_item = arguments.get("item");
_global_grouptemplate = renderContext.call("use", "group.html", obj());
_global_itemcontenttemplate = renderContext.call("use", "itemContent.html", obj());
out.write("\n    <li");
{
    String var_attrcontent0 = (((("cmp-navigation__item nav-item cmp-navigation__item--level-" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "level"), "attribute"))) + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_item, "active")) ? " cmp-navigation__item--active active" : ""), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", ((!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_item, "children"), "size"), 0))) ? "dropdown" : ""), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_item, "data"), "json");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" data-cmp-data-layer");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n        ");
{
    Object var_templatevar5 = renderContext.getObjectModel().resolveProperty(_global_itemcontenttemplate, "itemContent");
    {
        Object var_templateoptions6_field$_item = _dynamic_item;
        {
            java.util.Map var_templateoptions6 = obj().with("item", var_templateoptions6_field$_item);
            callUnit(out, renderContext, var_templatevar5, var_templateoptions6);
        }
    }
}
out.write("\n        ");
{
    boolean var_testvariable7 = (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_item, "children"), "size"), 0)));
    if (var_testvariable7) {
        {
            Object var_templatevar8 = renderContext.getObjectModel().resolveProperty(_global_grouptemplate, "group");
            {
                Object var_templateoptions9_field$_items = renderContext.getObjectModel().resolveProperty(_dynamic_item, "children");
                {
                    java.util.Map var_templateoptions9 = obj().with("items", var_templateoptions9_field$_items);
                    callUnit(out, renderContext, var_templatevar8, var_templateoptions9);
                }
            }
        }
    }
}
out.write("\n    </li>\n");


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

