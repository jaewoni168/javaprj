package day03;

public class Calculator {
    // 필드
    int a;
    int b;



    // 멤버 메소드
     int add(int a, int b) {
         return (a+b);
     }

     int minus(int a, int b) {
          return a-b;
     }

     int mul(int a, int b){
         int result = a*b;
         return result;
     }

     double divide(double c, double d) {
         double result = c/d;
         return result;
     }


}
