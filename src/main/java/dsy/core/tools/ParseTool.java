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
}
