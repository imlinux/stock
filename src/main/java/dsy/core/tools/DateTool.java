package dsy.core.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author dong
 * @since 18-11-1
 */
public class DateTool {


    public static Date getDay(Date date) {
        Calendar calendar = Calendar.getInstance();

        String str = getDayStr(date);

        try {
            calendar.setTime(parse(str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return calendar.getTime();
    }

    public static Date getCurrentDay() {
        return getDay(new Date());
    }

    public static long getCurrentDayTimestamp() {
        return getCurrentDay().getTime();
    }

    public static String getCurrentDayStr() {

        Date date = getCurrentDay();

        return getDayStr(date);
    }

    public static String getDayStr(Date date, String pattern) {
        SimpleDateFormat sm = new SimpleDateFormat(pattern);

        return sm.format(date);
    }
    public static String getDayStr(Date date) {
        return getDayStr(date, "yyyy-MM-dd");
    }


    public static Date parse(String date) throws Exception {

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");

        return sm.parse(date);
    }
}
