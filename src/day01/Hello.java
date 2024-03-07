package day01;

// main + enter
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int x = 1;
        int y = 2;
        int result = x + y;
        System.out.println("결과: " + result);

        //변수값 교환
        int a = 100;
        int b = 200;
        System.out.println(a + " , " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " ," + b);
        // printf: 포멧
        System.out.printf("%d\n", 123);           // %d 는 정수형으로 출력하라
        System.out.printf("%5d\n", 123);          // %5d -> 다섯자리
        System.out.printf("%05d\n", 123);         // %05 는 앞에 0을 채워라
        System.out.printf("%f\n", 123.45);        // %f 는 실수형
        System.out.printf("%7.1f\n", 123.45);     //%5.2는 소수점 2자리
        System.out.printf("%s\n", "hi java");     // %s 는 문자형
        System.out.printf("%10s\n", "hi java");   // %10s 는 우측으로 10자리
        System.out.print("welcome");
        System.out.print("to my world\n");
        System.out.print("안녕하세요\n");
        System.out.print("감사합니다.\n");
    }
}