// 강제 타입 변환
package day04;
public class ChildTest {
    public static void main(String[] args) {
//    parent.field2 = "data2";    // 불가능
//    parent.method3();           // 불가능

        Parent p1 = new Parent();
        p1.method2();

        Child c1 = new Child();
        c1.method2();

        Parent p2 = new Child(); // 자동타입변환
        p2.method2();

        Child c2 = (Child) p2;
        c2.method3();
        // Child c3 = new Parent();  // 불가능
//        p2가 Child 를 참조하는지?
        if(p2 instanceof Child){
            Child c4 = (Child) p2;
        }

    }
}
