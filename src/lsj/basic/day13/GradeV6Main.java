package lsj.basic.day13;

import lsj.basic.grade.GradeVO;

import java.util.Scanner;

public class GradeV6Main {

    // grade calculator v6
    // save bulk data to use dynamic array list
    // thus, save read data to dynamic array list and
    // use stored data to view/edit/remove
    // (1)readGrade, (2)writeTotalGrade, (3)writeGrade
    // (4)modifyGrade, (5)removeGrade
    // computeGrade, displayMenu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GradeServiceV2 gs = GradeServiceV2Impl.getInstance();
        GradeVO go = null;

        String menu = "";

        while(true){
            gs.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": gs.readGrade();break;
                case "2": gs.writeListOfGrade(); break;
                case "3": gs.writeGrade(); break;
                case "4": gs.modifyGrade(); break;
                case "5": gs.removeGrade(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }
    }
}
