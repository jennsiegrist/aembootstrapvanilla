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

public final class customColumns__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_template = getProperty("template");
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
addSubTemplate("template", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _global_multifieldhelper = null;
Object _dynamic_properties = bindings.get("properties");
Object _dynamic_verticalpaddingrowvalue = arguments.get("verticalpaddingrowvalue");
Collection var_collectionvar1_list_coerced$ = null;
Object _dynamic_verticalpaddingcolvalue = arguments.get("verticalpaddingcolvalue");
out.write("\n    ");
_global_multifieldhelper = renderContext.call("use", "com.vanilla.models.MultifieldHelper", obj().with("multifieldNodeName", "customColumns"));
out.write("<div");
{
    String var_attrcontent0 = ((((("row " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "nogutters")) ? "no-gutters" : ""), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", _dynamic_verticalpaddingrowvalue, "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "horizontalAlignment"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(">\n        ");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_multifieldhelper, "ItemsList");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object par : var_collectionvar1_list_coerced$) {
                                {
                                    long parlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index8, 1)).longValue());
                                    {
                                        boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                        if (var_traversal10) {
                                            out.write("\n            <div");
                                            {
                                                String var_attrcontent11 = ((((((((renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(par, "mobileHide")) ? "d-none d-md-block" : ""), "attribute")) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(par, "tabletWidth"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(par, "desktopWidth"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", _dynamic_verticalpaddingcolvalue, "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "verticalAlignment"), "attribute")));
                                                out.write(" class=\"");
                                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                out.write("\"");
                                            }
                                            out.write(">");
                                            {
                                                Object var_resourcecontent12 = renderContext.call("includeResource", renderContext.call("format", "{0}{1}", obj().with("format", (new Object[] {"col_", parlist_field$_count}))), obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
                                                out.write(renderContext.getObjectModel().toString(var_resourcecontent12));
                                            }
                                            out.write("</div>\n        ");
                                        }
                                    }
                                }
                                var_index8++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\n    </div>\n");


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

