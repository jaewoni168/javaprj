package day01;

public class 기본자료형 {
    static void sub(String a){
        a=a.toUpperCase();
        System.out.println(a);  //
    }

    public static void main(String[] args) {
        int a=3;
        f1(a);
        System.out.printf("%d\n",a);   // 답: 3

        기본자료형 fn= new 기본자료형();
        fn.f2(10);

        String s="welcome";
        sub(s);
        System.out.println(s);

//        alt+ insert -> override method

    } // main

//   정적인 멤버 메소드
    static void f1(int a){
        ++a;
        System.out.printf("%d\n",a);   // 답: 4
    } // class

//    일반 멤버 메소드
    void f2(int b){
        ++b;
        System.out.printf("%d\n", b);  // 답: 11
    }
}
