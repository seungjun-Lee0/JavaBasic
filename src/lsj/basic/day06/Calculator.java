package lsj.basic.day06;

import java.util.Scanner;

public class Calculator {
    public static String addition(int a, int b){
        int sum = 0;
        sum = a + b;

        String fmt = a + " + " + b +" = " + sum;
        return fmt;
    }

    public static void addition2(){
        int a, b;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("input two numbers");
        System.out.print("first number: ");
        a = sc.nextInt();

        System.out.print("second number: ");
        b = sc.nextInt();

        sum = a + b;

        String fmt = "input values are %d, %d \n" +
                "sum of two numbers are %d\n";
        System.out.printf(fmt, a, b, sum);
    }

    public static void main(String[] args) {
        // basic calculator
        // ex) execute addition by getting two input values
        System.out.println(addition(3, 100));
        addition2();

    }
}
