package day06;

public class Boxing {
    public static void main(String[] args) {
        // 박싱 boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        // 언박싱 Unboxing
//        int value1 = obj1.intValue();
//        int value2 = obj2.intValue();
//        int value3 = obj3.intValue();
//
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value3);
        byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
        String str = new String(bytes);
        System.out.println( str );    // I love you
    }
}
