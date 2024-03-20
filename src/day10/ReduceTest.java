package day10;


import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}


public class ReduceTest {
    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다.^^"};

        System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)-> {
            if (s1.getBytes().length >=s2.getBytes().length)
                return s1;
            else return s2; }));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        // binaryoperator 를 구현한 클래스 이용
        System.out.println(str);

        // 두개의 정수를 비교해서 최대값 구하기
        BinaryOperator<Integer> max=(a,b)->a>b?a:b;
        int result = max.apply(3,5);
        System.out.println(result);  // 5

        BinaryOperator<String> concat=(a,b)->a+b;
        String r1 = concat.apply("welcome", " to my world");
        System.out.println(r1);




    }
}
