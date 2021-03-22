package SJ.basic.day05;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int CurrentYear;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input year");
		
		CurrentYear = sc.nextInt();
		
		if(CurrentYear % 400 == 0) {
			System.out.println("Leap Year");
		}
		else if(CurrentYear % 4 == 0 && CurrentYear % 100 != 0)
		{
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}
			
}
