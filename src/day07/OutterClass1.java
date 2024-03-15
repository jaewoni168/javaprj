// inner class: 어떤 클래스 내부에 정의된 클래스를 inner class 라고 부른다.
//class OutterClass {
//    class InnerClass {
//
//    }
//}
package day07;

public class OutterClass1 {
    int a;
    class InnerClass1{
        int b;
        void method2(){
            b=5;
            this.b = 6;
            a = 7;
//            OutterClass1.this.a = a;
//            instanceMethod();
//            OutterClass1.this.instanceMethod();
//             this.instanceMethod();    // 컴파일 에러
            main(null);
        }
    }
    public void instanceMethod(){
        InnerClass1 obj = new InnerClass1();
        a = 1;
        this.a = 2;
        obj.method2();
    }

    public static void main(String[] args) {
        OutterClass1 o = new OutterClass1();
        o.instanceMethod();
    }
}