package day08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:/temp/test4.txt");
        char a='A'; char b = 'B';
        char c='C'; char d = 'D';
        writer.write(a); writer.write(b);
        writer.write(c); writer.write(d);

        writer.flush(); writer.close();

        Writer writer2 = new FileWriter("D:/temp/test5.txt");
        char[] arr={'D', 'E', 'F'};
        writer2.write(arr);
        writer2.flush(); writer2.close();

        Writer writer3 = new FileWriter("D:/temp/test6.txt");
        char[] arr2={'D', 'E', 'F', 'A', 'B', 'C'};
        writer3.write(arr2,1,4);
        writer3.flush(); writer3.close();

        Writer writer4 = new FileWriter("D:/temp/test7.txt");
        String str="welcome to my world";
        writer4.write(str);
        writer4.flush(); writer4.close();

    }
}
