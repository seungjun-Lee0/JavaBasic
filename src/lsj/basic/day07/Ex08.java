package lsj.basic.day07;

import java.sql.SQLOutput;

public class Ex08 {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc2 = new Account(1222, 20000, 4.5,
                "2014-08-15 14:34:29");
        acc.Display();
        acc2.Display();
    }

    static class Account{
        private int accNum;
        private int accBalance;
        private double accInterest;
        private String accDate;

        public Account(){
            accNum = 0;
            accBalance = 0;
            accInterest = 0;
        }

        public Account(int accNum, int accBalance, double accInterest, String accDate) {
            this.accNum = accNum;
            this.accBalance = accBalance;
            this.accInterest = accInterest;
            this.accDate = accDate;
        }

        public void Display(){
            String fmt = "%d %d %.1f %s\n";
            System.out.printf(fmt,accNum, accBalance, accInterest, accDate);
        }
    }
}