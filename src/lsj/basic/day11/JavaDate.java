package lsj.basic.day11;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class JavaDate {
    public static void main(String[] args) {
        // get time and date in java

        Date d = new Date();
        System.out.println(d.toString());
        String fmt = "%d년 %d월 %d일 %d시 %d분 %d\n";
        System.out.printf(fmt, d.getYear() + 1900, d.getMonth() + 1, d.getDate(),
                d.getHours(), d.getMinutes(), d.getMinutes());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.printf(fmt, c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
                c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR_OF_DAY),
                c.get(Calendar.MINUTE), c.get(Calendar.SECOND));

        // 일요일 : 1, 월요일 : 2, .... , 토요일 : 7
        System.out.println("오늘은 " + c.get(Calendar.DAY_OF_WEEK) + "요일 입니다.");

        // 오늘 기준 5일 후 날짜 (add method)
        c.add(Calendar.DATE, 5);
        //System.out.println(c.getTime());

        c.add(Calendar.MONTH, 10);

        System.out.println(c.getTime());

        // SimpleDateFormat
        // customize date formats depends on user's taste
        fmt = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);

        System.out.println(sdf.format(d));

        c = Calendar.getInstance();
        System.out.println(sdf.format(c.getTime()));

        // jodatime added in JDK8
        // java.time package
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);
    }
    
}
