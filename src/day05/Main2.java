package day05;

interface AA{   // 추상 메소드는 하나만 사용 가능
    void abc();
}

class BB implements AA{
    @Override
    public void abc() {
        System.out.println("B클래스에서 abc메소드 실행함");
    }
}

public class Main2 {
    public static void main(String[] args) {
    // 객체지향프로그램 문법 1
    AA a1 = new BB();
    a1.abc();

    // 객체지향프로그램 문법 2(익명 이너클래스 사용
    AA a2 = new AA() {
        @Override
        public void abc() {
            System.out.println("익명이너클래스로 메소드 호출함");
        }
    };
    a2.abc();

    // 함수형 프로그램문법(람다식)
         AA a3 =()->{
             System.out.println("람다식으로 메소드 호출함");
            };
        a3.abc();




    } //
} //
