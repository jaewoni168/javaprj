package day07;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DatePrint {
    public static void main(String[] args) {
        // Date
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println( sdf.format(now) );

        // Calendar
        Calendar now1 = Calendar.getInstance();

        int year = now1.get(Calendar.YEAR);

        int month = now1.get(Calendar.MONTH) + 1;
        String strMonth = (month<10)? ("0"+month) : (""+month);

        int dayOfMonth = now1.get(Calendar.DAY_OF_MONTH);
        String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);

        String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
        int dayOfWeek = now1.get(Calendar.DAY_OF_WEEK);
        String strDayOfWeek = dayArray[dayOfWeek-1] + "요일";

        int hour = now1.get(Calendar.HOUR_OF_DAY);
        String strHour = (hour<10)? ("0"+hour) : (""+hour);

        int second = now1.get(Calendar.SECOND);
        String strSecond = (second<10)? ("0"+second) : (""+second);

        System.out.print(year + "년 ");
        System.out.print(strMonth + "월 ");
        System.out.print(strDayOfMonth + "일 ");
        System.out.print(strDayOfWeek + " ");
        System.out.print(strHour + "시 ");
        System.out.print(strSecond + "분 ");
    }
}
