package day03;

public class Student {
    // 필드 - 멤버변수
    String studentNo;
    String studentName;
    int studentAge;

    //생성자함수
    // 기본 생성자함수
    public Student() { };  // 이게 없으면 StudentTest.java 에서 오류가 나타난다.

    // 멤버 변수를 파라미터하면(alt + insert -> constructor -> shift 모두 클릭 -> ok)
    public Student(String studentNo, String studentName, int studentAge) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    // 멤버 메소드

    // get, setter 메소드 (getter and setter) / get: 변수값 읽어오기 / set: 변수값 설정하기
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    // toString 사용
    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
        // 여기까지 클래스의 구성 멤버

    // 상속을 받는 경우 부모의 메소드를 재정의할 때 override 가 들어간다.
    }
}
