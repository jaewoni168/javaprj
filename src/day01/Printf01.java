package day01;

public class Printf01 {
    public static void main(String[] args) {

        System.out.printf("Integer : %d\n", 15);

        System.out.printf("Floating point number with 3 decimal digits: %.3f\n", 1.21312939123);

        System.out.printf("Floating point number with 8 decimal digits: %.8f\n\n", 1.21312939123);

        System.out.printf("String: %s, integer: %d, float: %.6f\n\n", "Hello World", 89, 9.231435);

        System.out.printf("%-12s%-12s%s\n", "Column 1", "Column 2", "Column3");

        System.out.printf("%-12d%-12d%07d\n\n", 15, 12, 5);

        System.out.printf("%-8s%12s%12s\n", "Column 1", "Column 2", "Column3");

        System.out.printf("%-8.5s%12d%12.4f\n\n", "Hello World", 1234567, 3.141592);

        System.out.printf("%-12s%-12s\n", "Column 1", "Column 2");

        System.out.printf("%-12.5f%.20f", 12.23429837482, 9.10212023134);

    }

}
// 굳이 Format01.java 처럼 일일이 코딩하고 'sout' 를 하지않고 바로 printf 로 해도 결과에는 아무런 문제가 없다.