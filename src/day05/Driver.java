package day05;

public class Driver {

    // 매개변수의 다형성 (넣고 싶은 걸 집어 넣는 것)
    public void drive(Vehicle vehicle){   // 운송수단을 받는다.
        // 버스가 들어올 때 checkFare()을 하고싶으면 밑에 코드처럼 한다. (객체타입확인)
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }

    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

        bus.checkFare();

        bus.checkFare();
        // 자동 타입변환
        Vehicle vehicle = new Bus();
        vehicle.run();
//        vehicle.checkFare(); // 은 안된다.

        // 강제 타입변환
        Bus bus2 = (Bus) vehicle;
        bus2.checkFare();


    }
}
