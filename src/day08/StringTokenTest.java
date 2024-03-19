package day08;

import java.util.StringTokenizer;

public class StringTokenTest {
    public static void main(String[] args) {
        String str = "Hello World, Welcome to my world";
        StringTokenizer st = new StringTokenizer(str," ");

        while (st.hasMoreTokens()){
            String token= st.nextToken();
//            System.out.println(token);
            System.out.print(token+" "); // 문자열을 배열로 연결함

        }

    }
}
