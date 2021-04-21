package lsj.basic.day17;


import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class JDBCCRUD {
    public static void main(String[] args) throws ClassNotFoundException {
        // ex) playground 데이터베이스에 books 테이블을
        // 생성하고 새로운 도서정보를 입력하는 프로그램을 작성
        // 컬럼정보 : bookid, bookname, publisher, price
        // Scanner 클래스를 이용하여 정보 입력

        // JDBC 접속정보
        String drv = "org.mariadb.jdbc.Driver"; // .jar 드라이버 다운 필수!
        String amz = "";
        String url = "jdbc:mariadb://" + amz + ":3306/playground";
        String usr = "playground";
        String pwd = "bigdata2020";

        // JDBC 관련 sql 정의
        String books = "create table books (bookid int, " +
                "bookname varchar(30), publisher varchar(30), price int);";
        String newBooks = " insert into books values " +
                "(99999,'java','oracle',10000); ";
        String newBooks2 = " insert into books values " +
                "(%d, '%s', '%s', %d); ";

        // JDBC 작업 시작작
        Class.forName(drv);

        try(
                // 드라이버 매니저를 이용해서
                // DBMS에 접속하고 세션을 하나 가져옴
                Connection cnn = DriverManager.getConnection(url, usr, pwd);

                // 연결된 세션을 통해 SQL을 실행할 수 있도록
                // statement 객체 생성
                Statement stmt = cnn.createStatement();
        ) {
                // 지정한 SQL을 실행하고 결과를 받아옴
                 boolean isOk = stmt.execute(books);
                if (isOk) System.out.println("도서 테이블 생성!");
        } catch (Exception e) {
            System.out.println("테이블이 이미 존재하거나 시스템 오류");
        }

        try (
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ){
            boolean isOk = stmt.execute(newBooks);
            if(isOk) System.out.println("데이터 저장 성공");
        } catch (Exception ex){
            ex.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호 도서명 출판사 가격");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publisher= sc.next();
        int price = Integer.parseInt(sc.next());

        String sql = String.format(newBooks2, bookid, bookname,
                publisher, price);

        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ){
            boolean isOK = stmt.execute(sql);
            if (isOK) System.out.println("데이터 저장 성공");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
