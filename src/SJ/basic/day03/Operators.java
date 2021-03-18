package SJ.basic.day03;

public class Operators {
	public static void main(String[] args) {
		// developer's font
		// support ligature
		// fonts : d2coding, cascadia
		
		// operator
		// provided in order to execute many different types of operation
		// 산술연산, 비교연산, 논리연산, 조건연산자
		
		// 산술연산 : 사직연산
		// +, -, *, /, %
		int x = 10, y = 15;
		
		
		System.out.println("+ 연산 " + (x + y));
		System.out.println("- 연산 " + (x - y));
		System.out.println("* 연산 " + (x * y));
		System.out.println("/ 연산 " + (x / y));
		System.out.println("% 연산 " + (x % y));
		
		// 비교연산 : 값들의 상대적인 크기를 판단
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교
		// 비교연산의 결과는 논리값(참, 거짓)으로 반환
		System.out.println("x > y  " + (x > y));
		System.out.println("x < y  " + (x < y));
		System.out.println("x != y " + (x != y));
		System.out.println("x = y  " + (x == y));
		
		// 논리연산 : 주어진 논리식을 판단
		// 논리연산의 결과는 논리값(참, 거짓)으로 반환
		// 보통 2개 이상의 비교연산식으로 구성됨
		// 논리곱연산 : &, && (short-circuit)
		// 논리합연산 : |, || 
		// 논리부정연산 : ! 
		boolean result1 = (x > y) & (x != y);
		System.out.println(result1);
		boolean result2 = (x > y) | (x != y);
		System.out.println(result2);
		
		// 조건연산자
		// 3개의 피연산자를 이용하여 조건에 따라
		// 특정 피연산자를 취하도록 사용하는 특수한 연산자
		// 형식 : 조건식 ? 참일 때 값 : 거짓일 때 값
		String result = x > y ? "x가 큽니다" : "y가 큽니다";
		System.out.println(result);
		
	
		
	}
}
