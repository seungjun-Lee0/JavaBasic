package lsj.basic.day17;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCCRUD3 {
    public static void main(String[] args) throws ClassNotFoundException {
        // ex) playground 데이터베이스의 books 테이블에
        // 저장된 데이터들 중에서 출판사가 oracle인 도서의
        // 제목을 python 으로 변경하세요
        String sql = "UPDATE books SET bookname = 'python' where publisher = 'oracle' ";

        MariaJDBC jdbc = new MariaJDBC();

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("데이터 수정완료");
        }catch(Exception e){
            e.printStackTrace();
        }


        // ex) playground 데이터베이스의 books 테이블에
        // 저장된 데이터들 중에서 이름이 python인 도서를
        // 삭제하세요
        String sql2 = "DELETE FROM books where bookname = 'python' ";

        MariaJDBC jdbc2 = new MariaJDBC();

        try (
                Connection conn = jdbc2.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql2);
        ){
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("데이터 수정완료");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
