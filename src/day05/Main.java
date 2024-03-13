package day05;

public class Main {
    public static void main(String[] args) {

        // 지역변수, 로컬변수
        final int[] count = {0};  // 함부로 바꾸지 못하게 final 로 한다.

        // 로컬클래스
        class Local{
            public void increment(){
                count[0]++;
            }
        } //

        Local local = new Local();
        local.increment();
        System.out.println(count[0]);
        local.increment();
        System.out.println(count[0]);

    }
}
