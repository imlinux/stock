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

        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE , 0);

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

}
