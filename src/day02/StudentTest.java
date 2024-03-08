package day02;

public class StudentTest {
    public static void main(String[] args) {

        Student 학생1 = new Student("강감찬",20);
        Student 학생2 = new Student("강감찬",20);
        Student 학생3 = new Student("이순신",20);

        System.out.println(학생1);

        System.out.println(학생1==학생2);  // false   / new 로 설정해서 다르다.
        System.out.println(학생1==학생3);  // false   / new 로 설정해서 다르다.

        // 하지만 학번이 같으면 학생1과 학생2는 같은 사람으로 본다.
        System.out.println(학생1.equals(학생2));   // true     / 이름이 같게 Student 에서 재정의 해서 true
        System.out.println(학생1.equals(학생3));   // false    / 이름이 달라서 false

    }
}
