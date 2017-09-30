package cn.greeston.utils;

import org.apache.commons.lang3.StringUtils;

/***
 * 
 */
public final class StringUtil {

    /**
     * <p>校验字符串 is empty ("") or null.</p>
     * <pre>
     * StringUtil.isEmpty(null) = true
     * StringUtil.isEmpty("") = true
     * StringUtil.isEmpty(" ")  = false
     * StringUtil.isEmpty("abc") = false
     * </pre>
     * @author Lay
     * @param str 需要判断是否为空的字符串
     * @return {@code true} 当字符串为空 is empty or null
     * @since
     */
    public static boolean isEmpty(String str){
        return StringUtils.isEmpty(str);
    }
    
    public static boolean isNotEmpty(String str){
        return StringUtils.isNotEmpty(str);
    }
    /**
     * <pre>
     * StringUtil.trimToEmpty(null)          = ""
     * StringUtil.trimToEmpty("")            = ""
     * StringUtil.trimToEmpty("     ")       = ""
     * StringUtil.trimToEmpty("abc")         = "abc"
     * StringUtil.trimToEmpty("    abc    ") = "abc"
     * </pre>
     */
    public static String trimToEmpty(final String str){
        return StringUtils.trimToEmpty(str);
    }
    
    /***
     * 
     * @author Lay
      * <pre>
     * StringUtil.equals(null, null)   = true
     * StringUtil.equals(null, "abc")  = false
     * StringUtil.equals("abc", null)  = false
     * StringUtil.equals("abc", "abc") = true
     * StringUtil.equals("abc", "ABC") = false
     * </pre>
     */
    public static boolean equals(final CharSequence cs1, final CharSequence cs2){
        return StringUtils.equals(cs1, cs2);
    }
    
    /***
     * <pre>
     * StringUtils.equalsIgnoreCase(null, null)   = true
     * StringUtils.equalsIgnoreCase(null, "abc")  = false
     * StringUtils.equalsIgnoreCase("abc", null)  = false
     * StringUtils.equalsIgnoreCase("abc", "abc") = true
     * StringUtils.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     * @author Lay
     */
    public static boolean equalsIgnoreCase(final CharSequence str1, final CharSequence str2){
        return StringUtils.equalsIgnoreCase(str1, str2);
    }
    /**
     * <pre>
     * StringUtils.contains(null, *)     = false
     * StringUtils.contains(*, null)     = false
     * StringUtils.contains("", "")      = true
     * StringUtils.contains("abc", "")   = true
     * StringUtils.contains("abc", "a")  = true
     * StringUtils.contains("abc", "z")  = false
     * </pre>
     */
    public static boolean contains(final CharSequence seq, final CharSequence searchSeq) {
        return StringUtils.contains(seq, searchSeq);
    }
    
    public static String subString(){
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(StringUtils.substringBeforeLast("1111-222-33", "-"));;
        System.out.println(StringUtils.substringAfterLast("1111-222-33", "-"));;
        System.out.println();
    }
    /**
     * <pre>
     * StringUtils.substringBeforeLast(null, *)      = null
     * StringUtils.substringBeforeLast("", *)        = ""
     * StringUtils.substringBeforeLast("abcba", "b") = "abc"
     * StringUtils.substringBeforeLast("abc", "c")   = "ab"
     * StringUtils.substringBeforeLast("a", "a")     = ""
     * StringUtils.substringBeforeLast("a", "z")     = "a"
     * StringUtils.substringBeforeLast("a", null)    = "a"
     * StringUtils.substringBeforeLast("a", "")      = "a"
     * </pre>
     * @author Lay
     * @param str
     * @param separator
     */
    public static String substringBeforeLast(final String str, final String separator){
        return StringUtils.substringBeforeLast(str, separator);
    }
    /**
     * <pre>
     * StringUtils.substringAfterLast(null, *)      = null
     * StringUtils.substringAfterLast("", *)        = ""
     * StringUtils.substringAfterLast(*, "")        = ""
     * StringUtils.substringAfterLast(*, null)      = ""
     * StringUtils.substringAfterLast("abc", "a")   = "bc"
     * StringUtils.substringAfterLast("abcba", "b") = "a"
     * StringUtils.substringAfterLast("abc", "c")   = ""
     * StringUtils.substringAfterLast("a", "a")     = ""
     * StringUtils.substringAfterLast("a", "z")     = ""
     * </pre>
     * @author Lay
     * @param str
     * @param separator
     * @return
     * @since
     */
    public static String substringAfterLast(final String str, final String separator){
        return StringUtils.substringAfterLast(str, separator);
    }
}
