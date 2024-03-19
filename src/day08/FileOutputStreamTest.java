package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        OutputStream os = Files.newOutputStream(Path.of("D:/temp/test1.txt"));

        byte a=65;
        byte b=66;
        byte c=67;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();

        OutputStream os1 = new FileOutputStream("D:/temp/test2.txt");
        byte[] arr={68,69,70};
        os1.write(arr);
        os1.flush();
        os1.close();

        OutputStream os2=new FileOutputStream("D:/temp/test3.txt");
        byte[] arr1={68,69,70,65,66,97,98,99};
        os2.write(arr1,1,5);
        os2.flush();
        os2.close();
    }
}
// test1.txt 파일이 생성되면서 ABC 가 생성이 된다.