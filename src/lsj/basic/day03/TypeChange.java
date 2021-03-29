package lsj.basic.day03;

public class TypeChange {
	public static void main(String[] args) {
		// Java JVM 32bits are faster than 64bits
		// basically JVM process from 32bits
		
		byte b1= 1; // 1 byte = 8 bits
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
		
		// Get proper grade by using gradeCalculator
		int kor = 98;
		int eng = 88;
		int math = 82;
		double avg = (double)(kor + eng + math) / 3;
		
		String fmt = "average score is : %.2f";
		System.out.printf(fmt, avg);
		
	}
}
