package lsj.basic.day11;

public class JavaLang{
    public static void main(String[] args) {
        // java.lang 패키지
        // 자바 프로그램에서 가장 기본이 되는 클래스와 인터페이스를 보관
        // usable without import command
        // Math, String, StringBuilder/StringBuffer

        // Object class
        // origin of every class
        // toString, equals, hashCode외
        // 6개의 메서드가 정의되어 있음
        // 대다수 클래스는 Object 클래스가 제공하는
        // toString과 equals 메서드를 오버라이딩해서 사용
        Member m = new Member();
        m.userid = "abc123";
        m.passwd = "987xyz";

        String fmt = "아이디 : %s, 비밀번호 : %s \n";
        System.out.printf(fmt, m.userid, m.passwd);
        // 출력할 변수가 많아지면 코드도 복잡해 짐
        // 또한, 출력횟수가 여러번이면 코드를 중복 작성
        // => 클래스의 멤버변수를 출력할때는 toString메서드 사용

        System.out.println(m.toString());
        // toString메서드를 이용해서 출력함

        // Math class
        // support methods about mathematical calculation
        // can call directly
        // max, min, random, celi, floor, round
        System.out.println("PI: " + Math.PI);
        System.out.println(Math.ceil(8.1));

        // ex) 전체게시물 수 : 125
        //     페이지당 게시물 수 : 10
        //     총 페이지 수는?
        System.out.println(Math.ceil((double)125/10));

        // ex) 3.14159265에서 소수점 2째 자리까지 구하려면?
        System.out.println(Math.round(Math.PI * 100)/100.0);

        // max, min
        System.out.println(Math.max(10,11));
        System.out.println(Math.max(-10,-11));

        // String class
    }
}

class Member {
    String userid;
    String passwd;

    @Override
    public String toString() {
        String fmt = "{userid = %s, passwd = %s}\n";
        String result = String.format(fmt, userid, passwd);

        return result;
    }
}
