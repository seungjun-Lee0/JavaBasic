package SJ.basic.day06;

import java.util.Scanner;

public class Ex05 {
    public static void checkBirth(){
        int birthY;
        int birthM;
        int birthD;
        int currentY;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("input your birth year");
        birthY = sc.nextInt();
        System.out.println("input your birth month");
        birthM = sc.nextInt();
        System.out.println("input your birth day");
        birthD = sc.nextInt();
        System.out.println("input current year");
        currentY = sc.nextInt();

        age = currentY - birthY + 1;
        System.out.println("Your age: " + age);
    }
    public static void charge(){
        int totalPrice;
        int paidPrice;
        int change;

        Scanner sc = new Scanner(System.in);

        System.out.println("input total price");
        totalPrice = sc.nextInt();
        System.out.println("input money that you gave");
        paidPrice = sc.nextInt();

        change = paidPrice - totalPrice;

        int ten;
        int fifty;
        int hund;
        int fiveHund;
        int k;
        int fiveK;
        int tenK;
        int fiveHundK;

        fiveHundK = change / 50000;
        tenK = (change - fiveHundK * 50000) / 10000;
        fiveK = (change - (fiveHundK * 50000) - (tenK * 10000)) / 5000;
        k = (change - (fiveHundK * 50000) - (tenK * 10000) - (fiveK * 5000)) / 1000;
        fiveHund = (change - (fiveHundK * 50000) - (tenK * 10000) - (fiveK * 5000)
                - (k * 1000)) / 500;
        hund = (change - (fiveHundK * 50000) - (tenK * 10000) - (fiveK * 5000)
                - (k * 1000) - (fiveHund * 500)) / 100;
        fifty = (change - (fiveHundK * 50000) - (tenK * 10000) - (fiveK * 5000)
                - (k * 1000) - (fiveHund * 500) - (hund * 100)) / 50;
        ten = (change - (fiveHundK * 50000) - (tenK * 10000) - (fiveK * 5000)
                - (k * 1000) - (fiveHund * 500) - (hund * 100) - (fifty * 50)) / 10;

        System.out.println("change: " + change + "\n" + "50000: " + fiveHundK +
                " 10000: " + tenK + " 5000: " + fiveK + " 1000: " + k + " 500: " +
                fiveHund + " 100: " + hund + " 50: " + fifty + " 10: " + ten);
    }

    public static void main(String[] args) {
        //heckBirth();
        charge();
    }
}
