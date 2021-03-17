package SJ.basic.day02;

public class TestPrintf {
	public static void main(String[] args) {
		int x = 5;
		double pi = 3.14;
		
		System.out.print("x = ");
		System.out.print(x);
		System.out.print(" and pi = ");
		System.out.println(pi);
		
		// use method printf
		// %d : decimal
		// %c : character
		// %f : float
		// %s : string
		
		System.out.printf(
				"x = %d and pi = %.2f\n", x, pi);
		
		// use class String
		String fmt = "x = %d and pi = %.2f\n";
		System.out.printf(fmt, x, pi);
	}
}
