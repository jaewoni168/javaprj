package day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        List<Board> list = new ArrayList<>();
//                            제네릭 문법 generic
        list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

        FileOutputStream fos = new FileOutputStream("D:/temp/board.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("D:/temp/board.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list2 = (List<Board>) ois.readObject();
        System.out.println(list2);




//        writeList();
//        List<Board> list = readList();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        for(Board board : list) {
//            System.out.println(
//                    board.getBno() + "\t" + board.getTitle() + "\t" +
//                            board.getContent() + "\t" + board.getWriter() + "\t" +
//                            sdf.format(board.getDate())
//            );
//        }
    }

}
