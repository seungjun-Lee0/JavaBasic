package SJ.basic.day06;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Methods {
    public static void make_magic(){
        int magic = (int)(Math.random() * 10) + 1;
        System.out.println(magic + " ");
    }

    public static void say_hello(){
        System.out.println("Hello, World!!");
    }

    public static void say_hello2(){
        System.out.println("Hello, Java!!");
    }

    public static void say_hello3(String msg){
        System.out.println("Hello, " + msg +"!!");
    }

    public static String say_hello4(String msg){
        String say = ("Hello, " + msg +"!!");
        return say;
    }

    public static void main(String[] args) {
        // method : group of codes that conduct specific actions
        // similar to the function in C language
        // reduce use of repetitive code (higher code quality)
        // easier maintenance when error has been arisen at codes or functions

        // [accessModifier] [returnType] methodName(parameterList) {
        //          method Body
        //          return variable
        //      }
        // access modifier : designate access permission (public/private)
        // return type     : designate type of the return value
        //                   use void as return type when return type is not exist
        // parameter list  : designate variable when the method is called

        // ex) create random number 1 ~ 10 v1
        for(int i = 0; i < 10; i++) {
            int magic = (int)(Math.random() * 10) + 1;
            System.out.println(magic + " ");
        }

        // ex) create random number 1 ~ 10 v2
        for(int i = 0; i < 10; i++) {
            make_magic();
        }

        // output greeting v1
        say_hello();

        // output greeting v2
        say_hello2();

        // output greeting v3
        say_hello3("someone");

        // output greeting v4
        System.out.println(say_hello4("Beautiful"));

    }
}
