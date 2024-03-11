package day03;

import java.util.Timer;
import java.util.TimerTask;

public class StarCraft {
    public static void main(String[] args) throws InterruptedException {
        Teran 마린1 = new Teran("마린");

        마린1.attack("저그");
        마린1.attack("프로토스");

        Teran 메딕1 = new Teran("메딕");

        메딕1.cure("마린");

        마린1.defend("저그");
        마린1.defend("저그");

        SCV scv1=new SCV();
        scv1.run();
        Timer money = new Timer();
        money.schedule(scv1, 1000, 3000);
//                      객체, 실행시간,   실행주기
        // 1초후에 작업실행, 3초마다 반복

        Thread.sleep(5000);  // sleep 빨간줄을 클릭 그러면 throws InterruptedException 이 나타남
//        5초동안 일시중지
        System.out.println("광물이 다 떨어졌습니다.");
        money.cancel();
    }
} // StarCraft.java 끝

// SCV 클래스
class SCV extends TimerTask {
// 클릭하면 override 생성
//thread 스레드 문법
    @Override
    public void run() {
        System.out.println("광물(돈)을 캐고 있습니다.");
    }
}
