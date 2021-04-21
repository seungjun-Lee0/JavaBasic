package lsj.basic.day17;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCRUD2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // ex) playground 데이터베이스의 books 테이블에
        // 저장된 데이터들을 조회하는 프로그램 작성
        // 조회대상 : 모든 컬럼

        // JDBC 접속정보
        String drv = "org.mariadb.jdbc.Driver"; // .jar 드라이버 다운 필수!
        String amz = "";
        String url = "jdbc:mariadb://" + amz + ":3306/playground";
        String usr = "playground";
        String pwd = "bigdata2020";

        String readAll = " select * from books ";

        Class.forName(drv);
        try (
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stat = conn.createStatement();

                // 지정한 SQL을 실행하고 결과집합을 받아옴
                // 단, select 실행시에만 사용
                ResultSet rs = stat.executeQuery(readAll);
                ){
                StringBuffer sb = new StringBuffer();

                while (rs.next()){
                    // 결과집합에서 불러올 데이터가 없을 때까지 반복
                    // 결과집합에서 첫 번째 컬럼값을 문자형태로 읽어옴
                    sb.append(rs.getString(1))
                    .append(rs.getString(2))
                    .append(rs.getString(3))
                    .append(rs.getString(4))
                    .append("\n");
                }

            System.out.println(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

        // readAll2
        String readAll2 = " select * from regions";

        try(
                Connection conn = DriverManager.getConnection(url, usr, pwd);
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(readAll2);
             ){
                StringBuffer sb = new StringBuffer();
                String fmt = "%s %s\n";

               /*while(rs.next()){
                   sb.append(rs.getString(1))
                   .append(" ")
                   .append(rs.getString(2))
                   .append("\n");
               }*/

                while(rs.next()){
                    String result = String.format(fmt,
                            rs.getString(1),
                            rs.getString(2));
                sb.append(result);
            }

            System.out.println(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        // readOne
        String readOne = " select first_name from employees";

        try(
                Connection conn = DriverManager.getConnection(url, usr, pwd);
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(readOne);
        ){
            StringBuffer sb = new StringBuffer();

            while(rs.next()){
                sb.append(rs.getString(1))
                        .append("\n");
            }

            //System.out.println(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
