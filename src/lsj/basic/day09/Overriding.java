package lsj.basic.day09;

public class Overriding {
    public static void main(String[] args) {
        // redefinition of override
        // one of the three representative OOP principal
        // use same name of the method in child class
        // which is from method of upper class
        Cat c = new Cat();
        System.out.println(c.cry());

        Dog d = new Dog();
        System.out.println(d.cry());
    }
}

class Animal {
    public String cry() { return "동물이 웁니다";}
    public String eat() { return "동물이 먹습니다";}

}

class Cat extends Animal{
    @Override
    public String cry() {
        return "야 옹";
    }
}

class Dog extends Animal{
    @Override
    public String cry() {
        return "멍 멍";
    }
}

