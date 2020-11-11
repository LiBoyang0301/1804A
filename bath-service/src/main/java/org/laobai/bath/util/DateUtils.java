package org.laobai.bath.util;

import java.text.SimpleDateFormat;
import java.util.Date;

// 日期工具类
public final class DateUtils {
    // 格式化时间
    public static  String toString(Date date){
        return  new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}
