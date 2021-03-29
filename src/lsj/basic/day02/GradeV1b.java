package lsj.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author SJ
 * @category java basic
 * @version 1.0
 *
 */
public class GradeV1b {
	public static void main(String[] args) {
		// declare variable
		String name;
		int kor;
		int eng;
		int math;
		int totalGrade;
		double average;
		char grade;
		
		// process
		Scanner sc = new Scanner(System.in);
		
		// obtain user input to get subject scores
		
		System.out.println("input your name"); 
		name = sc.nextLine();
		
		System.out.println("input your Korean score"); 
		kor = sc.nextInt();
		
		System.out.println("input your English score"); 
		eng = sc.nextInt();
		
		System.out.println("input your Math score");
		math = sc.nextInt();
		
		
		// formula of total grade and average
		totalGrade = kor + eng + math;
		average = totalGrade / 3;
		
		// use if statement to differentiate grade
		if(average >= 90)
		{
			grade = 'A';
		}
		else if(average <90 & average >= 80 )
		{
			grade = 'B';
		}
		else if(average <80 & average >= 70 )
		{
			grade = 'C';
		}
		else if(average <70 & average >= 60 )
		{
			grade = 'D';
		}
		else if(average <60 & average >= 50 )
		{
			grade = 'E';
		}
		else
		{
			grade = 'F';
			System.out.println("need more practice!!");
		}
		
		// output
		System.out.println("total score is: " + totalGrade);
		System.out.println("average score is: " + average);
		System.out.println("your grade is: " + grade);
	}
}
