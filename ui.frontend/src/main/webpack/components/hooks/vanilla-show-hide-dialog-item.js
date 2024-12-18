/**
 * Extension to the standard dropdown/select component. It enabled hidding/unhidding of other components based on the
 * selection made in the dropdown/select.
 *
 * How to use:
 *
 * - add the class vanilla-dropdown-showhide to the dropdown/select element
 * - add the data attribute vanilla-dropdown-showhide-target to the dropdown/select element, value should be the
 *   selector, usually a specific class name, to find all possible target elements that can be shown/hidden.
 * - add the target class to each target component that can be shown/hidden
 * - add the class hidden to each target component to make them initially hidden
 * - add the attribute showhidetargetvalue to each target component, the value should equal the value of the select
 *   option that will unhide this element.
 */

/*(function (document, $) {
    "use strict";

    function showHideHandler(el) {
        el.each(function (i, element) {
            if($(element).is("coral-select") || $(element).is('coral-checkbox') || $(element).is('coral-numberinput')) {
                // handle Coral3 base drop-down
                Coral.commons.ready(element, function (component) {
                    showHide(component, element);
                    component.on("change", function () {
                        showHide(component, element);
                    });
                });
            } else {
                // handle Coral2 based drop-down
                var component = $(element).data("select");
                if (component) {
                    showHide(component, element);
                }
            }
        });
    }

    function showHidePanels($target, value) {
        if ($target.filter(".coral-TabPanel-pane").length > 0) {
            var $panels = $target.filter(".coral-TabPanel-pane");
            // hide tabs headings
            for (var i = 0; i < $panels.length; i++) {
                $('[aria-controls="' + $panels[i].id + '"]').not(".hide").addClass("hide");
            }
            // show tabs headings
            var $visiblePanels = $panels.filter("[data-showhidetargetvalue^='" + value +
             "'],[data-showhidetargetvalue*=' " + value + " '],[data-showhidetargetvalue$='" + value + "']");
            for (i = 0; i < $visiblePanels.length; i++) {
                $('[aria-controls="' + $visiblePanels[i].id + '"]').removeClass("hide");
            }
            $panels.not(".hide").addClass("hide");// make sure all unselected target elements are hidden.
            $visiblePanels.removeClass("hide");
        }
    }

    function showHideComboOptions($target, value) {
        var $comboOptions = $target.filter("coral-select-item");
        if ($comboOptions.length > 0) {
            for (var i = 0; i < $comboOptions.length; i++) {
                $comboOptions.siblings('coral-overlay')
                            .children('coral-selectlist')
                            .children('coral-selectlist-item:contains("' + $comboOptions[i].textContent + '")')
                            .not(".hide").addClass("hide");
            }
            var $visibleComboOptions = $comboOptions.filter("[data-showhidetargetvalue^='" + value +
             "'],[data-showhidetargetvalue*=' " + value + " '],[data-showhidetargetvalue$='" + value + "']");
            for (i = 0; i < $visibleComboOptions.length; i++) {
                $visibleComboOptions.siblings('coral-overlay')
                                    .children('coral-selectlist')
                                    .children('coral-selectlist-item:contains("' +
                                    $visibleComboOptions[i].textContent + '")')
                                    .removeClass("hide");
            }
            var $hiddenSelectedComboOptions = $comboOptions.siblings('coral-overlay')
                                                        .children('coral-selectlist')
                                                        .children('coral-selectlist-item')
                                                        .filter(':selected').filter('.hide');
            for (i = 0; i < $hiddenSelectedComboOptions.length; i++) {
                if ($($hiddenSelectedComboOptions[i]).parents('.hide').length == 0) {
                    $($hiddenSelectedComboOptions[i]).prevAll().not('.hide').first().click();
                }
            }
        }
    }

    function showHide(component, element) {
        // get the selector to find the target elements. its stored as data-.. attribute
        var target = $(element).data("vanillaDropdownShowhideTarget");
        var $target = $(target);

        if (target) {
            var value;
            if ($(component).is('coral-checkbox')) {
                value = $(component).prop('checked') ? 'true' : 'false';
            } else if (component.value) {
                value = component.value;
            } else if (component.getValue){
                value = component.getValue();
            }

            // target that are fieldset
            // make sure all unselected target elements are hidden.
            $target.filter(".coral-Form-fieldset,.coral-Checkbox").not(".hide").addClass("hide");
            $target.filter(".coral-Form-fieldset,.coral-Checkbox").filter("[data-showhidetargetvalue^='" +
            value + "'],[data-showhidetargetvalue*=' " + value + " '],[data-showhidetargetvalue$='" +
            value + "']").removeClass("hide");

            // target that aren't fieldset or Panels or Combo Options
            $target.not(".coral-Form-fieldset,.coral-TabPanel-pane,coral-select-item,.coral-Checkbox")
                   .parent().not(".hide").addClass("hide");// make sure all unselected target elements are hidden.
            $target.not(".coral-Form-fieldset,.coral-TabPanel-pane,coral-select-item,.coral-Checkbox")
                   .filter("[data-showhidetargetvalue^='" + value + "'],[data-showhidetargetvalue*=' " +
                   value + " '],[data-showhidetargetvalue$='" + value + "']")
                   .parent().removeClass("hide");

            showHidePanels($target, value);
            showHideComboOptions($target, value);
        }
    }

    // when dialog gets injected
    $(document).on("foundation-contentloaded", function (e) {
        // if there is already an inital value make sure the according target element becomes visible
        if ($(e.target).hasClass('coral-Multifield-list')) {
            showHideHandler($(".vanilla-dropdown-showhide", e.currentTarget));
        } else {
            setTimeout(function(){ showHideHandler($(".vanilla-dropdown-showhide", e.target)); }, 300);
        }
    });

    $(document).on("selected", ".vanilla-dropdown-showhide", function () {
        showHideHandler($(this));
    });
 */
/*}(document, Granite.$));*/
