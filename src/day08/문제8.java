package day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 문제8 {
    static class Student{
        int studentNum;
        String name;

        Student(int studentNum, String name) {
            this.studentNum = studentNum;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Student)) return false;
            Student student = (Student) obj;
            if(studentNum != student.studentNum) return false;
            return true;
        }

        @Override
        public int hashCode() {
            return studentNum;
        }
    }




    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신융권"));
        set.add(new Student(1, "조민우"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}
