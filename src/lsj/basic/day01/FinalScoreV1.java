package lsj.basic.day01;

/**
 * 
 * @author SJ
 * @category java basic
 * @version 1.0
 * Java basic - grade calculator class
 * 
 * input : name, korean, english, math
 * process : totalScore, averageScore, GPA
 * output : name, korean, english, math, totalScore, averageScore, grade 
 *
 */
public class FinalScoreV1 {
	public static void main(String[] args) {
		// declare variable
		String name;
		int korean;
		int english;
		int math;
		int totalScore;
		double average;
		char grade;
		
		// process
		name = "Dane";
		korean = 76;
		english = 88;
		math = 97;
		grade = 'n';
		
		totalScore = korean + english + math;
		average = (korean + english + math) / 3;
		
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
		}
		
		// output
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + grade);
		
	}
}
