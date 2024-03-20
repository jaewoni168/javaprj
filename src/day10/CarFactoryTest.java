package day10;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car hyundai = factory.createCar();
        Car kia = factory.createCar();
        Car kia2 = factory.createCar();

        System.out.println(hyundai.getCarNum());  // 10001
        System.out.println(kia.getCarNum());      // 10002
        System.out.println(kia2.getCarNum());      // 10003
    }
}
