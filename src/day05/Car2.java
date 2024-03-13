//문제1
package day05;

public class Car2 {
    class Tire{}
    static class Engine{}

    public static void main(String[] args) {
        Car2 myCar2 = new Car2();
        Car2.Tire tire = myCar2.new Tire();

        Car2.Engine engine = new Car2.Engine();
    }
}
