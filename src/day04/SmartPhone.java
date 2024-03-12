package day04;

// 실제 클래스
public class SmartPhone extends Phone{

    public SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰을 사용합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰을 그만합니다.");
    }
}
