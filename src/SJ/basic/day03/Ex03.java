package SJ.basic.day03;

/**
 * 
 * practice day1
 *
 */
public class Ex03 {
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
		System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100  
	            + 2021 % 100 / 4 + 2021 / 400
	            - 2 * (2021 / 100) ) % 7 + 7) % 7 );
		System.out.print(" Check out this line ");
		System.out.println(" //hello there " + '9' + 7);
		System.out.print('H' + 'I' + "is" + 1 + "more example");
		System.out.print('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// 틀림 두 문장을 연결 하기 위해서 +를 이용해야함
		// System.out.print("Print both of us", "Me too");
		System.out.print("Reverse" + 'I' + 'T');
		System.out.print("No! Here is" + 1 + "more example");
		// 틀림 comment를 새미콜론 앞에 써서 문장이 끝나지 않음
		// System.out.println("Here is" + 10 * 10)) // that's 100;
		System.out.println( "not x is" + true ); // that's true.
		// 틀림 print 괄호안에 args 가 0면 사용 불가
		// System.out.print(  );
		// 틀림 println 이후에 괄호 '()' 필요
		// System.out.println;
		// 틀림 1. + 기호가 하나만 들어가야 문장이 연결됨
		//      2. 작은 따움표는 한 단어만 가능 
		//		   huh? 는 큰 따움표 이용
		// System.out.println( "How about this one" + '?' + 'Huh?');
		
		// 9.
		System.out.println(true && false && true || true);	
		System.out.println(true || true && true && false);    
		System.out.println((true && false) || (true && ! false)
				|| (false && !false));  
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
		
	}
}
