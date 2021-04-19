package lsj.basic.day15;

import java.io.*;
import java.util.ArrayList;

public class Serialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 직렬화
        // 문자단위 파일 입출력시 저장된 데이터들은 모두 문자처럼 다뤄짐

        String fpath = "c:/Java/numbers.txt";
        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);

        String nums = br.readLine();

        System.out.println(nums);

        // 문자를 분리
        String num[] = nums.split(" ");

        // 문자를 정수로 변형해 더함
        int sum = Integer.parseInt(num[0]) +
                Integer.parseInt(num[1]);

        System.out.println(sum);

        br.close();
        fr.close();
        // 반면, 데이터의 고유 속성을 그대로 유지하면서
        // 파일형태로 저장하고 싶은 경우, 직렬화를 이용해야 함
        // 직렬화 : 데이터/객체를 바이트형태로 저장함
        // ObjectOutputStream, ObjectInputStream 클래스 사용

        // 직렬화
        String fpath2 = "c:/Java/serialize.dat";
        FileOutputStream fos = new FileOutputStream(fpath2);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        ArrayList data = new ArrayList<>();
        data.add("gd");
        data.add(87);
        data.add(90);
        data.add(88);

        // 준비된 데이터를 직렬화함
        oos.writeObject(data);

        oos.close();
        bos.close();
        fos.close();

        // 역직렬화 : 바이트 형태로 저장된 객체를 적절한 데이터로 변환
        FileInputStream fis = new FileInputStream(fpath2);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        ArrayList data2 = (ArrayList) ois.readObject();
        String name = (String) data2.get(0);
        int kor = (int) data2.get(1);
        int eng = (int) data2.get(2);
        int mat = (int) data2.get(3);

        System.out.println(name);
        System.out.println(kor+ eng + mat);

        ois.close();
        bis.close();
        fis.close();
    }
}
