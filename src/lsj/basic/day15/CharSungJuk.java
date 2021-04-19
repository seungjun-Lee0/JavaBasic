package lsj.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        String fpath = "c:Java/sungjuk.dat";
        Scanner sc = new Scanner(System.in);

       /*System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("국어성적을 입력하세요");
        int korean = sc.nextInt();
        System.out.println("영어성적을 입력하세요");
        int english = sc.nextInt();
        System.out.println("수학성적을 입력하세요");
        int math = sc.nextInt(); */
        System.out.println("성적은? (이름 국어 영어 수학)");
        String name = sc.next();
        int korean = sc.nextInt();
        int english = sc.nextInt();
        int math = sc.nextInt();

        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(fpath, true);
            bw = new BufferedWriter(fw);

            String fmt = "%s,%d,%d,%d \n";
            String data = String.format(fmt,name,korean,english,math);
            bw.write(data);

            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("파일쓰기 오류");
            e.printStackTrace();
        }

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while (br.ready()){
                System.out.println(br.readLine());
            }

            br.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
