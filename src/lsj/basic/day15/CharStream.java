package lsj.basic.day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) {
        // stream
        // 데이터를 비트등의 단위로 조각을 내어
        // 일련의 연속성을 갖도록 만든 데이터의 열
        // 이러한 조각들이 하나의 줄기를 이루어
        // 순서대로 물흐르듯이 전송되게 함

        // 스트림은 데이터를 쓰고 읽기 위한 공통적인 방법을 제공함
        // 자바에서의 스트림 처리방식은 모든 데이터를 바이트로 보는
        // 바이트 단위 스트림과 문자 데이터를 위한 문자 단위 스트림이 있음

        // 문자단위 스트림 - 스트림을 문자로만 처리함
        // 유니코드로 된 문자를 입출력하는 스트림

        // 문자스트림을 다루는 클래스 : java.io 패키지에 포함
        // Reader/Writer => FileReader/FileWriter

        // 문자기반으로 스트림을 읽거나 씀 : 유니코드 기반(1~3 바이트)
        // 주로 텍스트 기반 데이터를 처리할 때 사용
        // 사람이 읽고 쓸 수 있는 데이터를 대상으로 함

        String name = "홍길동";
        int weight = 55;
        double height = 173.5;

        String fpath = "c:/Java/info.txt";

        FileWriter fw = null;

        try {
            fw = new FileWriter(fpath);

            fw.write(name + "\n");
            fw.write(weight + "\n");
            fw.write(height + "\n");

            fw.close();
        }
        catch(IOException e) {
            System.out.println("파일쓰기 오류");
            e.printStackTrace();
        }

        FileReader fr = null;
        try {
            fr = new FileReader(fpath);
            int ch = 0;

            // fr.read() : 지정한 파일객체로부터 문자 하나를 읽어옴
            // ch = fr.read() : 읽어온 문자 하나를 ch 변수에 저장
            // (ch = fr.read()) != -1 : ch 변수에 저장된 문자가 -1이 아니라면
            //                          즉, 읽어온 문자가 유효하지 않다면 
            
           while ((ch = fr.read()) != -1) {
               // 읽어온 코드 값을 문자로 변환함
                System.out.print((char)ch);
            }

            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        // 파일읽기 2 : 라인단위로 읽어 화면에 출력
        // BufferedReader 클래스를 사용함으로써 입력속도를 높임
        BufferedReader br = null;
        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr); // 버퍼기능이 있는 Reader 선언

            while(br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}