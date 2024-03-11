package day03;

public class Car {
    // 필드
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;

//    객체기환프로그램의 기본 종목은
    private int speed;
    void run(){
        setSpeed(50);
        System.out.println("자동차를 달립니다. 속도를 올립니다.");
    }

    public void setSpeed(int speed) {
        this.speed += speed;
    }

    //    객체기환프로그램의 기본 종목은 캡슐화 은닉화 모듈 화

    public int getSpeed() {  // alt+insert-> getter -> speed 클릭 -> 확인
        return speed;
    }
}

////////////// 외부클래스에서 Car 필드값 읽기와 변경
