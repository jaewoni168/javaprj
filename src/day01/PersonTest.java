package day01;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("강감찬", 10);
        Person p2 = new Person("강감찬", 10);

        System.out.println(p1);                  //day01.Person@3b07d329  @3b07d329 는 해시값 / 보통 toString()을 오버라이드한다.
        System.out.println(p2);                  //day01.Person@41629346 / 자동완성기능을 사용해서 toString()는 필요 없다.
        System.out.println(p1==p2);              // false
        System.out.println(p1.equals(p2));       // true   /  equals 를 오버라이드해서 두개는 같은 사람으로 인식함
    }
}
