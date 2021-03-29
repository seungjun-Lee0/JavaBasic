package lsj.basic.day06;

import java.util.Scanner;

public class Breaks {
    public static void main(String[] args) {
        // control iteration: break, continue

        // ex) 1 ~ 100까지의 총합을 구해서 출력
        // 단, 총합이 500을 넘는 경우
        int sum = 0;
        //int index;
        //Scanner sc = new Scanner(System.in);

        //System.out.print("N 까지의 합\nN: ");
        //index = sc.nextInt();

        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum >= 500) {
                System.out.println(i);
                break;
            }
        }

        System.out.println("총합: " + sum);

        // ex) roll the dice until get number six

        int dice;
        int count = 0;
        while(true){
            dice = (int)(Math.random() * 6) + 1;
            count++;
            System.out.print(dice + " ");
            if (dice == 6) {
                System.out.println();
                System.out.println("굴린 횟수: " + count );
                break;
                }
            }
    }
}
