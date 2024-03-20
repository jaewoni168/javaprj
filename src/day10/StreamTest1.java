package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sumVal = Arrays.stream(arr).sum();
        System.out.println(sumVal);
        long count = Arrays.stream(arr).count();
        System.out.println(count);

        int sum = Arrays.stream(arr).reduce(0, (a, b)->a+b);
        System.out.println(sum);

        List<String> sList = new ArrayList<>();
        sList.add("이순신");
        sList.add("강감찬");
        sList.add("김가나");
        sList.add("을지문덕");


        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.print(s+" "));
        System.out.println();

        sList.stream().sorted().forEach(s-> System.out.print(s +" "));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(s-> System.out.print(s +" "));
        System.out.println();
        sList.stream().filter(s->s.length()>=4).forEach(s-> System.out.print(s + " "));
        System.out.println();

        Arrays.stream(arr).forEach(n-> System.out.print(n+" "));
        System.out.println();

        int sum2 = Arrays.stream(arr).sum();
        System.out.println("sum: " + sum2);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);

        int sum3 = list2.stream().mapToInt(n->n.intValue()).sum();
        System.out.println(sum3);



    }
}
