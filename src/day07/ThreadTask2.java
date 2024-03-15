package day07;

import java.awt.*;

public class ThreadTask2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            // 익명자식객체
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();  // 비프음 발생
                    try {
                        Thread.sleep(500); // 0.5초간 일시정지
                        System.out.println("소리가 납니다." + i);
                    } catch (Exception e) {
                    }
                }
            }
        };
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try { Thread.sleep(500); } catch(Exception e) {}
        }


    }
}
