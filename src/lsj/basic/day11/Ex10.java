package lsj.basic.day11;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 14.
        int input1 = 1234567890;
        int input2 = 98765;
        int input3 = 12345;
        int dayInSeconds = 86400;
        int hourInSeconds = 3600;
        int minutesInSeconds = 60;

        System.out.println(Math.round((double)input1 / dayInSeconds));
        System.out.println(Math.round((double)input2 / hourInSeconds));
        System.out.println(Math.round((double)input3 / minutesInSeconds));

        // 25.
        Scanner sc = new Scanner(System.in);
        String yourKey;

        Random rn = new Random();
        Integer lottoKey = rn.nextInt(900) + 100;

        lottoKey.toString();

        int match = 0;

        System.out.println("input 3 digit number");
        yourKey = sc.nextLine();

        char lkey1 = String.valueOf(lottoKey).charAt(0);
        char lkey2 = String.valueOf(lottoKey).charAt(1);
        char lkey3 = String.valueOf(lottoKey).charAt(2);

        char ykey1 = String.valueOf(yourKey).charAt(0);
        char ykey2 = String.valueOf(yourKey).charAt(1);
        char ykey3 = String.valueOf(yourKey).charAt(2);

        if ( (lkey1 == ykey1 || lkey1 == ykey2 || lkey1 == ykey3)
                && (lkey2 == ykey1 || lkey2 == ykey2 || lkey2 == ykey3)
        && (lkey3 == ykey1 || lkey3 == ykey2 || lkey3 == ykey3)) {
        }
        /*
        for(int i = 0; i <3; i++){
            char lKey = String.valueOf(lottoKey).charAt(i);
            for(int j = 0; j < 3; j++){
                char yKey = String.valueOf(yourKey).charAt(i);
                if(lKey == yKey) ++ match;
            }
        }*/

        System.out.println(yourKey + "/" + lottoKey);
        System.out.println("일치개수: " + match);
    }
}
