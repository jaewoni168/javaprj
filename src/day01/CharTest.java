package day01;

public class CharTest {
    public static void main(String[] args) {
        // char 타입
        char c1='A' ;
        char c2=65 ;
        char c3='\u0041' ;

        System.out.println(c1);  // 답: A
        System.out.println(c2);  // 답: A
        System.out.println(c3);  // 답: A
        // 즉 똑같은 A다 유니코드를 검색해보면 안다.

        char c4='가';
        char c5=44032;
        char c6='\uac00';

        System.out.println(c4);  // 답: 가
        System.out.println(c5);  // 답: 가
        System.out.println(c6);  // 답: 가
        // 위의 A 와 같은 이유이다.

        // 문자열
        String name="홍길동" ;
        System.out.println(name); // 답: 홍길동

        // 이스케이프 문자
        String str="나는 \"자바\"를 좋아합니다.";         // 답: 나는 "자바"를 좋아합니다.
        String str1="나는 \'자바\'를 좋아합니다.";        // 답: 나는 '자바'를 좋아합니다.
        String str2="번호\t이름\t나이";        // 답: 번호	이름	나이
        String str3="강감찬\n귀주대첩";        // 답: 강감찬
//                                                    귀주대첩

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("봄\\여름\\가을\\겨울");        // 답: 봄\여름\가을\겨울'



    }
}
