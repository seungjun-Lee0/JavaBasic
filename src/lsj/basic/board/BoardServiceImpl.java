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
                        "   게시글 올림판 V1       \n" +
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
            System.out.print("제목을 입력하세요: ");
            String title = sc.next();
            System.out.print("아이디를 입력하세요: ");
            String name = sc.next();
            System.out.print("내용을 입력하세요: ");
            sc.nextLine();
            String content = sc.nextLine();

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
        String fmt =  "                                       자유게시판\n" +
                      "_____________________________________________________________________________________________\n";
        String fmt2 = "no: %s user: %s title: %s date: %s like %d / views %d\n" +
                      "---------------------------------------------------------------------------------------------\n";
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

            if(bd.getBdno() == null){
                System.out.println("게시글이 존재하지 않습니다");
            }
            else {
                String result = String.format(fmt, bd.getBdno(), bd.getTitle(), bd.getUserid(),
                        bd.getRegdate(), bd.getViews(), bd.getThumsup(), bd.getContents());
                System.out.println(result);

                try {
                    while(true) {
                        System.out.println("추천하시겠습니까? (예:1 아니오:0)");
                        int options = sc.nextInt();
                        bd.setBdno(Integer.toString(pos));
                        if (options == 1) {
                            bddao.thumpsUP(bd);
                            System.out.println("추천하셨습니다");
                            return;
                        } else if (options == 0) {
                            return;
                        } else {
                            System.out.println("잘못 입력하셨습니다");
                        }
                    }
                }catch (Exception e){
                    System.out.println("잘못 입력하셨습니다");
                    return;
                }
            }
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다");
            return;
        }

    }

    @Override
    public void modifyBoard() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("수정할 게시글 번호를 입력하세요");
            int pos = sc.nextInt();
            System.out.println("수정할 제목을 입력하세요");
            String title = sc.next();
            System.out.println("수정할 아이디를 입력하세요");
            String userid = sc.next();
            System.out.println("수정할 내용을 입력하세요");
            sc.nextLine();
            String contents = sc.nextLine();


            BoardVO bd = new BoardVO(title,userid,contents);
            bd.setBdno(Integer.toString(pos));
            int cnt = bddao.updateBoard(bd);
            if (cnt > 0 ) System.out.println("게시글 수정 완료");

        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다");
            return;
        }

    }

    @Override
    public void deleteBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("삭제할 게시글의 번호를 입력하세요");
            int sjno = sc.nextInt();

            int cnt = bddao.deleteBoard(sjno);
            if (cnt > 0) {System.out.println("게시글 삭제 완료");}
            else{
                System.out.println("게시글이 없습니다");
            }
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다");
            return;
        }
    }
}
