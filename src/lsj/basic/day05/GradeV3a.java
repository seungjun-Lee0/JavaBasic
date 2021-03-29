package lsj.basic.day05;

import java.util.Scanner;

public class GradeV3a {
	
	// makes Grade calculator more systematically
	// provides CRUD function based on object-oriented method
	// so it provides input/view/edit/delete 
	// menu to increase Usability
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		
		while(true) {
		
		String displayMenu = 
				  "-------------------------\n"
				+ "     Grade Calculator	\n"  
				+ "-------------------------\n"
				+ "1. input grade			\n"
				+ "2. view grade			\n"
				+ "3. detail view grade 	\n"
				+ "4. edit grade 			\n"
				+ "5. delete grade			\n"
				+ "0. program exit 			\n"
				+ "-------------------------\n"
				+ "choose options : ";
		
		System.out.println(displayMenu);
		
		menu = sc.next();
		
		switch(menu) {
			case "1": System.out.println("input grade") ;break;
			case "2": System.out.println("view grade") ;break;
			case "3": System.out.println("detail view grade") ;break;
			case "4": System.out.println("edit grade") ;break;
			case "5": System.out.println("delete grade") ;break;
			case "0": System.exit(0); break; // program exit
			default: System.out.println("wrong input");
			}
		}
	}
}
