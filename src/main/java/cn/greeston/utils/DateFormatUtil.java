package cn.greeston.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
/***
 * 日期格式化工具
 * @author Lay
 * @date 2017年9月6日 下午1:27:56
 * @since
 */
public final class DateFormatUtil {

    /**
     * 年-月-日 时:分:秒  24小时制 yyyy-MM-dd HH:mm:ss
     */
    public static final String PATTERN_NORMAL = "yyyy-MM-dd HH:mm:ss";
    
    /**
     * 年-月-日 yyyy-MM-dd
     */
    public static final String PATTERN_SIMPLE = "yyyy-MM-dd";
    
    /**
     * 年-月-日 时《两位年》yy-MM-dd HH
     */
    public static final String PATTERN_MONITOR_TIME = "yy-MM-dd HH";

    /**
     * 年-月-日 时《四位年》 yyyy-MM-dd HH
     */
    public static final String PATTERN_FULL_HOUR = "yyyy-MM-dd HH";

    /**
     * 年-月-日 时:分 yyyy-MM-dd HH:mm
     */
    public static final String PATTERN_MINUTES = "yyyy-MM-dd HH:mm";
    /**
     * 年-月-日 时:分:秒 毫秒 yyyy-MM-dd HH:mm:ss S
     */
    public static final String PATTERN_FULL = "yyyy-MM-dd HH:mm:ss S";

    /**
     * 年月日时分秒 yyyyMMddHHmmss
     */
    public static final String PATTERN_FULL_SIMPLE = "yyyyMMddHHmmss";

    /**
     * 年月日 yyyyMMdd
     */
    public static final String PATTERN_FULL_DAY = "yyyyMMdd";

    /**
     * 月日年 MMddyy
     */
    public static final String PATTERN_MONTH_DAY = "MMddyy";

    /**
     * 日月年 ddMMyyyy
     */
    public static final String PATTERN_REVERSE_DAY = "ddMMyyyy";

    /**
     * 年月日时分秒四位毫秒 yyyyMMddHHmmssSSSS
     */
    public static final String SSSS = "yyyyMMddHHmmssSSSS";

    /**
     * 年月日时分秒三位毫秒 yyyyMMddHHmmssSSS
     */
    public static final String PATTERN_SSS = "yyyyMMddHHmmssSSS";
    /** HHmmss */
    public static final String PATTERN_FULL_TIME = "HHmmss";
    /** HH:mm:ss */
    public static final String PATTERN_SIMPLE_TIME = "HH:mm:ss";
    /** yyMMdd */
    public static final String PATTERN_SIMPLE_DATE = "yyMMdd";
    /** HH:mm.ss */
    public static final String PATTERN_SIMPLE_TIME1 = "HH:mm.ss";
    /** yyyyMMdd HH:mm:ss */
    public static final String PATTERN_SIMPLE_TIME2 = "yyyyMMdd HH:mm:ss";
    /** HHmmss-SSS*/
    public static final String PATTEN_SIMPLE_TIMESS = "HHmmss-SSS";
    /** HHmm*/
    public static final String PATTEN_SIMPLE_HOURMIN = "HHmm";
    /**年月日时分   yyyyMMddHHmm*/
    public static final String PATTERN_DAYMIN_SIMPLE = "yyyyMMddHHmm";
    
    public static String format(final Date date, final String pattern) {
        return DateFormatUtils.format(date, pattern);
    }

    public static String format(final Calendar calendar, final String pattern) {
        return DateFormatUtils.format(calendar, pattern);
    }

    /**字符串转换为日期*/
    public static Date parse(final String date, final String pattern) throws ParseException {
        return DateUtils.parseDate(date, pattern);
    }
}
