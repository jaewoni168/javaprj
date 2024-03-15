package day07;

import java.awt.*;

public class ThreadTest {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {       // new Runnable 을 매개변수로 넣은 것
        Thread thread = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();    // 람다식
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for(int i=0; i<5; i++) {
                    toolkit.beep();  // 비프음 발생
                    try {
                        Thread.sleep(500); // 0.5초간 일시정지
                        System.out.println("소리가 납니다." + i);
                    } catch (Exception e) {
                    }
                }
//            }
        });
        thread.start();  // run 이 실행된다.

        // main thread
        for(int i=0; i<5; i++) {
            System.out.println("띵" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
