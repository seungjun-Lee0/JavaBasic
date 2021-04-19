package lsj.basic.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto645V1 {
    public static void main(String[] args) {
        List<Integer> lottoNums = new ArrayList<>();

        List<Integer> nums = new ArrayList<>();
        for(int i= 0; i <= 45; i++){
            nums.add(i);
        }

        // non restoring extraction - not able to pick the value that has been picked
        for(int i =0; i < 6; i ++){
            Random rnd = new Random();
            int idx = rnd.nextInt(45 - i);

            lottoNums.add(nums.get(idx));

            // remove the number that came out
            nums.remove(idx);
        }
        System.out.println(lottoNums);
    }
}
