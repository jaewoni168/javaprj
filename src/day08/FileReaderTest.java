package day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("D:/temp/test4.txt");

        while(true){
            int data = reader.read();
            if(data==-1) break;
            System.out.print(data + " ");
            System.out.print((char)data + " ");
        }
        reader.close();


        Reader reader2 = new FileReader("D:/temp/test5.txt");
        char[] buffer = new char[50];

        System.out.println();

        while(true){
            int data = reader2.read(buffer); // 읽은 배열의 길이를 리턴
            if(data == -1) break;
            for(int i=0; i<data; i++){
                System.out.print((char) buffer[i] + " ");
                System.out.print((int) buffer[i] + " ");
            }
        }
        reader2.close();

        System.out.println();

        Reader reader3 = new FileReader("D:/temp/test6.txt");
        char[] buffer3 = new char[10];
        int 개수=reader3.read(buffer3,2,3);
        // 3개의 문자를 읽고, buffer에 2,3,4에 저장한다.

        if(개수 != -1) {
            for(int i =0; i<buffer3.length; i++){
                System.out.print(buffer3[i] + " ");
            }
        }

        buffer3.clone();

        System.out.println();

        String fileName = "D:/temp/test7.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
                                // 보조스트림         주 스트림
        String line;
        while((line=br.readLine()) != null) {
            System.out.println(line);
        }


    }
}
