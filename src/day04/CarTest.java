package day04;

import day04.hankook.Tire;
import day04.hyndai.Engine;
import day04.mycompany.Car;
import day04.kumho.BigTire;


public class CarTest {
    public static void main(String[] args) {
//        Car car1 = new Car();
        Tire tire = new Tire();     // 한국타이어를 장착하였습니다.
        Tire tire2 = new Tire("금호타이어");   // 금호타이어를 장착하였습니다.

        System.out.println(tire.toString());   // 한국타이어를 장착하였습니다.
        System.out.println(tire2.toString());  // 금호타이어를 장착하였습니다.

        tire.printTire();  // 한국타이어를 장착하였습니다.
        tire2.printTire(); // 금호타이어를 장착하였습니다.
        System.out.println("==============================");
        Car car1 = new Car("현다이");
        car1.company = "현대자동차";

        System.out.println(car1.company);

        car1.setCompany("현대자동차");

        Tire tire1 = new Tire("아시아나");
        Engine engine = new Engine();
        BigTire bigTire = new BigTire();

        System.out.println("=============================");
        Car car2 = new Car("기아", engine, tire, bigTire);
        System.out.println("=============================");

        System.out.println(car2.getSpeed());
        car2.setSpeed(100);
        System.out.println(car2.getSpeed());
        car2.setSpeed(-100);
        System.out.println(car2.getSpeed());


    }
}
