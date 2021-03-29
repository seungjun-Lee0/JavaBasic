package lsj.basic.day08;

public class InheritanceB {
    public static void main(String[] args) {
        // superlative class
        // every class in java is inherited Object class
        // so, predefined method (equals, hashcode, notify, wait.
        // toString) which belongs to Object class can be used.

        Human s = new Human();
        System.out.println(s.speak);

        StudentWorker sw = new StudentWorker();
        System.out.println(sw.study);


    }
}
class A2 {

}


class Human {
    Object speak;
    Object eat;
    Object walk;
    Object sleep;
}

class Student extends Human {
    Object study;
}

class StudentWorker extends Student{
    Object work;
}

class Researcher extends Human{
    Object research;
}

class Professor extends Researcher{
    Object teach;
}