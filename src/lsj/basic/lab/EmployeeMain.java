package lsj.basic.lab;

import lsj.basic.day13.GradeServiceV2;
import lsj.basic.day13.GradeServiceV2Impl;
import lsj.basic.grade.GradeVO;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeService es = EmployeeServiceImpl.getInstance();
        String menu = "";

        while(true){
            es.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": es.readEmployee();break;
                case "2": es.writeListOfEmployee(); break;
                case "3": es.writeEmployee(); break;
                case "4": es.modifyEmployee(); break;
                case "5": es.removeEmployee(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }
    }
}
