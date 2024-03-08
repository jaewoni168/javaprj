package day02;

public class 문제2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 3;
        method2(p);
        System.out.println(p.age);  // 10
    }

    static void method2(Person p) {
        p.age = 10;
    }
}

class Person {
    String name;
    int age;
}

// 참조를 직접 넘기기 때문에 호출자의 변수와 수신자의 파라미터는 완전 동일한 변수