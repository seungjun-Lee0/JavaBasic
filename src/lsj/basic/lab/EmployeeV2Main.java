package lsj.basic.lab;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeService emp = EmployeeServiceV2Impl.getInstance();

        String option = "";

        while (true){
            emp.displayMenu();
            option = sc.next();

            switch (option) {
                case "1": emp.readEmployee();break;
                case "2": emp.writeListOfEmployee(); break;
                case "3": emp.writeEmployee(); break;
                case "4": emp.modifyEmployee(); break;
                case "5": emp.removeEmployee(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }
    }
}
