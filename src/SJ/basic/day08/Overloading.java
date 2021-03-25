package SJ.basic.day08;

public class Overloading {
    public static void main(String[] args) {
        // method 다중정의(polymorphism) overloading
        // one of the three representative OOP principal
        // use several methods which have same name
        // write signature to declare methods that have same name
        NonOver no = new NonOver();
        System.out.println(no.add(5,3));
        System.out.println(no.add(5, 3, 3));
        System.out.println(no.add(5.1, 3));
    }
}

class NonOver {
    // if polymorphism is not applicable
    // every method that is created need to have their own name
    // it makes developer to memorise all the name of methods
    // thus applying polymorphism lose the burden of the developers

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
}
