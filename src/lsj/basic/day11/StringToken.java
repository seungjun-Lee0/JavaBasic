package lsj.basic.day11;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        // StringTokenizer
        // divide string to designated letters
        // divided fragments is called token
        // StringTokenizer is recommended for simple string
        // split is recommended for complicate string
        String str = "this string include default delims";

        String words[] = str.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

        // StringTokenizer is iterable data structure
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken() + " ");
        }
        System.out.println();
    }
}
