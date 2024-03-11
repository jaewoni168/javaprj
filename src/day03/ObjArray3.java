package day03;

import java.util.Date;



public class ObjArray3 {
    public static void main(String[] args) {
        Object[] a = new Object[8];

        a[0] = "hello";
        a[1] = new String("world");
        a[2] = new Date();
        a[3] = new Person("홍길동", 13);
        a[4] = new int[] { 1, 2, 3 };
        a[5] = new String[] { "one", "two", "three" };
//        a[6] = new Integer(3);
//        a[7] = new Double(3.14);
        // Integer 랑 Double 은 안된다.
        for (Object o : a) {
            System.out.println(o);
        }
    }



}