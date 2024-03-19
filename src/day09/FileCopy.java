package day09;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("원본 파일의 절대 경로를 입력하세요: ");
            String sourcePath = br.readLine();
            System.out.print("복사할 파일의 절대 경로를 입력하세요: ");
            String destPath = br.readLine();

            copyFile(sourcePath, destPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourcePath, String destPath) throws IOException {
        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destPath);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();

        System.out.println("파일 복사가 완료되었습니다.");
    }
}
