package day03;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        method(a);
        // method 가 빨간색이 나오면 두번째 클릭하는 거를 클릭한다.
        System.out.println(a);  // 10
        // 변수 a의 값이 method 와 무관하다.
    }

    private static void method(int a) {
        a=200;
        System.out.println("method=> " +a);   // 200  / 단, a=200;을 지우면 답은 10으로 나온다.
    }

}
