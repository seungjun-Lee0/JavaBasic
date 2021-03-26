package SJ.basic.day08;

public class InheritanceA {

    public static void main(String[] args) {
        // method 상속 Inheritance
        // one of the three representative OOP principal
        // add or reform functions to the  original class
        // in order to make new class
        // original class : parent/upper/super class
        // created class : child/lower class

        // advantages
        // recycle original class
        // easy to read the relationship of classes
        // increase software productivity

        // usage
        // class className extends parentClassName { }
        Eagle e = new Eagle();
        System.out.println(e.eyes);
    }
}

class Animal{
    String eyes;
    String mouth;

    public void eat(){}
    public void sleep(){}

}

class Eagle extends Animal {
    String wing;

    public void fly(){}
}

class Tiger extends Animal {
    String legs;

    public void run(){}
}

class Goldfish extends Animal {
    String fin;

    public void swim(){}
}