// 스레드 종료 시점
package day07;
import java.util.Random;
class ThreadB extends Thread{
    String name;
    int count;
    int sum;
    Random random;

    public ThreadB(String name, int count){
        this.name = name;
        this.count = count;
        this.sum=0;
        this.random = new Random();
    }

    @Override
    public void run() {
        System.out.printf("%s: started\n", name);
        try {
            for ( int i = 0; i<=count; ++i){
                sum = sum +i;
                int mili_second = random.nextInt(10);
                sleep(mili_second);
            }
        } catch (InterruptedException e) {
            System.out.printf("%s: interrupt()\n", name);
        }
        System.out.printf("%s: %d\n", name, sum);
        System.out.printf("%s: stoped\n", name);

    }
}
public class ThreadExample03 {
    public static void main(String[] args) {
        System.out.println("main started");
        Thread threadOne = new ThreadB("one", 100);
        Thread threadTwo = new ThreadB("two", 100);
        Thread threadThree = new ThreadB("three", 100);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}

// 1에서 100까지 더하면 5050이다.
//스레드 3개를 만들어서 이 계산을 3번 반복하여 출력한다.