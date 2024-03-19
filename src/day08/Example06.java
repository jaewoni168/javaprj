package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Example06 {
    static void printCollection(Collection<String> c) {
        String[] a = c.toArray(new String[0]);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Collection<String> c1 = new LinkedList<String>();
        Collection<String> c2 = new ArrayList<String>();

        c1.add("one");
        c1.add("two");

        c2.addAll(c1);
        c2.add("three");
        c2.add("four");

        printCollection(c1);
        printCollection(c2);

        c2.retainAll(c1);   // c1 컬렉션 객체에 들어있지 않은 문자열 개체들에 대해 c2 모두 remove
        printCollection(c2); // [one, two]
    }
}
