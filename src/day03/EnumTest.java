package day03;

import java.util.Calendar;

public class EnumTest {
    public static void main(String[] args) {
        Week today = null;

//        자바에서 날짜를 얻을 수 있는 방법은 1. new Date()  2. new Calender 가 있다.
        Calendar cal = Calendar.getInstance(); // 싱글톤 패턴이다. 아직 안배웠지만 알고 있기.패턴이란 말이 있으면 그냥 외워라
        int week = cal.get(Calendar.DAY_OF_WEEK);  // 1~7

        System.out.println(week);    // 0이면 1 / 1이면 2024 / 2면 2 /  Calendar.DAY_OF_WEEK 면 2(2는 월요일이다.)

        switch (week){
            case 1:
            today=Week.SUNDAY; break;
            case 2:
                today=Week.MONDAY; break;
            case 3:
                today=Week.TUESDAY; break;
            case 4:
                today=Week.WEDNESDAY; break;
            case 5:
                today=Week.THURSDAY; break;
            case 6:
                today=Week.FRIDAY; break;
            case 7:
                today=Week.SATURDAY; break;
        }
        System.out.println("오늘은 무슨요일? " + today);  //MONDAY

    }
}
