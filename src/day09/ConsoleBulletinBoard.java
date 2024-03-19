package day09;

import java.io.*;
import java.util.Scanner;

public class ConsoleBulletinBoard {
    private static final String FILE_NAME = "posts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 게시글 작성");
            System.out.println("2. 게시글 보기");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    writePost();
                    break;

                case "2":
                    readPosts();
                    break;

                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }
    private static void writePost() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("게시글을 작성하세요: ");
            String post = reader.readLine();
            writer.write(post + System.lineSeparator());
            System.out.println("게시글이 작성되었습니다.");
        } catch (IOException e) {
            System.err.println("게시글을 작성하는 동안 오류가 발생했습니다: " + e.getMessage());
        }
    }

    private static void readPosts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int postNumber = 1;
            System.out.println("=== 게시글 목록 ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(postNumber++ + ". " + line);
            }
            if (postNumber == 1) {
                System.out.println("게시글이 없습니다.");
            }
        } catch (IOException e) {
            System.err.println("게시글을 읽어오는 동안 오류가 발생했습니다: " + e.getMessage());
        }
    }


}