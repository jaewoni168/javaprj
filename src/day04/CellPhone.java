package day04;

public class CellPhone {
    String model;
    String color;

    public CellPhone(){
        System.out.println("부모 클래스를 호출합니다.");
    }

    public CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("오버로딩된 부모 생성자 호출합니다.");
    }

    void powerOn() {
        System.out.println("전원을 겹니다.");
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    void bell() {
        System.out.println("벨이 울립니다.");
    }
    void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    void reveiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }


}
