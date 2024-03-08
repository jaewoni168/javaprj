////////  문제 11
// 아이디는 java, 패스워드는 12345를 입력하여 로그인 성공과 실패를 나타내는 클래스를 완성하시오.

package day02;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디: ");
            String name = scanner.nextLine();

        System.out.println("패스워드: ");
        try {
            String strPassword = scanner.nextLine();
            Integer password = Integer.parseInt(strPassword);

    if(name.equals("java")){
        if(password == 12345) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패: 패스워드가 틀림");
        }
    } else {
        System.out.println("로그인 실패: 아이디가 존재하지 않음");
    }
    } catch (Exception e) {
            System.out.println("비밀번호가 숫자가 아닙니다.");
        }

    }
}
