package day05_1;

interface A {void abc(double k);};
interface B { int abc(String str);};

public class Test {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void abc(double k) {
                System.out.println(k+0.5);
            }
        };
        a.abc(3.8);

        // 람다식
        A a1 = k-> System.out.println(k+0.5);
        a1.abc(5);
        B a2=str->str.length();
        System.out.println(a2.abc("welcome"));
        //익명내부클래스
        B b3=new B() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };
        System.out.println(b3.abc("welcome"));
    }
}
