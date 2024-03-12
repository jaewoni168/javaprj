package day04;

public class DmbCellPhone extends CellPhone {
    int channel;

    public DmbCellPhone(String model, String color, int channel) {
//        super(); // 부모 생성자 호출  // 부모변수는 1개만 가능함
        super(model, color);
        this.channel = channel;
        this.model = model;
        this.color = color;
    }

    // 메소드

// 상복받은 부모메소드 재정의 한다.
    @Override
    void powerOn(){
        System.out.println(model + "전원을 키고, 운영체제를 부팅합니다.");
    }

    void turnOnDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChangeDmb(int channel){
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
