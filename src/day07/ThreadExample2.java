package day07;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        thread.interrupt();
        class MovieThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    System.out.println("동영상을 재생합니다.");
                    if (this.isInterrupted()) {
                        break;
                    }
                }
            }
        }
    }
}