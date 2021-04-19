package lsj.basic.test01;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryService ls = LibraryServiceImpl.getInstance();
        String menu = "";

        while(true){
            ls.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": ls.readLibraryInfo();break;
                case "2": ls.writeListOfLibraryInfo(); break;
                case "3": ls.writeLibraryInfo(); break;
                case "4": ls.modifyLibraryInfo(); break;
                case "5": ls.removeLibraryInfo(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }
        }
    }
}
