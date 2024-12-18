package com.vanilla.core.models;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;

import com.vanilla.core.models.ImageUtils;
import com.vanilla.core.models.PageUtils;

@Model(adaptables = SlingHttpServletRequest.class)
public class ImageModel {

    @RequestAttribute(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String originalImgPath = "";

    @RequestAttribute(injectionStrategy = InjectionStrategy.OPTIONAL)
    private boolean bypassEncoding = false;

    private String smallImgPath = "";

    private String mediumImgPath = "";

    private String largeImgPath = "";

    private String avatarImgPath = "";

    private String square200ImgPath = "";

    @PostConstruct
    public void init() {
        if (!StringUtils.isEmpty(originalImgPath)) {
            if (!bypassEncoding) {
                originalImgPath = PageUtils.encodeFilename(originalImgPath);
            }
            smallImgPath = ImageUtils.getSmallImagePath(originalImgPath);
            mediumImgPath = ImageUtils.getMediumImagePath(originalImgPath);
            largeImgPath = ImageUtils.getLargeImagePath(originalImgPath);
            avatarImgPath = ImageUtils.getAvatarImagePath(originalImgPath);
            square200ImgPath = ImageUtils.getSquare200ImagePath(originalImgPath);
        }
    }

    public String getOriginalImgPath() {
        return originalImgPath;
    }

    public String getSmallImgPath() {
        return smallImgPath;
    }

    public String getMediumImgPath() {
        return mediumImgPath;
    }

    public String getLargeImgPath() {
        return largeImgPath;
    }

    public String getAvatarImgPath() {
        return avatarImgPath;
    }

    public String getSquare200ImgPath() {
        return square200ImgPath;
    }

}
