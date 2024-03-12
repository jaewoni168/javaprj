package day04;

public class ReverseExam {
    public static void main(String[] args) {
        String originalString = "Hello, world!";

        String reversedString = reverse(originalString);

        System.out.println("Original string: " + originalString);  // Original string: Hello, world!
        System.out.println("Reversed string: " + reversedString);  // Reversed string: !dlrow ,olleH

        String welcome = "Welcome to my World";
        StringBuilder sb = new StringBuilder(welcome);
        sb.reverse();
        System.out.println(sb);  // dlroW ym ot emocleW
    }
    public static String reverse(String str){
        // StringBuilder 객체를 생성하고 원본 문자열을 추가.
        StringBuilder sb = new StringBuilder(str);
        // StringBuilder 의 reverse()메소드를 사용하여 문자열을 뒤집는다.
        sb.reverse();

        // StringBuilder 를 다시 문자열로 변환하여 반환.
        return sb.toString();
    }
}
