package day05;

interface A1{
    void method1();
}
interface B1{
    void method2(int a);
}
interface C1{
    int method3();
}
interface D1{
    double method3(int a, double b);
}

// 메인 클레스
public class Main3 {
    public static void main(String[] args) {
        // 1. 익명이너클래스 방식
        A1 a1 = new A1() {
            @Override
            public void method1() {
                System.out.println("입력값없고, 리턴값 없는 함수 호출");
            }
        };
        a1.method1();
        // 람다식표현
        A1 a2 = ()-> System.out.println("람다식-> 입력값 없고, 리턴값 없는 함수 호출");
        A1 a3 = ()-> {System.out.println("람다식-> 입력값 없고, 리턴값 없는 함수 호출");};
        // 한줄 짜리면 중괄호 생략
        a2.method1();
        a3.method1();

        B1 b1=(int a)-> System.out.println("매개변수: " + a + " 리턴값 없는 함수");
        b1.method2(6);
        B1 b2 = (a)-> System.out.println("매개변수 : " + a + " 리턴값 없는 함수");
        b2.method2(10);
        B1 b3 = a-> System.out.println("매개변수 : " + a + " 리턴값 없는 함수");
        b3.method2(100);

        C1 c1 = ()->{return 5; };
        C1 c2 = ()->4;
        System.out.println(c1.method3());
        System.out.println(c2.method3());

        D1 d1 = (int a, double b)->{return a+b ; };
        D1 d2 = (a, b)->{return a+b ; };
        D1 d3 = (a, b)->a+b;

        System.out.println(d3.method3(10,20));



    } // main
} // main3 class end
