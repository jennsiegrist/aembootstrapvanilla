package com.vanilla.core.models;

import org.apache.commons.lang3.StringUtils;

public class ImageUtils {
    
    public static final String SMALL_TRANSFORMER = ".transform/small/img.";
    public static final String MEDIUM_TRANSFORMER = ".transform/medium/img.";
    public static final String LARGE_TRANSFORMER = ".transform/large/img.";
    public static final String AVATAR_TRANSFORMER = ".transform/avatar/img.";
    public static final String SQUARE200_TRANSFORMER = ".transform/square-200/img.";
    public static final String SVG_EXTENSION = "svg";

    private ImageUtils() {
    }

    /**
     * Return the path to the small size version of the image using ACS Commons
     * Image Transformer.
     * 
     * @param originalImgPath
     * @return
     */
    public static String getSmallImagePath(String originalImgPath) {
        return getTransformedImagePath(originalImgPath, SMALL_TRANSFORMER);
    }

    /**
     * Return the path to the medium size version of the image using ACS Commons
     * Image Transformer.
     * 
     * @param originalImgPath
     * @return
     */
    public static String getMediumImagePath(String originalImgPath) {
        return getTransformedImagePath(originalImgPath, MEDIUM_TRANSFORMER);
    }

    /**
     * Return the path to the large size version of the image using ACS Commons
     * Image Transformer.
     * 
     * @param originalImgPath
     * @return
     */
    public static String getLargeImagePath(String originalImgPath) {
        return getTransformedImagePath(originalImgPath, LARGE_TRANSFORMER);
    }

    /**
     * Return the path to the square-200 size version of the image using ACS Commons
     * Image Transformer.
     * 
     * @param originalImgPath
     * @return
     */
    public static String getSquare200ImagePath(String originalImgPath) {
        return getTransformedImagePath(originalImgPath, SQUARE200_TRANSFORMER);
    }

    /**
     * Return the path to the avatar size version of the image using ACS Commons
     * Image Transformer.
     *
     * @param originalImgPath
     * @return
     */
    public static String getAvatarImagePath(String originalImgPath) {
        return getTransformedImagePath(originalImgPath, AVATAR_TRANSFORMER);
    }

    private static String getTransformedImagePath(String originalImgPath, String transformer) {
        String path = originalImgPath;
        if (!StringUtils.isEmpty(originalImgPath)) {
            String extension = originalImgPath.substring(originalImgPath.lastIndexOf('.') + 1);
            if (!SVG_EXTENSION.equalsIgnoreCase(extension)) {
                path = originalImgPath + transformer + extension;
            }
        }
        return path;
    }
}
