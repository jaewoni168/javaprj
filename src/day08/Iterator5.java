// 역방향 탐색
package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i<10; ++i)
            list.add(i);

        for(int i = list.size() -1; i>=0; --i)
            System.out.print(list.get(i) + " ");

        System.out.println();

        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            Integer i = iterator.previous();
            System.out.print(i + " ");
        }
    }
}
