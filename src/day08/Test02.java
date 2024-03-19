package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        Random random = new Random();
        for(int i = 1; i<=200; ++i){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        System.out.println(list.size());

    }
}
