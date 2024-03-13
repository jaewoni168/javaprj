package day05;

import java.util.Arrays;
public class PersonTest {
    public static void main(String[] args) {
        Person1[] a = new Person1[]{
                new Person1("홍길동", 18),
                new Person1("임꺽정", 22),
                new Person1("전우치", 23),
        };

        Arrays.sort(a, new PersonNameComparator());
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, new PersonAgeComparator());
        System.out.println(Arrays.toString(a));
    }
}
