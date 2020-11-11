package org.laobai.bath.util;

// 字符串工具类
public final class StringUtils {
    // 字符串是否为空
    public static boolean isEmpty(String str){
        return str==null||"".equals(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
