package lsj.basic.day14;

import java.util.HashSet;
import java.util.Random;

public class Lotto645V2 {
    public static void main(String[] args) {
        HashSet<Integer> lottoNums = new HashSet<>();


        while(lottoNums.size() < 6){
            Random rnd = new Random();
            lottoNums.add(rnd.nextInt(45) + 1);
        } // repeat eternally until replication element are not come out


        System.out.println(lottoNums);
    }
}
