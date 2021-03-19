package SJ.basic.day04;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		
		/*int i = 1;
		while(i <= 100) {
			if(i%2==0) {
				System.out.println(i + "은(는) 짝수입니다.");
			}
			else {
				System.out.println(i + "은(는) 홀수입니다.");
			}
			i++;
		}*/
		
		// 사용자가 연봉(salary)과 결혼 여부(isMarried)를 입력하면
		// 다음의 세금율에 의해 납부해야 할 세금(tax)을
		// 계산하는 프로그램을 작성하세요
		// 미혼인 경우 : 연봉 3000미만 - 10%, 연봉 3000이상 - 25%
		// 결혼한 경우 : 연봉 6000미만 - 15%, 연봉 6000이상 - 35%
		int salary;
		String isMarried;
		
		while(true) {
			
		try {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("연봉 입력(만원 단위)");
		salary = sc.nextInt();
		
		System.out.println("결혼 여부(예/아니오)");
		isMarried = sc.next();
		
		if(isMarried.equals("예") || isMarried.equals("아니오"))
		{
			if(isMarried == "아니오") {
				if(salary <= 3000) {
					System.out.println("10%의 세금이 부과됩니다");
				}
				else {
					System.out.println("25%의 세금이 부과됩니다");
				}
			}
			else {
				if(salary <= 6000) {
					System.out.println("15%의 세금이 부과됩니다");
				}
				else {
					System.out.println("35%의 세금이 부과됩니다");
				}
			}
			break;
		}
		else {
			System.out.println("예, 아니오로 입력하세요");
		
		}
		}catch(Exception e){
			System.out.println("숫자로 입력하세요");
		}
		}
	}
}
