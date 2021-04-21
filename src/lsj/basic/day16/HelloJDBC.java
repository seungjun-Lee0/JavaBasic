package lsj.basic.day16;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJDBC {
    public static void main(String[] args) {
        // JDBC
        // java database connectivity
        // 자바 프로그래밍 언어를 통해 다양한 관계형 데이터베이스에
        // 접속하고, SQL 문을 실행하고자 할 때 사용하는
        // 표준 SQL 인터페이스
        // 이것을 통해 데이터베이스 코드를 한 번만
        // 작성해두면 어떤 DBMS 라도 코드 변경없이
        // 동일하게 작동할 수 있음

        // JDK 에 포함된 JDBC 인터페이스는 java.sql 패키지 아래에 있음
        // 하지만, 이 것만으로는 작동하지 않고
        // 각 데이터베이스 제조사가 JDBC 인터페이스를 구현해서
        // 작성한 클래스가 필요한데, 이것을 JDBC 드라이버 매니저라 한다
        // JDBC 드라이버 매니저는 데이터베이스 제조가 홈페이지에서
        // 내려받을 수 있음

        // amazon 데이터 베이스 접속 확인
       String drv = "org.mariadb.jdbc.Driver"; // .jar 드라이버 다운 필수!
       String amz = "";
       String url = "jdbc:mariadb://" + amz + ":3306/bigdata";
       String usr = "bigdata";
       String pwd = "bigdata2020";

        // 1. JDBC 드라이버를 메모리에 초기화함
        try {
            Class.forName(drv);
        }catch (ClassNotFoundException e){
            System.out.println("드라이버를 확인 하세요");
        }

        // 2. 데이터베이스 서버에 접속
        try (
                Connection connection =
                        DriverManager.getConnection(url,usr,pwd);
        ){
            if(connection != null){
                System.out.println("데이터베이스 연결 성공");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // oracle
        String drv2 = "oracle.jdbc.OracleDriver"; // .jar 드라이버 다운 필수!
        String url2 = "jdbc:oracle:thin:@/xe";
        String usr2 = "system";
        String pwd2 = "bigdata2020";

        try{
            Class.forName(drv2);
        }catch (ClassNotFoundException e){
            System.out.println("드라이버를 확인 하세요");
        }

        try(
                Connection connection =
                        DriverManager.getConnection(url2,usr2,pwd2);
        ){
            if(connection != null){
                System.out.println("데이터베이스 연결 성공");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // postgresql
        String drv3 = "org.postgresql.Driver"; // .jar 드라이버 다운 필수!
        String url3 = "jdbc:postgresql:///postgres";
        String usr3 = "postgres";
        String pwd3 = "bigdata2020";

        try{
            Class.forName(drv3);
        }catch (ClassNotFoundException e){
            System.out.println("드라이버를 확인 하세요");
        }

        try(
                Connection connection =
                        DriverManager.getConnection(url3,usr3,pwd3);
        ){
            if(connection != null){
                System.out.println("데이터베이스 연결 성공");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
