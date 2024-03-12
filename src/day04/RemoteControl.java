package day04;

public interface RemoteControl {
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();     // 원래 제일 앞에 abstract 가 있지만 없어도 추상적인 의미가 있어서 생략
    void turnOff();
    void setVolume(int volume);
}
