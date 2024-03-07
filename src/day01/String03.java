package day01;

public class String03 {
    public static void main(String[] args) {
        String s0 = "hello world";
        String s1 = "HELLO WORLD";
        String s2 = s0;
        String s3 = s1.toLowerCase();

        boolean b0 = (s0 == s2);             //
        boolean b1 = (s0 == s3);
        boolean b2 = s0.equals(s2);
        boolean b3 = s0.equals(s3);
        System.out.printf("%b %b %b %b\n", b0, b1, b2, b3);

        boolean b4 = s0.equals(s1);                // 대소문자를 구별하고 비교해서 false
        boolean b5 = s0.equalsIgnoreCase(s1);      // 대소문자를 구별하지 않고 비교해서 true
        System.out.printf("%b %b\n", b4, b5);
    }
}
