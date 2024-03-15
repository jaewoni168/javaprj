package day07;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        Board b1 = new Board("제목", "내용1", "글쓴이");
        Board b2 = new Board("고려거란전쟁", "귀주대첩", "강감찬");
        Board b3 = new Board("오징어게임", "게임", "이정재");
        Board b4 = new Board("제목2", "내용2", "글쓴이2");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        for(Board b : list){
            System.out.println(b.content + " " + b.subject + " " + b.writer);
        }

        list.remove(2);

        for(int i = 0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.content + " " + b.subject + " " + b.writer);
        }

        // 수정
        Board b5 = new Board("자바공부", "컬렉션프레임워크", "김자바");
        list.set(0,b5);

        for(int i = 0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.println(i + ":" + b.content + " " + b.subject + " " + b.writer);
        }

        // 특정 요소값 찾아서 수정하기
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).content=="자바공부"){
                list.set(i,new Board("java study", "java", "김자바"));
            }
            Board b = list.get(i);
            System.out.println(i + ":" + b.content + " " + b.subject + " " + b.writer);
        }

    }
}

class Board {
    String subject;
    String content;
    String writer;
    public Board(String subject, String content, String writer){
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}

