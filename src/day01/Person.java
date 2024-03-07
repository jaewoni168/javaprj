package day01;

import java.util.Objects;

public class Person {
    String name;
    int age;


//    밑에는 alt+insert -> constructor -> shift 누른채로 두개 클릭 후 확인
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    alt+insert -> toString() -> 전부
    @Override
    public String toString() {
        return String.format("Person{name=\"%s\", age=%d}", name, age);
    }


//    alt+insert equals() and hashCode() 전부 체크 다음 다음 create
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
