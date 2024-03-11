package day03;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("100", "이순신", 30);

        System.out.println(s1);  // null null 0
        System.out.println(s2);  // 100 이순신, 30

        s1.setStudentNo("101");
        s1.setStudentName("원빈");
        s1.setStudentAge(25);

        System.out.println(s1);  // 101, 원빈, 25   / Student.java 에서 getter and setter 에 public 을 지워도 클래스, 패키지에서 가능)
        // 하지만 private 는 오류 (같은 클래스 내부에서만 실행 가능)

        System.out.println(s2.getStudentName());  // 이순신


    }
}
