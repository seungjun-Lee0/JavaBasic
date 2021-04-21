package lsj.basic.day17;

import java.sql.*;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC 로 구현
        // 테이블명 : NMember
        // 테이블 컬럼 구성 : 아이디 userid, 비밀번호 passwd, 이름 name, 생년월일 birth,
        //                    본인 확인 이메일 email, 휴대전화 hp
        // 자동입력 컬럼 : 회원번호 mbno, 가입일 regdate

        //CreateTable();
        //InsertValue();
        ViewMembers();


    }

    public static void CreateTable(){
        String sql = "CREATE TABLE NMember (" +
                " userid varchar(30) not null," +
                " passwd varchar(30) not null," +
                " name varchar(30) not null," +
                " birth DATE not null, " +
                " gender int not null, " +
                " email varchar(30) not null," +
                " hp varchar(30) not null," +
                " mbno int NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                " regdate Datetime default now())";

        MariaJDBC jdbc = new MariaJDBC();

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            int cnt = pstmt.executeUpdate();
            if (cnt> 0) System.out.println("데이터 생성완료");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void InsertValue(){
        String newMember = " insert into NMember " +
                "(userid, passwd, name, birth, gender, email, hp)" +
                "values ('%s', '%s', '%s', '%s', %d, '%s', '%s')";

        /*String newMember = " insert into NMember " +
                "(userid, passwd, name, birth, gender, email, hp)" +
                " values (?,?,?,?,?,?,?) ";*/

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 비밀번호 이름 생년월일 " +
                "성별 이메일 휴대전화를 입력하세요");
        String userid = sc.next();
        String passwd = sc.next();
        String name = sc.next();
        String birth = sc.next();
        int gender = sc.nextInt();
        String email = sc.next();
        String hp = sc.next();

        String sql2 = String.format(newMember, userid, passwd, name, birth, gender,
                email, hp);

        MariaJDBC jdbc = new MariaJDBC();

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql2);
        ){
            int cnt = pstmt.executeUpdate();
            if (cnt>0) System.out.println("회원 가입 성공");

            /*pstmt.setString(1, userid);
            pstmt.setString(2, passwd);
            pstmt.setString(3, name);
            pstmt.setString(4, birth);
            pstmt.setInt(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, hp);
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("회원 가입 성공");*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void ViewMembers(){
        String readAll = "select mbno, userid, name, regdate " +
                "From NMember";

        MariaJDBC jdbc = new MariaJDBC();

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(readAll);
                ResultSet rs = pstmt.executeQuery();
                ) {
            StringBuffer sb = new StringBuffer();
            String fmt = "%d %s %s %s\n";
            while(rs.next()){
                String result = String.format(fmt,
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4).substring(0, 10));
                sb.append(result);
            }
            System.out.println(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

