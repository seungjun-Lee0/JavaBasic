package lsj.basic.day17;

import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AdvJDBC {
    public static void main(String[] args) {

        // jdbc .properties 파일 경로 지정
        String pkpath = "lsj.basic.jdbc.jdbc";
        ResourceBundle rb = ResourceBundle.getBundle(pkpath);

        /*System.out.println(rb.getString("mdrv"));
        System.out.println(rb.getString("murl"));
        System.out.println(rb.getString("musr"));
        System.out.println(rb.getString("mpwd"));*/

        // JDBC 프로그램에서 공통적으로 작성하는 코드들 중 하나는
        // 디비 접속부분과 해제부분임
        // 이것을 따로 클래스로 만들어 관리하면
        // 유지보수에 많은 장점을 가져다 줌

        // ex) playground 데이터베이스에 books 테이블을
        // 생성하고 새로운 도서정보를 입력하는 프로그램을 작성
        // 컬럼정보 : bookid, bookname, publisher, price
        // Scanner 클래스를 이용하여 정보 입력
        
        // ? : parameter placeholder
        // 동적SQL문을 사용해서 매개변수를 지정해서
        // 완전한 형태의 SQL문으로 만드는 방식을 추천
        // xss 해킹을 방지하는데에도 도움이 됨
        String sql = " insert into books " +
                " values (?,?,?,?) ";
        
        // parameter placeholder 사용하기 전
        // 자주 사용되었던 방식
        //sql = " insert into books " +
        //      " values ("+ bkid +", '"+ name +"', '"
        //      + publish + "', " + price+ ") "

        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호 도서명 출판사 가격");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publisher= sc.next();
        int price = Integer.parseInt(sc.next());

        MariaJDBC jdbc = new MariaJDBC();
        try(
                // statement vs prepareStatement
                // JDBC를 이용해서 SQL이 실행되는 순서
                // => Statement : SQL 분석 -> 컴파일 -> 실행
                // => PrepareStatement : (SQL 분석 -> 컴파일) -> 실행
                // Statement 객체로 sql 실행시 위 3가지 과정을 매 번 거쳐야 함
                // 반면, PrepareStatement 객체는 처음 실행시 3가지 과정을 거친후
                // 실행한 sql 을 캐시에 저장해 둠. 그런 다음에 실행시 캐시를
                // 재활용해서 실행하기 때문에 성능이 좋아짐

                // 반복실행 해야할 sql : PrepareStatement (DML)
                // 반복실행 필요없는 sql : Statement (DDL)
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                ){
            pstmt.setInt(1,bookid);
            pstmt.setString(2, bookname);
            pstmt.setString(3, publisher);
            pstmt.setInt(4, price);

            int cnt = pstmt.executeUpdate();
            if  (cnt > 0) System.out.println("도서 추가 완료");
        }catch (Exception e){
            e.printStackTrace();
        }

        // ex) playground 데이터베이스의 books 테이블에
        // 저장된 데이터들을 조회하는 프로그램 작성
        sql = "select * from books ";
        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
             ){
            String fmt = "%s %s %s %s\n";
            StringBuffer sb = new StringBuffer();

            while(rs.next()){
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                        );
                sb.append(result);
            }
            System.out.println(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class MariaJDBC {
    private ResourceBundle rb = null;
    private String DRV;
    private String URL;
    private String USR;
    private String PWD;


    public MariaJDBC() {
        String pkpath = "lsj.basic.jdbc.jdbc";
        rb = ResourceBundle.getBundle(pkpath);
        DRV = rb.getString("mdrv");
        URL = rb.getString("murl");
        USR = rb.getString("musr");
        PWD = rb.getString("mpwd");
    }

    public Connection openConn() {
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);

        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
