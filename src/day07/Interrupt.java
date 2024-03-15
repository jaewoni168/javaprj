package day07;

public class Interrupt {
    public static void main(String[] args)  {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt();
    }
}

class PrintThread2 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);  // thread.interrupt()로 sleep 이 발동
            }
        } catch(InterruptedException e) {
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

