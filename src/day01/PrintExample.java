package day01;

import java.io.IOException;

// public 의 클래스명과 파일명은 같아야 한다.
public class PrintExample {
    public static void main(String[] args) throws IOException {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %6d원\n", value);
        System.out.printf("상품의 가격: %-6d원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name= "홍길동";
        String job= "도적";
        System.out.printf("%6d | %-10s | %10s\n",1, name, job);

//        HelloWorld g= new HelloWorld();   // g 는 인스턴스 변수
        // ex) 고양이 야옹이 = new 고양이() : 야옹이는 고양이 과에 속한다.
//        System.out.println(g.hello());
        System.out.println(HelloWorld.hello());

        // 입력장치
        int keyCode;

//        keyCode = System.in.read();
//        System.out.printIn("키코드:"+keyCode);
//
//        keyCode = System.in.read();
//        System.out.printIn("키코드:"+keyCode);
//
//        keyCode = System.in.read();
//        System.out.printIn("키코드:"+keyCode);

        while (true) {
            keyCode = System.in.read();
            System.out.println("키코드: " + keyCode);
            if(keyCode==113) { //q
                break;
            }
        }

    }
}

class HelloWorld{
    // 멤버 메소드
    public static String hello(){    // private 은 사용불가 / main 시작을 보면 public static
        return "점심시간입니다.";
    }
}
