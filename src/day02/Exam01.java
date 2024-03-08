////////  문제9
// 두 수 를 입력받아서 나누는 연산을 수행하는 클래스를 만들어 보자.
// 단. 제수(divisor) 0을 입력받았을 때는 무한대로 표시하시오

package day02;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     // Scanner 는 무조건 import java.util.Scanner 을 사용

        System.out.print("첫 번째 수: ");
            double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("두 번째 수: ");
            double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("-----------------------");

        if(num2 !=0.0) {
            System.out.println("결과: " + (num1/num2));
        } else {
            System.out.println("결과: 무한대");
        }
    }
}
