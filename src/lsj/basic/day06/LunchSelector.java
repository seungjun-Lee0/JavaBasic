package lsj.basic.day06;

import java.util.Random;
import java.util.Scanner;

public class LunchSelector {
    public static void main(String[] args) {
        // choose lunch menu by using array
        int menuIndex;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose quantity");
        menuIndex = sc.nextInt();

        String[] lunchMenu = new String[menuIndex];

        for(int i = 0; i < lunchMenu.length; i++) {
            System.out.println("make option");
            lunchMenu[i] = sc.next();
        }

        // magic number 0 ~ (n-1): random * n
        // magic number more than or equal to 'a'
        // less than 'b' : random * (maxValue - minValue) + minValue

        Random rnd = new Random();
        int choice = rnd.nextInt(lunchMenu.length);
        int choice2 = (int)(Math.random() * lunchMenu.length);

        System.out.println(lunchMenu[choice2]);
    }
}
