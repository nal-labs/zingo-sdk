package com.zingo.utils;

/**
 * @author manta
 * @since 2024/12/5
 */
public class StringUtils {


    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }


    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }


    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}

