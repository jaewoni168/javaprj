package day08;

import java.util.ArrayList;
import java.util.Collection;

public class Example01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("one");
        c.add("two");
        c.add("three");
        for (String s : c)
            System.out.printf("%s ", s);    // one two three
    }
}
