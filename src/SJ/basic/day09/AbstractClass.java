package SJ.basic.day09;

public class AbstractClass {
    public static void main(String[] args) {
        // Abstract class
        // it is a restricted class that cannot be used to create objects
        // (to access it, it must be inherited from another class)

        // Abstract method : incomplete method
        // thus, it does not contain the body, but declaration

        Cat2 c = new Cat2();
        c.cry();
    }
}

abstract class Animal2 {
    protected String name;

    abstract public void cry();
}

class Cat2 extends Animal2 {

    @Override
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog2 extends Animal2 {

    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}