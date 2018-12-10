package dsy.core.tools;

/**
 * @author dong
 * @since 18-11-3
 */
public class ParseTool {

    public static double parseDouble(Object o) {
        try {
            return Double.parseDouble(o.toString());
        }catch (Exception e) {
            return 0;
        }
    }


    public static int parseInteger(Object o) {
        try {
            return Integer.parseInt(o.toString());
        }catch (Exception e) {
            return 0;
        }
    }


    public static long parseLong(Object o) {
        try {
            return Long.parseLong(o.toString());
        }catch (Exception e) {
            return 0;
        }
    }
}
