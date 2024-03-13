package day05;

import day05.Person1Comparator.Compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Arrays3 {
    static Random random = new Random();

    static String makeRandomString(){
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<4; ++i){
            int n = random.nextInt(26) + (int)'a';
            builder.append((char)n);
        }
        return builder.toString();
    }

    static Person1[] makePersonArray(int count){
        Person1[] a = new Person1[count];
        for (int i = 0; i< count; ++i){
            String name = makeRandomString();
            int age = random.nextInt(10)+10;
            a[i] = new Person1(name,age);
        }
        return a;
    }
    public static void main(String[] args) {
        Comparator<Person1> person1Comparator = new Person1Comparator(Compare.BY_AGE_DESC);
        Person1[] a = makePersonArray(10);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, person1Comparator);
        System.out.println(Arrays.toString(a));

        int index = Arrays.binarySearch(a,  new Person1("nnn", 10), person1Comparator);
        System.out.printf("index of \"nnn\": %d\n", index);

        Person1[] b = Arrays.copyOf(a, a.length);
        System.out.printf("Arrays.equals(a, b) : %b\n", Arrays.equals(a, b));

        System.out.printf("a.equals(b) : %b\n", a.equals(b));
        System.out.println(a.toString());
    }

}
