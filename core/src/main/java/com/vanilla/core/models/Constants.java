package com.vanilla.core.models;

import java.util.HashMap;
import java.util.Map;

import com.day.cq.commons.jcr.JcrConstants;

public abstract class Constants {

    /**
     * Constants for a placeholder that would be replaced by the current site's
     * language.
     */
    public static final String LANGUAGE_PH = "{LANG}";

    /**
     * String constant containing special characters that must be removed from the URL
     */
    public static final String SPECIAL_URL_CHARACTERS_PATTERN = "[\\s|・|\\(|\\)|\\[|\\]|\\{|\\}|%|#|;|@|:|\\^|\\~|\"|,|\\.|'|&|_|/|-|$]+";

    public static final Map<String, String> SPECIAL_URL_CHARACTERS_MAP;
    static {
        SPECIAL_URL_CHARACTERS_MAP = new HashMap<>();
        SPECIAL_URL_CHARACTERS_MAP.put("á","a");
        SPECIAL_URL_CHARACTERS_MAP.put("ä","a");
        SPECIAL_URL_CHARACTERS_MAP.put("â","a");
        SPECIAL_URL_CHARACTERS_MAP.put("à","a");
        SPECIAL_URL_CHARACTERS_MAP.put("é","e");
        SPECIAL_URL_CHARACTERS_MAP.put("ë","e");
        SPECIAL_URL_CHARACTERS_MAP.put("ê","e");
        SPECIAL_URL_CHARACTERS_MAP.put("è","e");
        SPECIAL_URL_CHARACTERS_MAP.put("í","i");
        SPECIAL_URL_CHARACTERS_MAP.put("ï","i");
        SPECIAL_URL_CHARACTERS_MAP.put("î","i");
        SPECIAL_URL_CHARACTERS_MAP.put("ì","i");
        SPECIAL_URL_CHARACTERS_MAP.put("ó","o");
        SPECIAL_URL_CHARACTERS_MAP.put("ö","o");
        SPECIAL_URL_CHARACTERS_MAP.put("ô","o");
        SPECIAL_URL_CHARACTERS_MAP.put("ò","o");
        SPECIAL_URL_CHARACTERS_MAP.put("ú","u");
        SPECIAL_URL_CHARACTERS_MAP.put("ü","u");
        SPECIAL_URL_CHARACTERS_MAP.put("û","u");
        SPECIAL_URL_CHARACTERS_MAP.put("ù","u");
    }

    public static final String CONFIG_PATH_NAME = "config";

    public static final String UNDERSCORE = "_";

    public static final String DASH = "-";

    public static final String SLASH = "/";


    /**
     * Level where the site root node is. e.g.: /content/vanilla
     */
    public static final int SITE_ROOT_LEVEL = 1;

    /**
     * Level where the language root node is. e.g.: /content/vanilla/en
     */
    public static final int LANG_ROOT_LEVEL = 2;

    public static final String COMMONS_LIST_ROOT = "/content/commons/lists";

    public static final String DAM_ROOT = "/content/dam/vanilla";

    public static final String DAM_IMAGES_ROOT = "/content/dam/vanilla/images";

    public static final String DAM_DOCUMENTS_ROOT = "/content/dam/vanilla/documents";

    public static final String EXPERIENCE_FRAGMENTS_ROOT = "/content/experience-fragments";

    public static final String DEFAULT_LANGUAGE = "en";
    
    public static final String[] ROMAN_LANGUAGES = {"es","it","pt","fr","de"};


    /**
     * Service name to map with the system user for configurations
     */
    public static final String CONFIG_SERVICE_NAME = "siteConfiguration";

    /**
     * Service name to map with the system user for translations
     */
    public static final String TRANSLATIONS_SERVICE_NAME = "translationsUser";

    /**
     * AEM Date Format.
     */
    public static final String AEM_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    /**
     * Article's Publish Date property
     */
    public static final String ARTICLE_PUBLISH_DATE = "publishDate";

    public static final String ARTICLE_PUBLISH_DATE_FULL = JcrConstants.JCR_CONTENT + SLASH + ARTICLE_PUBLISH_DATE;

    /**
     * Article's Expiration Date property
     */
    public static final String ARTICLE_EXPIRATION_DATE = "expirationDate";

    /**
     * Sling Alias property to be used for translated pages.
     */
    public static final String SLING_ALIAS = "sling:alias";

    public static final Integer PAGE_NAME_MAX_CHARS = 150;

    /**
     * Page's main image property
     */
    public static final String PAGE_MAIN_IMAGE = "imgPath";

    public static final String ARTICLE_TEMPLATE_NAME = "article-page";

    public static final String REDIRECT_TEMPLATE_NAME = "redirect";

    public static final String EVENT_TEMPLATE_NAME = "event-page";

    public static final String TEAMPLATES_BASE_PATH = "/conf/vanilla";

    public static final String ARTICLE_TEMPLATE_PATH = TEAMPLATES_BASE_PATH + ARTICLE_TEMPLATE_NAME;

    public static final String EVENTS_TEMPLATE_PATH = TEAMPLATES_BASE_PATH + EVENT_TEMPLATE_NAME;

    public static final String REDIRECT_TEMPLATE_PATH = TEAMPLATES_BASE_PATH + REDIRECT_TEMPLATE_NAME;


    private Constants() {
    }
}
