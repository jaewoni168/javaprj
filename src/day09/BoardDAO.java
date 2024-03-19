package day09;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {  // 게시판 기능
    Scanner scanner = new Scanner(System.in);
    List<BoardVO> boardList = new ArrayList<>(); // 게시글 객체를 저장할 List

    public void getBoardList() {  // 게시판 목록 불러오기
        System.out.println("             <<게시판>>");
        System.out.println("번호    제목          작성자    작성일");
        System.out.println("-----------------------------------");
        if (boardList.isEmpty()) { // 게시글 객체들을 담은 리스트에 아무것도 업ㅈㅅ는 경우
            System.out.println("현재 게시글이 없습니다.");
        } else {
            for (BoardVO vo : boardList) { // 글 번호를 1부터 시작하기 위해 인덱스 +1
                System.out.printf(" %-3d | %-15s | %3s | %-1s\n", boardList.indexOf(vo) + 1, vo.getTitle(),
                        vo.getWriter(), vo.getRegistDate());
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("1.새글작성 | 2.상세보기 | 3.글수정 | 4.글삭제 | 5.파일 | 6.종료");
    }

    public void boardInsert() {
        BoardVO vo = new BoardVO();
        System.out.print("글제목: ");
        String title = scanner.nextLine();

        System.out.print("작성자: ");
        String writer = scanner.nextLine();

        System.out.print("글내용: ");
        String content = scanner.nextLine();

        vo.setNum(boardList.indexOf(vo)); // 인덱스를 객체 번호에 저장
        vo.setTitle(title);  // 글 제목 저장
        vo.setWriter(writer); // 글 작성자 저장
        vo.setContent(content);// 글 내용 저장

        // 현재 날짜 저장
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String registDate = sdf.format(new Date());
        vo.setRegistDate(registDate);

        boardList.add(vo);  // List 에 현재 작성한 게시글 저장
        System.out.println("새글이 추가되었습니다.");
    }

    // 게시글 상세보기
    public void boardDetail(int select) {
        if (boardList.isEmpty()) {
            System.out.println("게시글이 존재하지 않습니다.");
            return;
        }

        BoardVO vo = new BoardVO(); // 게시글 객체 생성
        vo = boardList.get(select - 1);
        System.out.println("No." + select);
        System.out.println("제목 :" + vo.getTitle());
        System.out.println("작성자 :" + vo.getWriter());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(vo.getContent());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("(1.수정, 2.삭제, 3.목록): ");
        select = Integer.parseInt(scanner.nextLine());
        if (select == 1) { // 현재 글 수정
            boardUpdate(boardList.indexOf(vo) + 1);
        } else if (select == 2) { // 현재 글 삭제
            boardDelete(boardList.indexOf(vo) + 1);
        } else if (select == 3) { //목록으로 이동
            return;
        }
    }

    // 게시글 수정
    public void boardUpdate(int select) {
        if (boardList.isEmpty()) { // BoardList 가 비어있는 경우
            System.out.println("게시글이 없습니다.");
            return;
        }

        BoardVO vo = new BoardVO();
        vo = boardList.get(select - 1);

        System.out.print("글제목: "); // 제목 수정
        String title = scanner.nextLine();

        System.out.print("작성자: "); // 작성자 수정
        String writer = scanner.nextLine();

        System.out.print("글내용: "); // 내용 수정
        String content = scanner.nextLine();

        vo.setTitle(title);
        vo.setWriter(writer);
        vo.setContent(content);
        // 등록한 현재 날짜 저장
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss(수정됨)");
        String registDate = sdf.format(new Date());
        vo.setRegistDate(registDate);// 등록 날짜를 수정 날짜로 변경

        boardList.set(boardList.indexOf(vo), vo); // 해당 객체의 인덱스 위치에 vo를 저장
        System.out.println("글이 수정되었습니다.\n");
    }

    // 게시글 삭제
    public void boardDelete(int select) {
        if (boardList.isEmpty()) {
            System.out.println("게시글이 없습니다.");
            return;
        }

        BoardVO vo = new BoardVO();
        vo = boardList.get(select - 1);
        boardList.remove(boardList.indexOf(vo));
        System.out.println(select + "번 글이 삭제되었습니다.");
    }

    // 입력 스트림(메모장 파일 읽기)
    public void txtRead() throws IOException {
        Reader reader = new FileReader("D:/temp/BoardDB.txt");
        while (true) {
            int data = reader.read();
            if (data == -1)
                break;
            System.out.print((char) data);
        }
        reader.close();
        System.out.println("데이터 로드 완료");
    }

    // 출력 스트림 (메모장 파일 쓰기)
    public void txtWrite() throws IOException {
        Writer writer = new FileWriter("D:/temp/BoardDB.txt");
        String[] data = new String[10000];
        for (int i = 0; i < boardList.size(); i++) {
            BoardVO vo = boardList.get(i);
            data[i] = boardList.indexOf(vo) + " " + vo.getTitle() + " " + vo.getContent() + " " + vo.getWriter()
                    + " " + vo.getRegistDate() + " \n";
            writer.write(data[i]);
        }

        writer.flush();
        writer.close();
        System.out.println("현재 데이터 저장완료");
    }
}