<%--
  ADOBE CONFIDENTIAL

  Copyright 2016 Adobe Systems Incorporated
  All Rights Reserved.

  NOTICE:  All information contained herein is, and remains
  the property of Adobe Systems Incorporated and its suppliers,
  if any.  The intellectual and technical concepts contained
  herein are proprietary to Adobe Systems Incorporated and its
  suppliers and may be covered by U.S. and Foreign Patents,
  patents in process, and are protected by trade secret or copyright law.
  Dissemination of this information or reproduction of this material
  is strictly forbidden unless prior written permission is obtained
  from Adobe Systems Incorporated.
--%><%
%><%@include file="/libs/granite/ui/global.jsp" %><%
%><%@page session="false"
          import="com.adobe.granite.ui.components.AttrBuilder,
                  com.adobe.granite.ui.components.Config,
                  com.adobe.granite.ui.components.ComponentHelper.Options,
                  com.adobe.granite.ui.components.Field,
                  com.adobe.granite.ui.components.Tag,
                  java.util.Iterator,
                  org.apache.commons.lang.StringUtils" %><%--###
ColorField
===========

.. granite:servercomponent:: /libs/granite/ui/components/coral/foundation/form/colorfield
   
   A field that allows user to enter color.
   
   It extends :granite:servercomponent:`Field </libs/granite/ui/components/coral/foundation/form/field>` component.
   
   It has the following content structure:
   
   .. gnd:gnd::

      [granite:FormColorField] > granite:FormField

      /**
       * The name that identifies the field when submitting the form.
       */
      - name (String)

      /**
       * The value of the field.
       * This value can be set in 5 different formats (HEX, RGB, RGBA, HSB and CMYK)
       */
      - value (StringEL)
      
      /**
       * A hint to the user of what can be entered in the field.
       */
      - emptyText (String) i18n

      /**
       * Indicates if the field is in disabled state.
       */
      - disabled (Boolean)

      /**
       * Indicates if the field is mandatory to be filled.
       */
      - required (Boolean)

      /**
       * Enumeration for colorfield variant:
       *
       * default
       *    Use ColorField as a formfield
       * swatch
       *    Use a simple swatch as ColorField
       */
      - variant (String) = 'default'

      /**
       * Enumeration for auto generated colors state:
       *
       * off
       *    Disable auto generation
       * shades
       *    Automatically generate shades (darker colors) of all colors
       * tints
       *    Automatically generate tints (lighter colors) of all colors
       */
      - autogenerateColors (String) = 'off'

       /**
       * Indicates if swatches view should be displayed.
       * swatches view is the right side container that allows to select color from swatches.
       */
      - showSwatches (Boolean)

      /**
       * Indicates if color properties view should be displayed.
       * color properties view is the left side container having sliders, hex and RGBA inputs
       */
      - showProperties (Boolean)

      /**
       * Indicates if default colors should be displayed.
       */
      - showDefaultColors (Boolean)

      /**
       * The name of the validator to be applied. E.g. ``foundation.jcr.name``.
       * See :doc:`validation </jcr_root/libs/granite/ui/components/coral/foundation/clientlibs/foundation/js/validation/index>` in Granite UI.
       */
      - validation (String) multiple

   Custom colors can be added as items with following content structure:

   .. gnd:gnd::

      [granite:FormColorFieldItem]

      /**
       * The color value.
       * This value can be set in 5 different formats (HEX, RGB, RGBA, HSB and CMYK)
       */
      - value (String)

   Example::
   
      + colorfield
        - sling:resourceType = "granite/ui/components/coral/foundation/form/colorfield"
        + items
          + color1
            - value = "#FF4136"
          + color2
            - value = "#0074D9"
###--%><%

    Config cfg = cmp.getConfig();
    Tag tag = cmp.consumeTag();
    AttrBuilder attrs = tag.getAttrs();
    cmp.populateCommonAttrs(attrs);
	final String DEFAULT_COLORS_PATH = "vanilla/components/widgets/colorfield/items";

    ValueMap vm = (ValueMap) request.getAttribute(Field.class.getName());

    attrs.add("value", vm.get("value", String.class));

    attrs.add("name", cfg.get("name", String.class));
    attrs.add("placeholder", i18n.getVar(cfg.get("emptyText", String.class)));

    attrs.addDisabled(cfg.get("disabled", false));
    if(cfg.get("required", false) == true){
        attrs.add("required", true);
    }
    attrs.add("variant", cfg.get("variant", "default"));
    attrs.add("autoGenerateColors", cfg.get("autogenerateColors", "off"));

    boolean showSwatches = cfg.get("showSwatches", true);
    attrs.add("showSwatches", showSwatches ? "on" : "off");

    boolean showProperties = cfg.get("showProperties", false);
    attrs.add("showProperties", showProperties ? "on" : "off");

    boolean showDefaultColors = cfg.get("showDefaultColors", false);
    attrs.add("showDefaultColors", showDefaultColors ? "on" : "off");

    String validation = StringUtils.join(cfg.get("validation", new String[0]), " ");
    attrs.add("data-foundation-validation", validation);
    attrs.add("data-validation", validation); // Compatibility

%><coral-colorinput <%= attrs.build() %>><%

    Iterator<Resource> items;
    //If the component has its own colors
    if(cmp.getItemDataSource().iterator().hasNext()){
        items = cmp.getItemDataSource().iterator();
    }
    else {
        Resource res= resourceResolver.getResource(DEFAULT_COLORS_PATH);
        items = res.listChildren();
    }    
    while(items.hasNext()){
        Resource item = items.next();
        Config itemCfg = new Config(item);
        String value = itemCfg.get("value", String.class);
        %><coral-colorinput-item value='<%=xssAPI.encodeForHTMLAttr(value)%>'></coral-colorinput-item><%
    }
%></coral-colorinput>
