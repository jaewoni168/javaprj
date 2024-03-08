///////// 문제10
///  원의 넓이를 구하는 클래스를 완성해보자.
// 단, PI값 3.14는 각각 3과 14인 정수값으로 분리하여 계산한다.

package day02;

public class Exam02 {
    public static void main(String[] args) {
        int var1 = 10;
        // 단, PI값 3.14는 각각 3과 14인 정수값으로 분리하여 계산한다.
        int var2 = 3;
        int var3 = 14;
        double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
        System.out.println("원의 넓이:" + var4);    // 314.0
    }
}
