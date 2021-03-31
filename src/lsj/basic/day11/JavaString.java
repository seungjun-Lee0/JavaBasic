package lsj.basic.day11;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {
        // String class
        // class that is included in java.lang package
        // express in array of char in C language to indicate array of string
        // use String class in java
        // once the String object has been created, the value can only be
        // read, not editable
        // => immutable object
        // need to use 'equals' method to compare between two String objects
        // charAt, concat, indexOf, trim,
        // toLowerCase, toUpperCase, split, substring

        // In java, String Interning is occurred to String object
        // so, created string object value is stored into String Pool
        // and if the next value is similar to created value
        // recycle the previous value which was stored in String Pool
        String str1 = "Hello, World!!";
        String str2 = new String("Hello, World!!");
        String str3 = "Hello, World!!";

        // compare stored place of two strings (reference)
        if(str1.equals(str2)){
            System.out.println("str1 == str2");
        }

        // compare the value of two strings (value)
        if(str1 == str3){
            System.out.println("str1 == str3");
        }

        String jumin = "123456-1234567";

        if(jumin.charAt(7) == '1'){
            System.out.println("male");
        }

        // concatenate : bind two string array into one
        // use string + constructor
        String a = "Hello";
        String b = " World!!";
        System.out.println(a.concat(b));

        // indexOf : get the index of the first character of specific words in
        //           String
        //           return -1 if the words does not exist
        String c = "Hello, World!!";
        System.out.println(c.indexOf("World"));

        String d = "abc123.jpg";
        System.out.println(d.indexOf('.'));

        String e = "123412341234";
        System.out.println(e.indexOf("12"));
        System.out.println(e.indexOf("12", 2));

        // trim : remove blanks in edge of string
        // use replace method to remove the blanks between string
        String f = " abc    123  sfd";
        System.out.println("-"+ f.trim()+ "-");

        // Korean is 3bytes in UTF-8
        String h = "안녕하세요자바";
        System.out.println(h.length());
        System.out.println(h.getBytes().length);

        // toLowerCase, toUpperCase : change the case of string
        String i = "abcdef";
        String j = "ABCDEF";

        System.out.println(i.toUpperCase());
        System.out.println(i.toLowerCase());

        String ex = "hello, java!!";
        String[] data = ex.split(" ");

        String l = "";

        String word1 = (data[0].charAt(0) + "").toUpperCase();
        String word2 = (data[1].charAt(0) + "").toUpperCase();

        l = l.replace("h", word1);
        l = l.replace("j", word2);
        System.out.println(l);

        // substring : output from start point of string to end point
        //             of -1
        System.out.println(ex.substring(0,4));

        // %ty : year
        // %tm : month
        // %td : day
        // %tH : hour
        // %tM : minute
        // %ts : second
        Date today = new Date();

        String fmt = "%tY %<tm %<td %<tH %<tM %<tS \n";
        String result = String.format(fmt, today);

        System.out.println(result);

        // StringBuilder, StringBuffer
        // String object is immutable
        // so instead of using previous space
        // create new space if new string is added -> memory waste
        // use StringBuilder and StringBuffer in order to
        // add new string to use the exist space so that it can save memory
        // thus, StringBuilder is better than using + to combine string

        StringBuilder sb = new StringBuilder();
        sb.append("Hello,").append("World").append("!!");
        System.out.println( sb.toString());


    }
}
