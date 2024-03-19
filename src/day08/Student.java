package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import java.util.Set;

public class Student {
    int sno;
    String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        Student s1 = new Student(1, "이순신");
        Student s2 = new Student(1, "이순신");
        Student s3 = new Student(2, "이순신");
        Student s4 = new Student(3, "이율곡");
        Student s5 = new Student(4, "을지문덕");

        map.put(s1, 95);
        map.put(s2, 90);
        map.put(s3, 50);
        map.put(s4, 50);
        map.put(s5, 50);

        System.out.println("총인원: " + map.size());  // 총인원: 2

        Set<Student> keySet = map.keySet();
        Iterator<Student> keyIter = keySet.iterator();

        while (keyIter.hasNext()) {
            Student key = keyIter.next();
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }

        // entrySet
        Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Student, Integer>> entryIterator=entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<Student, Integer> entry = entryIterator.next();
            Student key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }



    }
}
