package lsj.basic.day11;

import sun.security.krb5.internal.crypto.Des;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class TextFormat {
    public static void main(String[] args) {
        // MessageFormat
        // output diverse types of data with same form
        String name = "헤교";
        int kor = 87;
        int eng = 73;
        int math = 82;
        
        String fmt = "이름: {0}, 국어 : {1} 영어 : {2} 수학 : {3} \n";
        String result = MessageFormat.format(fmt, name, kor, eng, math);

        System.out.println(result);

        Object[] sj = {"sj", 78,68,68,588,65.65,'d'};
        result = MessageFormat.format(fmt, sj);
        System.out.println(result);
        // declare variable as an array to easily assign

        // DecimalFormat
        // output variety types of number included integer, real number
        double num = 12345.6789;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        // 6 digits all together
        // fill 0 if the number is not enough
        df = new DecimalFormat("000000");
        System.out.println(df.format(num));

        // fill blank if the number is not enough
        df = new DecimalFormat("#######");
        System.out.println(df.format(num));

        // output , for a grand
        num = 123456789;
        df = new DecimalFormat("###,###,###");
        System.out.println(df.format(num));

        // change real number data to percentage
        num = 0.125;
        df = new DecimalFormat("## %");
        System.out.println(df.format(num));


    }
}
