package day02;

public class 구현실습3 {
    static String getFileName1(String path) {
        int index = path.lastIndexOf('/');
        if(index !=-1){
            return path.substring(index + 1);
        }else{
            return path;
        }
    }
    static String getFileName2(String path) {
        String[] parts = path.split("/");
        return parts [parts.length -1];

    }
    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx",
                "c:/www/mainpage.html",
                "c:/program files/java/javac.exe" };
        for (String s : a) {
            String fileName1 = getFileName1(s);
            String fileName2 = getFileName2(s);
            System.out.printf("%s, %s\n", fileName1, fileName2);
        }
    }
}
