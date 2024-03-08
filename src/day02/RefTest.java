package day02;

public class RefTest {
    public static void main(String[] args) {
//        int[] arr=null;
//        arr[0]=10;
//        String str=null;
//        System.out.println(str.toString());  // NullPointException 발생
        String name1="이순신";
        String name2="이순신";
        System.out.println(name1==name2);     // true

        String name3=new String("강감찬");
        String name4=new String("강감찬");
        System.out.println(name3 == name4);    // false
        System.out.println(name3.equals(name4)); // true

        System.out.println(name1.toString());  // 이순신


    }
}
