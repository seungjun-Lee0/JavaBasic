package lsj.basic.day05;

import java.util.Scanner;

public class Switches {
		public static void main(String[] args) {
			// switch
			// depends on the results of more than two condition 
			// execute statement optionally
			
			// switch(constant){ //constant must be integer
			// 		case constant1: statement1; break;
			// 		case constant2: statement2; break;
			// 		case constant3: statement3; break;
			// 		default : statement4;
			// }
			
			int dayTime;
			String result = "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("input the current time");
			
			dayTime = sc.nextInt();
			
			switch(dayTime) {
			case 7 : 
			case 8 : 
			case 9 : 
			case 10 : 
			case 11 : 
				result = "Morning hours";
				break;
			case 12:
				result = "noon";
				break;
			case 13:
				result = "afternoon hours";
				break;
			case 18:
				result = "evening hours";
				break;
			case 21:
				result = "night hours";
				break;
			case 24:
				result = "midnight";
				break;
			case 1:
				result = "early moring hours";
				break;
			case 5:
				result = "dawn";
				break;
			}
			
			System.out.println(result);
			
		}
}
