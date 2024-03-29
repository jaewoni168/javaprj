package day05;
import java.util.Comparator;
public class PersonNameComparator implements Comparator<Person1>{

    @Override
    public int compare(Person1 p1, Person1 p2) {
        int r = p1.name.compareTo(p2.name);  // 먼저 이름(name)을 비교한다.
        if (r != 0) return r;                // 이름이 같지 않다면, 이름 비교 결과를 리턴한다.
        return p1.age - p2.age;              // 이름이 같다면, 나이(age) 비교 결과를 리턴한다.

    }
}
