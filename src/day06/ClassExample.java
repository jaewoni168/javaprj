// 보통 외부 다이어리를 가져올 때 사용

package day06;

public class ClassExample {



    public static void main(String[] args) throws
        ClassNotFoundException {
            // how1
            Class clazz = Car.class;

            // how2
            Class clazz2 = Class.forName("day06.Car");

            // how3
            Car car = new Car();
            Class clazz3 = car.getClass();

            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getPackage().getName());

            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());

            System.out.println(clazz3.getName());
            System.out.println(clazz3.getSimpleName());
            System.out.println(clazz3.getPackage().getName());

        }
    }
    class Car{
    }
