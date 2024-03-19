package day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {
    public static void main(String[] args) throws IOException {

        String str = ReadLineExample.class.getResource("lang.txt").getPath();

        Reader reader = new FileReader(str);
        BufferedReader br = new BufferedReader(reader);

        while(true){
            String data = br.readLine();
            if(data==null) break;
            System.out.println(data);
        }
    }
}
