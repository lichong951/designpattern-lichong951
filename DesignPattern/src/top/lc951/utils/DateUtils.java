package top.lc951.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 日期工具
 *
 * */
public class DateUtils {
    /*
     * 将时间转换为时间戳
     */
    public static long dateToTimeMillis(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        return date.getTime();
    }

    public static String timeMillis2Date(long selectedTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date(selectedTime);

        return simpleDateFormat.format(date);
    }

    public static String getCurrentDateTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        Date date=new Date();

        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        System.out.println(getCurrentDateTime());
    }
}
