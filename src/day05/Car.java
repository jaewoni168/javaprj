package day05;

public class Car {
    // 필드의 다형성
    Tire tire1 = new HankookTire();    //; tire1 은 Tire 타입이다.
    Tire tire2 = new HankookTire();
    Tire tire3 = new HankookTire();
    Tire tire4 = new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
        tire3.roll();
        tire4.roll();
    }
// 테스트
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}