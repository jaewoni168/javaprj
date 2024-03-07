package day01;

public class FloatTest {
    public static void main(String[] args) {
        //실수 리터럴
        float var1=3.14f;
        float var2=3.14F;
//        float var2=3.14;   // f를 안붙이면 컴파일 에러 하지만 3.14하고 싶으면 밑에 코드처럼
        double var3=3.14;  // double 을 붙이면 가능함

        // 논리 타입
        boolean stop=true;
        boolean start=false;

        // 타입 변환 (자동타입변환 / 강제타입변환)

        // 자동타입변환
        // 크기 순서는 byte<short<int<long<float<double 이다.
        byte val=10;  // 바이트형을 정수에 담은 것
        int val1=val;

        char 글자='가';
        val1=글자;

        float val2=글자;

        float val3=100.5F;
        double val4=val3;

        //강제타입변환
//        val1=val4    이건 val4의 타입 크기가 더 크기 때문에 안되서 바꿔야 한다.
        val1 = (int) val4;
        System.out.println(val1);    // 100.5에서 100으로 변환

        // 연산식에 형변환
        int 정수=10;
        int 결과=10/4;
//        int 결과2=10/4.0; // 이건 에러가 난다. 타입 변환을 하던지 double로 해야한다.
        int 결과2=(int) (10/4.0);
        double 결과3= (10/4.0);
        System.out.println(결과2);   // 결과: 2
        System.out.println(결과3);   // 결과: 2.5

        int str=10+2+8;
//        String str1=10+2+8; // 당연히 오류가 되지만
        String str1="10"+2+8;  // 이것처럼 ""가 있기만 하면 오류가 안 생긴다.
        String str2="10"+(2+8);  // 이것처럼 ""가 있기만 하면 오류가 안 생긴다.
        System.out.println(str);    // 답: 20
        System.out.println(str1);   // 답: 1028
        System.out.println(str2);   // 답: 1010

        // 문자열 -> 기본타입(int, byte, double, boolean, float, short, char)으로 강제변환
        String 문자="10";
        //        Integer / Byte / Double / Boolean / Float / Wrapper 클래스
        byte value = Byte.parseByte(문자);
        short value2=Short.parseShort(문자);
        int value3=Integer.parseInt(문자);
        boolean value4=Boolean.parseBoolean("true");

        // 숫자 -> 문자열로 변환
        Object num=100;        // 일반 타입
        String numStr=String.valueOf(num);
        String numStr2=num+"";

        if(num instanceof  Integer){
            System.out.println("정수입니다.");
        }else {
            System.out.println("정수가 아닙니다.");
        }
        Integer num2=Integer.valueOf(200);  // class 타입 즉 객체 타입이다. 일반타입보단 어떤 클래스냐가 더 중요하다.

        Object str5="Welcome";

        Class<?> cls=str5.getClass();   // <?>: 아무거나 넣어라
        System.out.println("나는"+cls.getName()+"입니다."); //답:나는 java.lang.String 입니다. / string 객체는 java.lang 에 속해있다.

        Object str6=500;

        Class<?> cls2=str6.getClass();   // <?>: 아무거나 넣어라 / Class<?>: class 객체형으로 지정한 것 하지만 그게 문자형인지 숫자형인지 알 수 없다.)
        System.out.println("나는"+cls2.getName()+"입니다."); //답:나는 java.lang.Integer 입니다./ integer 객체는 java.lang 클래스에 속해있다.

    }
}
