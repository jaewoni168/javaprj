package day01;

public class EqualsTest {
    public static void main(String[] args) {
        String str1="welcome";
        String str2="welcome";

        String str3=new String("welcome");
        String str4=new String("welcome");


        int num1=100;
        int num2=100;

//        Integer num3=new Integer(100) ; // java 9부터 폐지

        Integer num3=Integer.valueOf(100);
        Integer num4=Integer.valueOf(100);

        System.out.println(str1==str2);       // 답: true
        System.out.println(str3==str4);       // 답: false
        System.out.println(str1.equals(str2));       // 답: true
        System.out.println(str3.equals(str4));       // 답: true   /   값을 비교

        System.out.println(num3==num4);          // 답: true

    }
}
