package lsj.basic.day10;

public class SayHello {
    // greeting program in different languages
    public static void main(String[] args) {

        SayHelloAction say = new SayHelloKor();
        say.sayHello();

        say = new SayHelloEng();
        say.sayHello();

        say = new SayHelloJpn();
        say.sayHello();
    }
}

interface SayHelloAction{
    void sayHello();
}

class SayHelloKor implements SayHelloAction{
    @Override
    public void sayHello() {
        System.out.println("안녕하세요, 자바8!");
    }
}

class SayHelloEng implements SayHelloAction{
    @Override
    public void sayHello() {
        System.out.println("Hello, Java8!!");
    }
}

class SayHelloJpn implements SayHelloAction{
    @Override
    public void sayHello() {
        System.out.println("こんばんは、ジャワ8!!");
    }
}
