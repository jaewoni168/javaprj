package day01;
import java.util.Arrays;

    class Family {
        Person father, mother;
        Person[] children;

        public Family() {
            father = new Person("아빠", 45);
            mother = new Person("엄마", 36);
            children = new Person[3];
            children[0] = new Person("아들1", 12);
            children[1] = new Person("아들2", 9);
            children[2] = new Person("딸1", 7);
        }

        @Override
        public String toString() {
            return "Family{" +
                    "father=" + father +
                    ", mother=" + mother +
                    ", children=" + Arrays.toString(children) +
                    '}';
        }
    }
    public class Person02 {
        static Family family;

        public static void main(String[] args) {
            family = new Family();
            System.out.println(family);
        }
    }
