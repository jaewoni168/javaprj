package day02;

public class 문제3 {
    public static void main(String[] args) {
        String s = "hello";
        method3(s);
        System.out.print(s);     // hello
    }
    static void method3(String s) {
        s = "hi";
        System.out.println(s);   // hi
    }
}

// 문제 1번과 같은 이유로 서로 다른 변수라서 영향이 없다.
