package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:/temp/test1.txt");

        while (true) {
            int data = is.read();
            if (data == -1) break;
            System.out.print(data + " ");
        }
        System.out.println();

        InputStream is2 = new FileInputStream("D:/temp/test2.txt");
        byte[] buffer = new byte[100];

        while (true) {
            int data = is2.read(buffer);
            System.out.println(data);
            if (data == -1) break;
            for (var i = 0; i < data; i++) {
                System.out.print(buffer[i] + " ");
            }
        }
        System.out.println();

        InputStream is3 = new FileInputStream("D:/temp/test3.txt");
        byte[] buffer2 = new byte[10];

        int data = is3.read(buffer2, 2, 3);  // is3으로부터 3바이트 읽는다.
        // buffer[2],3,4에 저장
        if (data != -1) {
            for (var i = 0; i < buffer2.length; i++) {
                System.out.print(buffer2[i] + " ");
            }
        }
        System.out.println();
    }
}
