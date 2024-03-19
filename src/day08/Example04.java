package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.LinkedList;

public class Example04 {
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

        printCollection(c1);
        printCollection(c2);
    }
}
