package day02;

public class MainTest {
    public static void main(String[] args) {
        if(args.length !=2) {
            System.out.println("인자 개수가 부족합니다.");
            System.exit(0);  // 프로그램 실행 종료
        }
        String str1 = args[0];
        String str2 = args[1];

        System.out.println(str1+"과"+str2+"전달하였습니다.");
    }
}
