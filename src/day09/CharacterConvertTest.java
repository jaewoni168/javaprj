// 문자 변환 보조 스트림
package day09;

import java.io.*;


public class CharacterConvertTest {
    public static void main(String[] args) throws IOException {
        String str = "문자 변환 스트림을 사용합니다.";

        FileOutputStream fos = new FileOutputStream("D:/temp/test8.txt");
        Writer writer = new OutputStreamWriter(fos);
        writer.write(str);
        writer.flush();
        writer.close();

        FileInputStream fis = new FileInputStream("D:/temp/test8.txt");
        Reader reader = new InputStreamReader(fis);

        char[] buffer = new char[100];
        int charNum=reader.read(buffer); // 문자수를 반환
        reader.close();
        String data = new String(buffer,0,charNum);

        System.out.println(data);
        System.out.println(buffer);

    } // main

    static void write(String str){

    }

} // end
