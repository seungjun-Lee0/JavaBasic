package lsj.basic.day12;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = (Math.abs(num1 - num2) + 1) * (num1 + num2) / 2;
        System.out.println(sum);


        int begin = num1;
        int end = num2;

        int sum2 = 0;

        if(begin > end){
            begin = num2; end = num1;
        }

        for(int i = begin; i <=end;i++){
            sum2 +=i;
        }

        String fmt = "%d %d %d";
        System.out.printf(fmt, num1, num2, sum2);
    }
}
