package lsj.basic.day15;

import lsj.basic.grade.GradeVO;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerialiseSungjuk {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("성적데이터를 입력하세요 (이름 국어 영어 수학)");
        String name = sc.next();
        int korean = sc.nextInt();
        int english = sc.nextInt();
        int math = sc.nextInt();

        GradeVO go = new GradeVO(name, korean, english, math);
        go.setTotal(korean + english + math);
        go.setAvg(go.getTotal() / 3);

        String fpath = "c:/Java/sungjuk.bin";
        FileOutputStream fos = new FileOutputStream(fpath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(go);

        oos.close();
        bos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fpath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        GradeVO goVO = (GradeVO) ois.readObject();

        System.out.println(goVO.getName() + "," + goVO.getKor() + "," + goVO.getEng()
                + "," + goVO.getMath() + "," + go.getTotal() + "," +  go.getAvg());

        ois.close();
        bis.close();
        fis.close();
    }

}
