package day02;

public class 문제4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = s2.toLowerCase();

        System.out.println(s1 == s3);        // false: s1과 s3는 서로 다른 메모리 주소이기 때문에 글이 같아도 false
        System.out.println(s1.equals(s3));   // true : .equals()를 통해 강제 타입 변환을 시키면서 같은 주소로 되서 true
    }
}
