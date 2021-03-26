package SJ.basic.day09;

public class Interfaces {
    public static void main(String[] args) {
        // interface
        // An interface in the Java programming language is an abstract type
        // that is used to specify a behavior that classes must implement.
        // it summarise fundamental principals and functions
        // reduce repetitive code

        // Interface is composed of abstract method and static number
        // through abstract method it supports multiple inheritance

    }
}

abstract class Animal3 {
    protected int height;
    protected int weight;

    //public void cry();
}

interface Animal3Action {
    abstract public void cry();

}

class Cat3 extends Animal3 implements Animal3Action{

    @Override
    public void cry() {
        System.out.println("야옹~ 야옹~");
    }
}

class Dog3 extends Animal3 implements Animal3Action{

    @Override
    public void cry() {
        System.out.println("멍 멍");
    }
}

class Murloc extends Animal3 implements Animal3Action{

    @Override
    public void cry() {
        System.out.println("아옳옳");
    }
}

