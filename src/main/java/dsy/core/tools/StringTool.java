package dsy.core.tools;

import org.springframework.util.StringUtils;

/**
 * @author dong
 * @since 18-11-2
 */
public class StringTool {

    public static String objectToString(Object o) {
        if(o == null) {
            return "";
        } else {
            return o.toString();
        }
    }

    public static boolean isEmpty(Object o) {
        return StringUtils.isEmpty(o);
    }
}
