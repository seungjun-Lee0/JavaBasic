package lsj.basic.day10;

public class Static {
    public static void main(String[] args) {
        // class variable (field)
        // declared variables in the class
        // instance variable: value is created and saved individually and independently
        // class variable: once the value is created and stored, it shares values in
        // every domain.

        // does not need to control each object individually
        // use it when every class need to maintain shared value
        // need to declare the keyword 'static'
        // class variable can be used without the process of object creation
        // how to call: className.variableName

        // in general, recommend to use single instance variable

        Member m1 = new Member();
        m1.userid = "혜교";
        m1.userPwd = "abc123";
        m1.allOfMember = 2;
        System.out.println(m1.userid + "/" + m1.userPwd + "/" + Member.allOfMember);

        Member m2 = new Member();
        m2.userid = "지현";
        m2.userPwd = "123abc";
        m2.allOfMember = 1;
        System.out.println(m2.userid + "/" + m2.userPwd + "/" + Member.allOfMember);
        System.out.println(Member.allOfMember + "/" + m2.allOfMember);
        System.out.println(Member.allOfMember + "/" + m1.allOfMember);
        // m1.allOfMember and m2.allOfMember reference same variable
    }
}

class Member{
    static int allOfMember;     // class variable
    String userid;              // instance variable
    String userPwd;
}

