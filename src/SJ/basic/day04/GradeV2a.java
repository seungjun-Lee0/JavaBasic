package SJ.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author SJ
 * @category java basic
 * @version 2.0
 *
 */
public class GradeV2a {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// declare variable
		String name;
		int kor;
		int eng;
		int math;
		int totalScore;
		double average;
		char grade;
		
		// if you set the condition of while 'false', it won't repeat
		// whereas, do-while repeat at least once 
		// even if the condition is false
		while(true) {
			try {
		// process
		Scanner sc = new Scanner(System.in);
		
		// obtain user input to get subject scores
		System.out.println("input your name"); 
		name = sc.next();
		
		
		System.out.println("input your Korean score"); 
		kor = sc.nextInt();
		
		System.out.println("input your English score"); 
		eng = sc.nextInt();
		
		System.out.println("input your Math score");
		math = sc.nextInt();
		
		
		
		
		// formula of total grade and average
		totalScore = kor + eng + math;
		average = (double)totalScore / 3;
		/*grade = (average >= 90 ) ? '수' :
				(average >= 80 ) ? '우' :
				(average >= 70 ) ? '미' :
				(average >= 60 ) ? '양' : '가';
		*/
		
		
		
		// use if statement to get grade
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
		String fmt = "name : %s Korean : %d, English : %d, Math : %d\n";
		String fmt2 = "total score is: %d\n"
				+ "average score is: %.1f\n" + "your grade is: %c\n";
		System.out.printf(fmt, name, kor, eng, math);
		System.out.printf(fmt2, totalScore, average, grade);
		break;
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
}
