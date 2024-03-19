package day09;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {

// 파일 객체생성
        File dir = new File("D:/temp/images");
        File file1 = new File("D:/temp/file1.txt");
        File file2 = new File("D:/temp/file2.txt");
        File file3 = new File("D:/temp/file3.txt");

// 파일 또는 폴더가 존재하지 않으면 생성
        if(dir.exists() == false) {  dir.mkdirs();  }
        if(file1.exists() == false) {  file1.createNewFile();  }
        if(file2.exists() == false) {  file2.createNewFile();  }
        if(file3.exists() == false) {  file3.createNewFile();  }



// C:Temp 폴더의 내용 목록을 File 배열로 얻음
        File temp = new File("D:/temp");
        File[] contents = temp.listFiles();

        System.out.println("시간\t\t\t형태\t\t크기\t이름");
        System.out.println("----------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
        System.out.println(file1.getAbsolutePath());  // 절대경로
        System.out.println(System.getProperty("user.dir"));  // 현제 작업 위치

        // 첫번째 방법
        FileInputStream fis = new FileInputStream("data.txt");
        int data;
        while ((data=fis.read()) != -1) {
            System.out.print((char) data + " ");
        }

        // 두번째 방법
        File file = new File("data8.txt");
        file.createNewFile();

        System.out.println("\n");

        Boolean deleted = file.delete();
        System.out.println("파일이 삭제되었습니다." + deleted);

        File file8 = new File("data.txt");
        FileInputStream fis2 = new FileInputStream(file8);

        int data2;
        while((data2=fis2.read())!=-1){
            System.out.print((char) data2 + " ");
        }
        fis2.close();
    }
}
