package day01;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        // 문제 1
//        String name = "감자바";
//        int age = 25;
//        String tel1 = "010", tel2 = "123", tel3="4567";
//        System.out.println("이름: " + name
//        );
//        System.out.print("나이: " + age + "\n");
//        System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3);

        // 문제 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("첫번째 수:");
//        String strNum1 = scanner.nextLine();
//        System.out.print("두번째 수:");
//        String strNum2 = scanner.nextLine();
//        int num1 = Integer.parseInt(strNum1);
//        int num2 = Integer.parseInt(strNum2);
//        int result = num1 + num2;
//        System.out.println("덧셈 결과:" + result);

        // 문제 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("[필수 정보 입력]");

        System.out.print("1. 이름: ");
        String name = scanner.nextLine();

        System.out.println("2. 주민번호 앞 6자리: ");
        String ssn = scanner.nextLine();

        System.out.println("3. 전화번호: ");
        String tel = scanner.nextLine();

        System.out.println();

        System.out.println("[입력된 내용]");
        System.out.println("1. 이름: " + name);
        System.out.println("2. 주민번호 앞 6자리: " + ssn);
        System.out.println("3. 전화번호: " + tel);
    }
}

