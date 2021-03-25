package SJ.basic.day07;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex06 {

    public static void ageCalculator(){
        int birthY, birthM, birthD;
        int currentY, currentM, currentD;

        Scanner sc = new Scanner(System.in);
        String fmt = "현재: %d년 %d월 %d일 \n" +
                "생일: %d년 %d월 %d일 \n" +
                "나이: %d세";
        LocalDate now = LocalDate.now();

        currentY = now.getYear();
        currentM = now.getMonthValue();
        currentD = now.getDayOfMonth();

        System.out.print("생일의 년도: ");
        birthY = sc.nextInt();

        System.out.print("생일의 월: ");
        birthM = sc.nextInt();

        System.out.print("생일의 일: ");
        birthD = sc.nextInt();

        int age = currentY - birthY - 1;

        if(birthM < currentM || (birthM == currentM && birthD <= currentD )) {
            age = age + 1;
        }

        System.out.printf(fmt, currentY, currentM, currentD
                , birthY, birthM, birthD, age);
    }
    public static void changeCalculator(){
        int totalPrice;
        int paidPrice;
        int change;

        Scanner sc = new Scanner(System.in);

        System.out.println("input total price");
        totalPrice = sc.nextInt();
        System.out.println("input money that you gave");
        paidPrice = sc.nextInt();

        change = paidPrice - totalPrice;

        int[] wons = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] changeList = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int i = 0; i < 8; i++){
            wons[i] = change / changeList[i];
            change %= changeList[i];
        }

        System.out.println("change: " + (paidPrice - totalPrice) + "\n" + "50000: " + wons[0] +
                " 10000: " + wons[1] + " 5000: " + wons[2] + " 1000: " + wons[3] + " 500: " +
                wons[4] + " 100: " + wons[5] + " 50: " + wons[6] + " 10: " + wons[7]);

    }
    public static void main(String[] args) {
        // input birth information to calculate age
        // current year - birth year

        //ageCalculator();
        changeCalculator();
    }
}
