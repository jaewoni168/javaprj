package day02;

import java.util.Objects;

public class Student {
    //    멤버변수, 필드 / 이것들은 class 의 속성임
    String name;
    int age;

    // 생성자함수 - 리턴값이 없고, 클래스명과 동일하다.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    메소드 재정의
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}