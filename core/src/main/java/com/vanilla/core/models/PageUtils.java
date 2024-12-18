package com.vanilla.core.models;

import static com.vanilla.core.models.Constants.TEAMPLATES_BASE_PATH;
import static com.vanilla.core.models.Constants.DEFAULT_LANGUAGE;
import static com.vanilla.core.models.Constants.LANGUAGE_PH;
import static com.vanilla.core.models.Constants.LANG_ROOT_LEVEL;
import static com.vanilla.core.models.Constants.SITE_ROOT_LEVEL;
import static com.vanilla.core.models.Constants.SLASH;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.settings.SlingSettingsService;

import com.day.cq.commons.Externalizer;
import com.day.cq.wcm.api.Page;
//import com.github.slug.Slugify;
import com.google.common.base.Strings;
import com.google.common.net.UrlEscapers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(PageUtils.class);

    private static final String BLOG_REGEX = "\\/content\\/commercial\\/([a-z]{2})\\/insights\\/blog\\/.*";
    private static final String INSIGHT_ARTICLE_REGEX = "\\/content\\/commercial\\/([a-z]{2})\\/insights\\/(.*?)\\/.*";
    private static final String NEWSROOM_REGEX = "\\/content\\/corporate\\/([a-z]{2})\\/(newsroom|sala-de-prensa)\\/.*";
    public static final String HTML_TITLE_PROP = "htmlTitle";
    public static final String NAV_TITLE_PROP = "navTitle";

    private PageUtils() {
    }

    public static Page getSiteRoot(Page currentPage) {
        return currentPage.getAbsoluteParent(SITE_ROOT_LEVEL);
    }

    public static Page getLanguageRoot(Page currentPage) {
        return currentPage.getAbsoluteParent(LANG_ROOT_LEVEL);
    }

    public static String getSiteName(String pagePath) {
        return pagePath.split(SLASH)[2];
    }

    public static String getSiteLang(String pagePath) {
        return pagePath.split(SLASH)[3];
    }

    private static boolean startsWith(String pagePath, String rootPath) {
        if (pagePath != null) {
            return pagePath.startsWith(rootPath);
        } else {
            return false;
        }
    }


    public static boolean isHomePage(Page page) {
        if (page != null) {
            return LANG_ROOT_LEVEL == (page.getDepth() - 1);
        } else {
            return false;
        }
    }

    public static Boolean isBlogPage(String path) {
        return !Strings.isNullOrEmpty(path) && path.matches(BLOG_REGEX);
    }

    public static boolean isInsightArticle(String path) {
        return !Strings.isNullOrEmpty(path) && path.matches(INSIGHT_ARTICLE_REGEX);
    }

    public static boolean isNewsroom(String path) {
        return !Strings.isNullOrEmpty(path) && path.matches(NEWSROOM_REGEX);
    }

    public static String getLocalizedPath(String path, Locale locale) {
        if (locale != null) {
            return path.replace(LANGUAGE_PH, locale.getLanguage().toLowerCase());
        } else {
            return path.replace(LANGUAGE_PH, DEFAULT_LANGUAGE);
        }
    }

    public static String encodeFilename(String path) {
        if (path != null) {
            String filename = path.substring(path.lastIndexOf('/') + 1);
            return path.replace(filename, UrlEscapers.urlPathSegmentEscaper().escape(filename));
        }
        return "";
    }

    public static Boolean isPublishRunmode(SlingSettingsService slingSettingsService) {
        Set<String> runmodes = slingSettingsService.getRunModes();
        return runmodes.contains(Externalizer.PUBLISH);
    }
    
    public static Boolean isProd(SlingSettingsService slingSettingsService) {
        Set<String> runmodes = slingSettingsService.getRunModes();
        return runmodes.contains("prod");
    }

    public static Boolean isAuthorRunmode(SlingSettingsService slingSettingsService) {
        return !isPublishRunmode(slingSettingsService);
    }

    public static Boolean isPreviewMode(SlingHttpServletRequest request) {
        String preview = request.getHeader("Preview");
        return preview != null;
    }

    public static Boolean isTemplate(Page page) {
        return page != null && page.getPath().startsWith(TEAMPLATES_BASE_PATH);
    }

    public static int hashString(String string) {
        return string.hashCode();
    }

    private static boolean isRomanLanguage(String lang) {
        return Arrays.asList(Constants.ROMAN_LANGUAGES).indexOf(lang ) > -1;
    }

    public static String getURLReadyString(String title, String lang) {
        String result = "";
        if (isRomanLanguage(lang)) {
            //Slugify slg = new Slugify();
            //result = slg.slugify(title);

        } else {
            result = Normalizer.normalize(title.trim().toLowerCase(), Normalizer.Form.NFKC);
            result = result.replaceAll(Constants.SPECIAL_URL_CHARACTERS_PATTERN, " ");
            result = result.trim().replaceAll(" ", "-");
            for (Map.Entry<String, String> entry:Constants.SPECIAL_URL_CHARACTERS_MAP.entrySet()) {
                result = result.replaceAll(entry.getKey(), entry.getValue());
            }
        }
        if (result.length() > Constants.PAGE_NAME_MAX_CHARS) {
            result = result.substring(0, Constants.PAGE_NAME_MAX_CHARS);
            if (result.contains("-")) {
                return result.substring(0, result.lastIndexOf('-'));
            }
            return result;
        }
        return result;
    }

    public static String getPageTitle(Page page) {
        String htmlTitle = page.getProperties().get(HTML_TITLE_PROP, String.class);
        if (!StringUtils.isEmpty(htmlTitle)) {
            return htmlTitle;
        }
        
        String navTitle = page.getProperties().get(NAV_TITLE_PROP, String.class);
        if (!StringUtils.isEmpty(navTitle)) {
            return navTitle;
        }
        
        String pageTitle = page.getPageTitle();
        if (!StringUtils.isEmpty(pageTitle)) {
            return pageTitle;
        }
        
        String title = page.getTitle();
        if (!StringUtils.isEmpty(title)) {
            return title;
        }
        return "";
    }
}
