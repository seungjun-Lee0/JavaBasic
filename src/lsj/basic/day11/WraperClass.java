package lsj.basic.day11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WraperClass {
    public static void main(String[] args) {
        // wrapper class
        // change primitive types to reference types
        // int -> Integer, double -> Double
        // char -> Character, boolean -> Boolean

        int a =123;

        // boxing : change primitive type to reference type
        Integer b = new Integer(a);

        // use advantages of class through boxing
        System.out.println(a);
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int number = Integer.parseInt(sc.next());

        // unboxing : reference type to primitive type
        int c = b.intValue();

        Integer d = 456;

        int e = d;

        System.out.println(Integer.toBinaryString(4));

        // compare two numbers
        // compareTO(num1, num2)
        // result : 1, 0, -1 ex) 4.compareTO(3) => 1
        System.out.println(b.compareTo(d));
        System.out.println(Integer.compare(b, d));


    }
}
