package day03;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result = cal.add(30,50);
        System.out.println(result);    // 80

        Double result2=cal.divide(123.23,5.0);
        System.out.println(result2);  // 24.646

        int result3 = cal.minus(30,50);
        System.out.println(result3);  // -20

        int result4 = cal.mul(3,5);
        System.out.println(result4);  // 15
    }
}
