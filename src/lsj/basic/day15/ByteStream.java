package lsj.basic.day15;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        // 바이트 단위 스트림 = 스트림을 바이트로만 처리함
        // 파일을 바이트 단위로 입출력하려면
        // InputStream 또는 OutputStream 클래스를 사용함

        // 바이트 기반으로 스트림을 읽거나 씀 : 바이트 기반 (1 byte)
        // 주로 이미지/ 기반 데이터를(이미지, 동영상) 처리할 때 사용
        // 기계가 읽고 쓸 수 있는 데이터를 대상으로 함
        String name = "홍길동";
        int weight = 55;
        double height = 173.5;

        // 파일에 쓰기
        String fpath = "c:/Java/info2.txt";

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        OutputStreamWriter osw = null;
        try {
            // 바이트 기반 스트림에서 문자를 저장하려면
            // OutputStreamWriter 또는
            // PrintWriter 클래스를 이용해야 함
            fos = new FileOutputStream(fpath);
            bos = new BufferedOutputStream(fos);
            osw = new OutputStreamWriter(bos);

            osw.write(name + "\n");
            osw.write(weight + "\n");
            osw.write(height + "\n");


            osw.close();
            bos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        // 파일에 쓰기 2
        String fpath2 = "c:/Java/info3.dat";
        PrintWriter pw = null;
        try {
            fos = new FileOutputStream(fpath2);
            bos = new BufferedOutputStream(fos);
            // 바이트 스트림으로 저장하되
            // 좀더 문자스럽게 다룸
            pw = new PrintWriter(bos);

            pw.println(name);
            pw.println(weight);
            pw.println(height);

            pw.close();
            bos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        // 파일 읽기 : 파일로 부터 한 바이트씩 읽어 화면에 출력

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        InputStreamReader isr = null;
        try{
            fis = new FileInputStream(fpath2);
            bis = new BufferedInputStream(fis);
            isr = new InputStreamReader(bis);

            // 한 바이트 씩 ㅇ릭어 문자로 적절히 변환 후
            // result 변수에 담아 한꺼번에 출력함
            int ch = 0;
            String result = "";
            while ((ch = isr.read()) != -1) {
                result += (char)ch;
            }

            System.out.println(result);

            isr.close();
            bis.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            fis = new FileInputStream(fpath2);
            bis = new BufferedInputStream(fis);
            isr = new InputStreamReader(bis);

            byte readData[] = new byte[512];
            bis.read(readData);

            String result = "";
            for(int i = 0; i < readData.length; i++)
            {
                result += (char)readData[i];
            }
            // 한글 처리 기능이 없으므로 한글이 깨짐
            // 데이터가 채워지지 않은 자리에는 빈값으로 저장됨
            System.out.println(result);
            bis.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
