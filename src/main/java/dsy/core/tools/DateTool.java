package dsy.core.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author dong
 * @since 18-11-1
 */
public class DateTool {


    public static Date getCurrentDay() {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE , 0);

        return calendar.getTime();
    }

    public static long getCurrentDayTimestamp() {
        return getCurrentDay().getTime();
    }

    public static String getCurrentDayStr() {

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");

        Date date = getCurrentDay();

        return sm.format(date);
    }

}
