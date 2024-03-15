package day07;

import java.awt.*;

public class ThreadTask extends Thread{   // Thread 를 상속받는 것
    @Override
    public void run(){
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

    public static void main(String[] args) {
        Thread thread = new ThreadTask();
        thread.start();
        for(int i=0; i<5; i++) {
            System.out.println("띵" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
