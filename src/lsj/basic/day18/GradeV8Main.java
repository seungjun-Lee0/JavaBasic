package lsj.basic.day18;


import lsj.basic.grade.GradeVO;
import lsj.basic.grade.SungJukServiceV4;
import lsj.basic.grade.SungJukServiceV4Impl;

import java.util.Scanner;

public class GradeV8Main {

    // grade calculator v6
    // save bulk data to use dynamic array list
    // thus, save read data to dynamic array list and
    // use stored data to view/edit/remove
    // (1)readGrade, (2)writeTotalGrade, (3)writeGrade
    // (4)modifyGrade, (5)removeGrade
    // computeGrade, displayMenu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SungJukServiceV4 gs = SungJukServiceV4Impl.getInstance();
        GradeVO go = null;

        String menu = "";

        while(true){
            gs.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": gs.newSungJuk();break;
                case "2": gs.showSungJuk(); break;
                case "3": gs.showOneSungJuk(); break;
                case "4": gs.modifySungJuk(); break;
                case "5": gs.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }
    }
}
