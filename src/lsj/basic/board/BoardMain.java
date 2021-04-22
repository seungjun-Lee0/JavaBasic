package lsj.basic.board;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BoardService bs = BoardServiceImpl.getInstance();
        BoardVO bd = null;

        String option = "";

        while (true){
            bs.displayMenu();
            option = sc.next();

            switch (option) {
                case "1": bs.newBoard();break;
                case "2": bs.showBoard(); break;
                case "3": bs.showOneBoard(); break;
                case "4": bs.modifyBoard(); break;
                case "5": bs.deleteBoard(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("wrong input");
            }
        }
    }
}
