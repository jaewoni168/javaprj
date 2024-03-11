package day03;

public class CallByRef {
    public static void main(String[] args) {
        Person2 p = new Person2();    // Person2를 클릭해서 create class 를 누른다.
        // p -> 인스턴스 변수 / 힙영역(heap)에 저장
        // p-> 스택영역 이다.
        // Person -> 힙 영역 이다.
        p.name = "장동건";
        p.age = 3;
        method12(p);
        System.out.println("main에서 "+p.name);// 강감찬
        // 참조값 전달이기 때문에 method12에 영향을 받는다.
        System.out.println(p.age);   // 200
    }

    private static void method12(Person2 p) {    // private 는 여기 내부에서만 사용 가능
        p.name = "강감찬";
        p.age = 200;
        System.out.println("method: " + p.name);  // 강감찬
        System.out.println("method: " + p.age);  // 200
    }
}
