package day02;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
//        for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);    // 1683

//    두수의 합이 5가 나올때 자동으로 프로그램이 종료되도로 작성해보자.
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + num1 + "," + num2 + ")");
            if ((num1 + num2) == 5) {
                System.out.println("총합이 5입니다.");
                break;
            }
        }

// 중첩  for 문을 이용해서 방정식  4x+5y=60 의 모든 해를 구해서(x,y) 형태로 출력해보자. 단 x와 y는 10이하의 자연수이다.
        for(int x=1; x<=10; x++){
            for(int y =1; y<=10; y++){
                if ((4*x+5*y) == 60){
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
//    for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보자
//    *
//    **
//    ***
//    ****
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                if(j==i){
                    System.out.println();
                }
            }
        }
//        for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보자.
//           *
//          **
//         ***
//        ****
        for(int i=1; i<5; i++){
            for(int j=4; j>0; j--){
                if(i<j){
                    System.out.print("");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

//  while 문과 Scanner 를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보자.
    boolean run = true;
    int balance = 0;

    Scanner scanner = new Scanner(System.in);

    while (run){
        System.out.println("--------------");
        System.out.println("1.예금ㅣ2.출금ㅣ3.잔고ㅣ4.종료");
        System.out.println("--------------");
        System.out.println("선택> ");

        int menuNum = Integer.parseInt(scanner.nextLine());

        switch (menuNum) {
            case 1:
                System.out.print("예금액");
                balance += Integer.parseInt(scanner.nextLine());
                break;

            case 2:
                System.out.print("출금액");
                balance += Integer.parseInt(scanner.nextLine());
                break;

            case 3:
                System.out.print("잔고");
                balance += Integer.parseInt(scanner.nextLine());
                break;

            case 4:
                run = false;
                break;
        }
        System.out.println();
    }
        System.out.println("프로그램 종료");

    }
}