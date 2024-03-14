package day06;

public class TryTest {
//    // 일반 예외 처리
//    public static void main(String[] args) {
//        try {
//            Class clazz = Class.forName("String2");  // 라이브러리 가져올 때 Class 를 사용한다.
//        } catch(ClassNotFoundException e) {
//            System.out.println("클래스가 존재하지 않습니다.");
//        System.out.println(e);  // ClassNotFoundException : 작동하지 않는다는 예외 객체가 발동
//        }

    // 실행 예외 처리
//    public static void main(String[] args) {
//        String data1 = null;
//        String data2 = null;
////        try {
////            data1 = args[0]; // 예외발생
////            data2 = args[1];
////        } catch(ArrayIndexOutOfBoundsException e) {
////            System.out.println("실행 매개값의 수가 부족합니다.");
////            return;
////        }
//
//        try {
//            int value1 = Integer.parseInt(data1);  // 예외발생
//            int value2 = Integer.parseInt(data2);
//            int result = value1 + value2;
//            System.out.println(data1 + "+" + data2 + "=" + result);
//        } catch(NumberFormatException e) {
//            System.out.println("숫자로 변환할 수 없습니다.");
//        } finally {
//            System.out.println("다시 실행하세요.");
//        }

    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
