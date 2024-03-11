package day03;

public class ObjArray1 {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3 };
        String[] c = new String[] {"one","two","three"};

        System.out.println(a.getClass().getName());  // [I  int 배열
        System.out.println(b.getClass().getName());  // [I  int 배열
        System.out.println(c.getClass().getName());  // [Ljava.lang.String; String 배열
        System.out.println(a.equals(b));   // false
    }
}
