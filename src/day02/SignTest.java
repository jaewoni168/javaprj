package day02;

import java.sql.SQLOutput;

public class SignTest {
    public static void main(String[] args) {     //정수를 반환할 땐 int
        int x=-100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
         // byte result 3 = -b; // 컴파일 에러가 난다.
        int result3 = -b;
        System.out.println("result3=" + result3);

        byte c = 100;
        int a = -c;      //부호연산자는 int 형이다.

        // 증감 연산자 ++ --
        int y =10;
        y++;
        System.out.println("y=>" + y);      // 11
        System.out.println("y=>" + y--);    // 11
        System.out.println("y=>" + ++y);    // 11

        --y;
        System.out.println("y=>" + y);      // 10

        // 단항연산자 - 논리부정연산자
        boolean play = true;
        System.out.println(play);    // true
        play = !play;
        System.out.println(play);    // false

        // 산술연산자 + - * / % 나머지
        int num1 = 100;
        int num2 = 200;

        double result=(double) num1 / num2;    // (double) 은 강제 형 변환
        System.out.println(result);  // 0.5

        // char 타입
        char c1 = 'A';
        char c2 = 66;
        System.out.println(c1+"," +c2);  // A,B
        int c3 = c2 + 1;
        System.out.println(c3); // 67
        int c4 = c1+3;
        System.out.println(c4);  // 68
        char c5 = (char) (c1+5);
        System.out.println(c5);  // F

        // 비교연산자
        System.out.println(num1 > num2);  // false
        double num3 = 0.1;  // 실수형
        float num4 = 0.1F;  // 실수형
        long num5 = 10L;  // 정수형

        // 논리연산자  && &, || |
        //     ^  는 XOR 배타적 논리합
        // ! 부정

        // 복합대입연산자 +=  -=  *=
        // 삼항연산자
        int 점수 = 85;
        char 등급=(점수>90) ? 'A' : ((점수>80)?'B' : 'C');
//----------------------------------------------------------
        if(점수>90){
            등급='A';
        } else if (점수>80){
            등급='B';
        }else {
            등급='C';
        }

        System.out.printf("학생은 %c 학점입니다.", 등급);  //학생은 B 학점입니다.
        // 위의 2개의 코딩은 같은 거다.








    }  // main
} // class
