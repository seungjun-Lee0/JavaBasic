package lsj.basic.board;

import lsj.basic.grade.SungJukVO;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardServiceImpl implements BoardService{

    // 싱글톤 패턴 사용
    private static BoardService bdsrv = null;
    private static BoardDAO bddao = null;

    private BoardServiceImpl() { bddao = new BoardDAOImpl(); }

    public static BoardService getInstance(){
        if(bdsrv == null) bdsrv = new BoardServiceImpl();
        return bdsrv;
    }

    @Override
    public void displayMenu() {
        String displaymenu =
                        "---------------------     \n" +
                        "    자유게시판 V1         \n" +
                        "---------------------     \n" +
                        " 1. 게시글 입력           \n" +
                        " 2. 게시판 조회           \n" +
                        " 3. 게시글 조회           \n" +
                        " 4. 게시글 수정           \n" +
                        " 5. 게시글 삭제           \n" +
                        " 0. 프로그램 종료         \n" +
                        "---------------------     \n" +
                        " 작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }

    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("제목을 입력하세요");
            String title = sc.next();
            System.out.print("이름을 입력하세요");
            String name = sc.next();
            System.out.print("내용을 입력하세요");
            String content = sc.next();


            // 입력받은 데이터를 객체화함
            BoardVO bd = new BoardVO(title, name, content);

            int cnt = bddao.insertBoard(bd);
            if(cnt>0) System.out.println("게시글 추가 완료");

            // 처리된 성적데이터를 동적배열에 저장
        } catch (Exception ex) {
            System.out.println("잘못입력하셨습니다!");
            return;  // 오류발생시 실행중단하고 main으로 복귀
        }
    }

    @Override
    public void showBoard() {
        String fmt  = "번호|글쓴이|      제목       |    등록일    |추천|조회|\n";
        String fmt2 = "%s    %s    %s               %s    %d    %d\n";
        ArrayList<BoardVO> bdList = (ArrayList<BoardVO>)  bddao.selectBoard();

        StringBuffer sb = new StringBuffer();
        for(BoardVO bd : bdList){
            String result = String.format(fmt2, bd.getBdno(), bd.getUserid(),
                    bd.getTitle(), bd.getRegdate(), bd.getThumsup(), bd.getViews());
            sb.append(result);
        }
        System.out.println(fmt + sb.toString());
    }

    @Override
    public void showOneBoard() {
        int views = 0;
        String fmt = "번호: %s 제목: %s\n" +
                     "이름: %s\n등록일: %s\n" +
                     "조회수: %d / 추천수: %d" +
                     "\n내용: %s\n";

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("조회할 게시글의 번호는? ");
            int pos = sc.nextInt();
            BoardVO bd = bddao.selectOneBoard(pos);
            String result = String.format(fmt, bd.getBdno(), bd.getTitle(), bd.getUserid(),
                    bd.getRegdate(), bd.getViews(), bd.getThumsup(), bd.getContents());
            System.out.println(result);
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다");
        }

    }

    @Override
    public void modifyBoard() {

    }

    @Override
    public void deleteBoard() {

    }
}
