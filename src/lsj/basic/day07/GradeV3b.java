package lsj.basic.day07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeV3b {
	public static void displayMenu(){
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
	}

	public static void addGrade(){
		String name;
		int kor, eng, math, tot;
		double avg;
		char grade;

		Scanner sc = new Scanner(System.in);
		System.out.println("input your name");
		name = sc.nextLine();
		System.out.println("input your Korean score");
		kor = sc.nextInt();
		System.out.println("input your Korean score");
		eng = sc.nextInt();
		System.out.println("input your Korean score");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = (double) tot / 3;
		switch ((int)avg/10){
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			case 5: grade = 'E'; break;
			default: grade = 'F'; break;
		}

		String fmt = "%s\n%d %d %d\n%d %.1f %c\n\n\n\n";
		System.out.printf(fmt, name, kor, eng, math, tot, avg, grade);
	}
	// makes Grade calculator more systematically
	// provides CRUD function based on object-oriented method
	// so it provides input/view/edit/delete 
	// menu to increase Usability
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option = "";
		while(true) {
		displayMenu();
			option = sc.next();
			switch(option) {
				case "1": addGrade(); ;break;
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
