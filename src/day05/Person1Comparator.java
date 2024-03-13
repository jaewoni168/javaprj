package day05;
import java.util.Comparator;
public class Person1Comparator implements Comparator<Person1>{
    public enum Compare { BY_NAME_ASC, BY_NAME_DESC, BY_AGE_ASC, BY_AGE_DESC};
    private Compare compare;

    public Person1Comparator(Compare compare){
        this.compare = compare;
    }

    @Override
    public int compare(Person1 p1, Person1 p2) {
        if (p1 == p2) return 0;
        if (p1 == null) return -1;
        if (p2 == null) return 1;

        switch (compare) {
            case BY_NAME_ASC: return p1.getName().compareTo(p2.getName());
            case BY_NAME_DESC: return p1.getName().compareTo(p2.getName());
            case BY_AGE_ASC: return p1.getAge() - p2.getAge();
            case BY_AGE_DESC: return p1.getAge() - p2.getAge();
        }
        return 0;
    }
}
