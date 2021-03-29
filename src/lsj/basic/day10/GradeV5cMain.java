package lsj.basic.day10;

import lsj.basic.grade.GradeService;
import lsj.basic.grade.GradeServiceImpl;
import lsj.basic.grade.GradeVO;

import java.util.Scanner;

public class GradeV5cMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //GradeService gs = new GradeServiceImpl();
        GradeService gs = GradeServiceImpl.getInstance();
        // gs is an instance variable so it is created individually for an object
        // make it static to share this to every objects
        // use singleton pattern to limit creation of object to singular

        String menu = "";
        GradeVO go = null;

        while(true){
            gs.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": go = gs.readGrade();
                          gs.computeGrade(go); break;
                case "2": break;
                case "3": gs.writeGrade(go); break;
                case "4": break;
                case "5": break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }

    }
}


