package day04;

public class MyClass {
    // 필드
    RemoteControl rc = new Television();

    // 생성자
     MyClass(){
     }

     // 생성자의 매개값으로 구현 객체 대입
     MyClass(RemoteControl rc) {
         this.rc = rc;
         rc.turnOn();
         rc.setVolume(5);
     }

     // 메소드
    void methodA(){
         // 로컬변수
         RemoteControl rc = new Audio();
         rc.turnOn();
         rc.setVolume(5);
    }

    // 메소드의 매개값으로 구현객체 대입
    void methodB(RemoteControl rc) {
         rc.turnOn();
         rc.setVolume(5);
    }
}
