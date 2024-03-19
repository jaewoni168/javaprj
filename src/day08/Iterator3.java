// 탐색 중 제거
package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator3 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();

        for (int i=0; i< 10; ++i)
            c.add(i);

        for(int i:c)
            System.out.print(i + " ");
        System.out.println();

        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) iterator.remove();
        }
        for(int i:c)
            System.out.print(i + " ");
    }
}
