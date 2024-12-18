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
package org.apache.sling.scripting.sightly.apps.vanilla.components.columns;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class columns__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _dynamic_component = bindings.get("component");
Object _dynamic_properties = bindings.get("properties");
Object _dynamic_container = bindings.get("container");
Object _global_container = null;
Object _global_custom = null;
Object _global_verticalpaddingcolunified = null;
Object _global_verticalpaddingcolunifiedvalue = null;
Object _global_verticalpaddingcoltop = null;
Object _global_verticalpaddingcolbottom = null;
Object _global_verticalpaddingcolvalue = null;
Object _global_verticalpaddingrowunified = null;
Object _global_verticalpaddingrowunifiedvalue = null;
Object _global_verticalpaddingrowtop = null;
Object _global_verticalpaddingrowbottom = null;
Object _global_verticalpaddingrowvalue = null;
Object _global_customcolumns = null;
Object _global_fixedcolumns = null;
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div>");
        {
            String var_1 = (("[ Start of " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_component, "title"), "text"))) + " Component ]");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</div>");
    }
}
out.write("\n");
_global_container = (((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "layout"), "container")) || (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "layout")))) ? "container" : _global_container);
if (renderContext.getObjectModel().toBoolean(_global_container)) {
}
out.write("\n");
_global_container = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "layout"), "none")) ? "" : _global_container);
if (renderContext.getObjectModel().toBoolean(_global_container)) {
}
out.write("\n");
_global_container = (renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fullWidth")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fullWidth") : (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "layout"), "full"))))) ? "container-fluid" : _global_container);
if (renderContext.getObjectModel().toBoolean(_global_container)) {
}
out.write("\n<!-- for legacy reasons properties.fullWidth was a checkbox previously -->\n\n");
_global_custom = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cols"), "custom")) ? true : false);
if (renderContext.getObjectModel().toBoolean(_global_custom)) {
}
out.write("\n\n");
_global_verticalpaddingcolunified = (renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean((((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "removeLegacyPadding"))) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "verticalPadding") : (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "removeLegacyPadding")))))) ? (((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "removeLegacyPadding"))) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "verticalPadding") : (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "removeLegacyPadding"))))) : (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingBottomCol"), renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopCol")))))) ? true : false);
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolunified)) {
}
out.write("\n");
_global_verticalpaddingcolunifiedvalue = (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolunified) ? (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "removeLegacyPadding")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopCol") : renderContext.getObjectModel().resolveProperty(_dynamic_properties, "verticalPadding")) : "");
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolunifiedvalue)) {
}
out.write("\n");
_global_verticalpaddingcolunifiedvalue = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"py-", _global_verticalpaddingcolunifiedvalue})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolunifiedvalue)) {
}
out.write("\n");
_global_verticalpaddingcoltop = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"pt-", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopCol")})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcoltop)) {
}
out.write("\n");
_global_verticalpaddingcolbottom = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"pb-", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingBottomCol")})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolbottom)) {
}
out.write("\n");
_global_verticalpaddingcolvalue = renderContext.call("format", "{0} {1}", obj().with("format", (new Object[] {_global_verticalpaddingcoltop, _global_verticalpaddingcolbottom})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolvalue)) {
}
out.write("\n");
_global_verticalpaddingcolvalue = (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolunified) ? _global_verticalpaddingcolunifiedvalue : _global_verticalpaddingcolvalue);
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingcolvalue)) {
}
out.write("\n\n");
_global_verticalpaddingrowunified = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopRow"), renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingBottomRow"))) ? true : false);
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowunified)) {
}
out.write("\n");
_global_verticalpaddingrowunifiedvalue = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"py-", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopRow")})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowunifiedvalue)) {
}
out.write("\n");
_global_verticalpaddingrowtop = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"pt-", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingTopRow")})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowtop)) {
}
out.write("\n");
_global_verticalpaddingrowbottom = renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"pb-", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "paddingBottomRow")})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowbottom)) {
}
out.write("\n");
_global_verticalpaddingrowvalue = renderContext.call("format", "{0} {1}", obj().with("format", (new Object[] {_global_verticalpaddingrowtop, _global_verticalpaddingrowbottom})));
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowvalue)) {
}
out.write("\n");
_global_verticalpaddingrowvalue = (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowunified) ? _global_verticalpaddingrowunifiedvalue : _global_verticalpaddingrowvalue);
if (renderContext.getObjectModel().toBoolean(_global_verticalpaddingrowvalue)) {
}
out.write("\n\n");
_global_customcolumns = renderContext.call("use", "customColumns.html", obj());
out.write("\n");
_global_fixedcolumns = renderContext.call("use", "fixedColumns.html", obj());
out.write("\n<!-- for legacy reasons properties.fullWidth was a checkbox previously -->\n\n<div");
{
    String var_attrcontent2 = ("columns-component " + renderContext.getObjectModel().toString(renderContext.call("xss", _global_container, "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
    out.write("\"");
}
{
    Object var_attrvalue3 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "sectionId");
    {
        Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "attribute");
        {
            boolean var_shoulddisplayattr6 = (((null != var_attrcontent4) && (!"".equals(var_attrcontent4))) && ((!"".equals(var_attrvalue3)) && (!((Object)false).equals(var_attrvalue3))));
            if (var_shoulddisplayattr6) {
                out.write(" id");
                {
                    boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                    if (!var_istrueattr5) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n    ");
{
    Object var_testvariable7 = _global_custom;
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        {
            Object var_templatevar8 = renderContext.getObjectModel().resolveProperty(_global_customcolumns, "template");
            {
                Object var_templateoptions9_field$_verticalpaddingcolvalue = _global_verticalpaddingcolvalue;
                {
                    Object var_templateoptions9_field$_verticalpaddingrowvalue = _global_verticalpaddingrowvalue;
                    {
                        java.util.Map var_templateoptions9 = obj().with("verticalPaddingColValue", var_templateoptions9_field$_verticalpaddingcolvalue).with("verticalPaddingRowValue", var_templateoptions9_field$_verticalpaddingrowvalue);
                        callUnit(out, renderContext, var_templatevar8, var_templateoptions9);
                    }
                }
            }
        }
    }
}
out.write("\n    ");
{
    boolean var_testvariable10 = (!renderContext.getObjectModel().toBoolean(_global_custom));
    if (var_testvariable10) {
        {
            Object var_templatevar11 = renderContext.getObjectModel().resolveProperty(_global_fixedcolumns, "template");
            {
                Object var_templateoptions12_field$_verticalpaddingcolvalue = _global_verticalpaddingcolvalue;
                {
                    Object var_templateoptions12_field$_verticalpaddingrowvalue = _global_verticalpaddingrowvalue;
                    {
                        java.util.Map var_templateoptions12 = obj().with("verticalPaddingColValue", var_templateoptions12_field$_verticalpaddingcolvalue).with("verticalPaddingRowValue", var_templateoptions12_field$_verticalpaddingrowvalue);
                        callUnit(out, renderContext, var_templatevar11, var_templateoptions12);
                    }
                }
            }
        }
    }
}
out.write("\n</div>\n");
{
    Object var_testvariable13 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit");
    if (renderContext.getObjectModel().toBoolean(var_testvariable13)) {
        out.write("<div>");
        {
            String var_14 = (("[ End of " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_component, "title"), "text"))) + " Component ]");
            out.write(renderContext.getObjectModel().toString(var_14));
        }
        out.write("</div>");
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

