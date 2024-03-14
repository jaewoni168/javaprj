// 주사위
package day06;
public class MathRandom {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6) + 1;
        System.out.println("주사위 눈: " + num);
    }
}
