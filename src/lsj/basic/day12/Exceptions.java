package lsj.basic.day12;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // error and exception

        // error cause critical issues in system level of program
        // so that it cause force stop
        // ex) network server freeze, memory/resource exhaustion

        // exception cause force stop same as error, it can be prevented
        // by anticipating the possible situation
        // ex) wrong file directory, wrong data value input

        // developer should be able to write the exception code
        // in order to solve the exceptions

        // before hadling exceptions
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");


        System.out.println("프로그램 시작2");
        int a = 10, b = 25;
        int c = a + b;
        System.out.println(c);
        System.out.println("프로그램 끝2");


        System.out.println("프로그램 시작3");

        int d = 10, e = 0;
        //int f = d / e;
        //System.out.println(f);
        System.out.println("프로그램 끝3");

        // exception handling
        // try - catch - finally
        // try {
        //    code that can cause errors
        // } catch (possibleException1){
        //    code when error is happened
        // } catch (possibleException2){
        //    code when error is happened
        // }

        System.out.println("프로그램 시작4");

        try {
            int g = 10, h = 0;
            int i = g / h;
            System.out.println(i);
        }catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("프로그램 끝4");

        // ex) input between 1 ~ 9
        // if other valueType input has been
        // read return exceptions
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("input number between 1 to 9");
            int input = sc.nextInt();
            if(input < 1 || input > 9){
                System.out.println("wrong input");
            }
        }catch(Exception ex){
            System.out.println("wrong input");
        }

        // types of exceptions
        // checked exception and unchecked exception

        // unchecked exception
        // do not force explicit exceptions
        // exception happens at runtime
        // ArithmeticException
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // checked exception
        // force explicit exceptions
        // exception happens at compile
        // IOException
        // ClassNotFoundException

        // input grade data and save
        // at C:/Java/grade.txt
        String fpath = "c:/Java/grade.txt";
        String sjData = "혜교 87 42 99";

        try {
            FileWriter fw = new FileWriter(fpath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sjData);
            bw.close();
            fw.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // exceptions throw
        // use throws when user declare method
        // specify the exceptions that have been arisen

    }
}
