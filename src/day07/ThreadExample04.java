package day07;
import java.util.Random;
class ThreadC extends Thread{
    String name;
    int count;
    int sum;
    Random random;

    public ThreadC(String name, int count){
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
public class ThreadExample04 {
    public static void main(String[] args) {
        System.out.println("main started");
        ThreadC threadOne = new ThreadC("one", 100);
        ThreadC threadTwo = new ThreadC("two", 100);
        ThreadC threadThree = new ThreadC("three", 100);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        System.out.printf("one: %d\n", threadOne.sum);
        System.out.printf("two: %d\n", threadTwo.sum);
        System.out.printf("three: %d\n", threadThree.sum);
        System.out.println("main stoped");
    }
}
// 0인 이유: 메인 스레드가 45~47을 실행할 때, 계산 스레드는 아직 시작도 안해서 sum 멤버 변수값은 0
// 계산 결과를 main 스레드가 출력하려면, 계산 스레드가 종료될 때까지 기다렸다 출력해야함
