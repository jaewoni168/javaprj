package day05;

interface AAA{
    void abc();
}
class BBB {
    void bcd() {
        System.out.println("BBB 에 bcd 메소드 호출");
    }
}

public class LamdaExpression {
    public static void main(String[] args) {
        AAA a=new AAA(){
            @Override
            public void abc() {
                BBB b=new BBB();
                b.bcd();
            }
        };
        a.abc();

        // 람다식
        AAA a1=()->{
            BBB b=new BBB();
            b.bcd();
        };
        a.abc();
        // 정의된 인스턴스 메소드 참조
        BBB b=new BBB();
        AAA a3=b::bcd;   // a3은 b 타입이고 bcd

        a3.abc();

        F f1 = new F() {
            @Override
            public void abc(int k) {
                System.out.println("입력받은 값: " + k);
            }
        };
        f1.abc(100);

        // 람다식
        F f2=k -> System.out.println("입력받은 값: " + k);
        f2.abc(500);
        // 인스턴스 메소드 참조
        F f3 = System.out::println;
        f3.abc(1000);

        F g1 = new F() {
            @Override
            public void abc(int k) {
                G.bcd(700);
            }
        };
        g1.abc(10);

        // 람다식
        F g2=(int k)->G.bcd(500);
        g2.abc(500);

        // 정적메소드 참조
        F g3=G::bcd;    // 객체는 G:: 메소드는 bcd  F 는 타입
        g3.abc(600);

        ZZZ z1 = new ZZZ() {
            @Override
            public void abc(XXX b, int k) {
                b.bcd(k);
            }
        };
        z1.abc(new XXX(), 500);

        // 람다식
        ZZZ z2 = (XXX c,int k)-> c.bcd(k);
        z2.abc(new XXX(), 333);

        // 인스턴스 메소드 참조
        ZZZ z3 = XXX::bcd;
        XXX x=new XXX();
        z3.abc(x,444);


    } // main
}// 클래스 끝

interface ZZZ{
    void abc(XXX b, int k);
}

class XXX{
    void bcd(int k){
        System.out.println(k + "를 받고 처리함");
    }
}

interface F{
    void abc(int k);
}

class G{
    static void bcd(int k){
        System.out.println(k + " 받고 G클래스에 정적 Bcd 호출");
    }
}