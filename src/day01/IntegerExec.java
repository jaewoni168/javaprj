package day01;

public class IntegerExec {
    public static void main(String[] args) {
        // 정수 리터럴(type= 정수(literal))
        int var1=0b1011;  //2진수  0b or 0B 로 시작하고 0과 1로 구성
        int var2=010; // 8진수    0으로 시작하고 0~7 숫자로 구성
        int var3=123; // 10진수   소수점이 없는 0~7 숫자로 구성
        int var4=0xA; // 16진수 0x or 0X로 시작하고 0~9숫자와 A,B,C,D,E,F OR 소문자로 구성  ex) 9 A B C D E 면 각각 9 10 11 12 13 14로 인식된다.
        System.out.println("var1: " + var1);    // 답: 11
        System.out.println("var2: " + var2);    // 답: 8
        System.out.println("var3: " + var3);    // 답: 123
        System.out.println("var4: " + var4);    // 답: 10

        byte a=-128;
        byte b=127;
        System.out.println(b);
        long c=10;
        long d=20L;
        System.out.println("c: " + c);
        System.out.println("d: " + d);  // L을 붙이나 안붙이나 똑같다.

        long var5=100000000000000L;     // 범위를 넘어섰을 때 뒤에 L을 붙이면 된다.
        System.out.println("var5: " + var5);

    }
}
