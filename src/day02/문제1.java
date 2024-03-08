package day02;

public class 문제1 {
    public static void main(String[] args) {
        int a = 3;
        method1(a);
        System.out.print(a);   // 3
    }

    public static void method1(int a){
        a=20;
        System.out.println(a);   // 20
    }
}
// 서로 다른 변수라서 영향이 없다.
