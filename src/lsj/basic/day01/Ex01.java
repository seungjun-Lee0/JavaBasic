package lsj.basic.day01;

/**
 * 
 * practice day1
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		// 1.
		
		System.out.println("*   *    **    ****    ****   *   *         /////  ");
		System.out.println("*   *   *  *   *   *   *   *  *   *        | o o | ");
		System.out.println("*****  *    *  ****    ****    * *        (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *    *          | [_] | ");
		System.out.println("*   *  *    *  *    *  *    *   *           -----  ");
		System.out.println();
		System.out.println("              +---+");
		System.out.println("              |   |");
		System.out.println("          +---+---+");
		System.out.println("          |   |   |");
		System.out.println("      +---+---+---+");
		System.out.println("      |   |   |   |");
		System.out.println("  +---+---+---+---+      /\\_/\\      -----  ");
		System.out.println("  |   |   |   |   |     ( ' ' )   / Hello \\");
		System.out.println("  +---+---+---+---+     (  -  )  <  Junior |");
		System.out.println("  |   |   |   |   |     |  |  |   \\ Coder!/");
		System.out.println("  +---+---+---+---+     (__|__)     -----  ");
		
		// 3.
		//rate1, numberOfWindows
		
		// 4.
		
		//3 * x, 3 * x + y, (x + y)/7, (3 * x + y) / (x + 2), s = s + (v * t) + (1 / 2 * g * t ^ 2)
		
		// 5.
		double number = (1/3) * 3;
		int quotient = 7 / 3;
		int remainder = 7 % 3;
		int result = 11;
		result/=2;
		
		System.out.println("가. " + number); // expected output : 1, output : 0.0
		System.out.println("나. " + quotient);
		System.out.println("다. " + remainder);
		System.out.println("라. " + result);
		
		// 6.
		double x = 2.5;
		double y = 1.5;
		int m = 18;
		int n = 4;
		
		System.out.print("가. ");
		System.out.println(x + n * y - (x + n) * y);
		System.out.print("나. ");
		System.out.println(m / n + m % n);
		System.out.print("다. ");
		System.out.println(5 * x - n / 5);
		System.out.print("라. ");
		System.out.println(1 - (1 - (1 -(1 - (1 - n)))));
		
		// 7.
		System.out.print("가. ");
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.print("나. ");
		System.out.println(true || false && 3 < 4 || !(5 ==7));
		System.out.print("다. ");
		System.out.println(true || (3 < 5 && 6 >= 2));
		System.out.print("라. 틀림");
		System.out.println(!true && 'A' == 'A');
		System.out.print("마. ");
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.print("바. ");
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.print("사. ");
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.print("아. ");
		System.out.println(53 % 21 < 45 / 18);
		System.out.print("자. ");
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.print("차. ");
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		
		// 8.
		
		System.out.print(" May 13, 1988 fell on day number ");
		System.out.println(((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		System.out.print(" Check out this line ");
		System.out.println(" //hello there " + "9" + 7);
		System.out.print('H' + 'I' + "is" + 1 + "more example");
		System.out.println('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// 틀림
		//System.out.print("Print both of us", "Me too");
		System.out.println("Reverse" + 'I' + 'T');
		System.out.print("No, Here is" + 1 + "more example");
		// 틀림
		//System.out.println("Here is" + 10 * 10)) // that's 100;
		System.out.print("바. ");
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.print("사. ");
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.print("아. ");
		System.out.println(53 % 21 < 45 / 18);
		System.out.print("자. ");
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.print("차. ");
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		
	}
}
