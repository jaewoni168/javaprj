package day05;

public class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Person) == false) return false;
        Person1 p = (Person1)obj;
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
    }



    @Override

    public String toString() {

        return String.format("Person{name=\"%s\", age=%d}", name, age);

    }
}