package day06;

public class Quiz3 {
    int a = 3, b = 4;
    void doSomethoing() {
        new InnerClass().swap();
        System.out.printf("%d %d\n", a, b);
    }
    public static void main(String[] args) {
        new Quiz3().doSomethoing();
    }
}
}
