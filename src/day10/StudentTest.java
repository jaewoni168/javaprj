package day10;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student(1001, "Lee");

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);
        lee.addSubject("영어", 90);

        Student kim = new Student(1002, "kim");

        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);

        lee.showStudentInfo();
        System.out.println("=============================================");
        kim.showStudentInfo();
    }
}
