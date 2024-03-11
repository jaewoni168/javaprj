//package day03;
//
//public class BloodTypeTest {
//    public static void main(String[] args) {
//        Person p1 = new Person("홍길동", 18, BloodType.AB);
//        Person p2 = new Person("전우치", 24, BloodType.O);
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        BloodType blood1 = BloodType.valueOf("AB");
//        BloodType blood2 = BloodType.valueOf("A");
//        System.out.println(blood1.canGiveTo(blood2));   // false
//        System.out.println(blood2.canGiveTo(blood1));  // true
//
//        for (BloodType blood : BloodType.values())
//            System.out.println(blood);
//
//        String s = "";
//        switch (p1.getBloodType()) {
//            case A: s = "A형"; break;
//            case B: s = "B형"; break;
//            case AB: s = "AB형"; break;
//            case O: s = "O형"; break;
//        }
//        System.out.println(s);
//    }
//}