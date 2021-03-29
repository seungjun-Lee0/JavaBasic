package lsj.basic.day08;

public class ValueObject {

    public static void main(String[] args) {
        // setter / getter
        // basically access modifier of class member variable
        // recommend to be declared as private - data hiding
        // in this way external classes are not able
        // to assess member variables
        // use setter / getter method to give the access

        C sj = new C();
        sj.setName("혜교");
        sj.setKor(77);
        sj.setEng(66);
        sj.setMath(87);

        System.out.println(sj.getName());
        System.out.println(sj.getKor());
        System.out.println(sj.getEng());
        System.out.println(sj.getMath());
        // OOP does not recommend direct access from external
        // to obtain variables of object
        // So, data is protected from external access
        // user need to use public method(setter/getter) in order to access
    }
}

class C{
    private String name;
    private int kor;
    private int eng;
    private int math;

    // setter : public setVariableName(variableName)
    // use it when user input values from outside of the class
    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // getter : public returnType getVariableName()

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}

class D {
    private String userid;
    private String password;
    private String email;

    public D() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

