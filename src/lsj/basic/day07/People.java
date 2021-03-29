package lsj.basic.day07;

public class People {
    public static void main(String[] args) {
        // outline of objected-oriented programming
        // recognize every data as an object while developing software

        // class : frame of object
        // class contains field/properties that indicate status
        // of object and method that indicates function of object

        // 클래스 실제 정보x
        // 객체화 필요
        // 객체화를 통해 나온 결과물 : 객체/인스턴스
        // 클래스의 필드와 기능이 실제 메모리상에 할당 된 것

        // possible to create several objects in one class
        // those objects can get unique variables that is
        // stored in independent memory space

        // general class component
        // getter / setter

        // Customer info
        // name, job, age, gender, blood type
        // eat, sleep, speak, walk

        String name;
        String job;
        int age;
        String gender;
        String blood;

        name = "최승희";
        job = "의사";
        age = 45;
        gender = "여";
        blood = "A";

        // use of class
        // 1. class must be changed to object
        Person p = new Person();
        Student s = new Student();

        // 2. initialise class variables
        p.name = "이미녀";
        p.job = "골프선수";
        p.age = 28;
        p.gender = "여";
        p.blood = "O";

        s.sNum = 201350050;
        s.sName = "김태희";
        s.sAddress = "경기도 고양시";
        s.sBirthday = "1985.3.22";
        s.sMajor = "컴퓨터";
        s.tRoomNr = 504;

        Person p2 = new Person("김미남", "교수", 47,
                "남", "AB");

        Student s2 = new Student(202150006, "송혜교", "서울 영등포구", "1988.9.17",
                "컴퓨터", 504);

        // 객체에 대입한 값 출력하기
        System.out.println(p2.name);
        System.out.println(p2.job);
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println(p2.blood);

    }
    static class Person {
        private String name;
        private String job;
        private int age;
        private String gender;
        private String blood;

        // 생성자(constructor) : 변수초기화 관련 특수한 메서드
        // 기본생성자, 매개변수를 포함하는 생성자

        // 기본생성자 : 컴파일러가 자동으로 생성해서 추가해 줌
        // public 클래스명() {
        // 초기화 코드
        // }

        public Person() {}
        
        // shadowing 발생 방지를 위해 this 를 사용
        public Person(String name, String job, int age, String gender, String blood) {
            this.name = name;
            this.job = job;
            this.age = age;
            this.gender = gender;
            this.blood = blood;
        }
    }

    static class Student{
        private int sNum;
        private String sName;
        private String sAddress;
        private String sBirthday;
        private String sMajor;
        private int tRoomNr;

        public Student() {}

        public Student(int sNum, String sName, String sAddress, String sBirthday
                        ,String sMajor, int tRoomNr){
            this.sNum = sNum;
            this.sName = sName;
            this.sAddress = sAddress;
            this.sBirthday = sBirthday;
            this.sMajor = sMajor;
            this.tRoomNr = tRoomNr;
        }
    }
}
