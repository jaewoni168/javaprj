// 홀수 만들기

package day08;

import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i =1; i<=100; ++i){
            if( (i%2) != 0){list.add(i);}
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
