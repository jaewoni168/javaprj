package day06;

public class IntegerCompare {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);  // true    / 값의 범위가 -128 ~ 127 사이로 true
        System.out.println(obj3 == obj4);  // false   / 값의 범위가 -128 ~ 127 사이가 아니라서 false
    }
}
