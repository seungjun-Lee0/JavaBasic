package lsj.basic.day04;

import java.util.Scanner;

public class MultiplationTable {
		public static void main(String[] args) {
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the number "
				+ "of times from 1 to 9: ");
		
		String fmt = "%d x %d = %d \n";
		
		try{
		int times = scanner.nextInt();
		
		if(times >= 1 && times <= 9) {
			for(int i = 1; i <= times; i++) {
				System.out.println(i + " 단:");
				for(int j = 1; j <= 9; j++) {
					System.out.printf(fmt, i, j, i*j);
				}
				System.out.println();
			}
			break;
		} 		else {
			System.out.println("input number from 1 to 9 only");
		}
		}catch(Exception e) {
			System.out.println("input number only");
			}
		}
		
		// 주민번호를 이용해서 성별을 출력하는 코드를 작성하세요
		
		String jumin = "123456-4234567";
		
		char gender = jumin.charAt(7);
		
		System.out.println(gender);
		if(gender == '1' || gender == '3'){
			System.out.println("남성");
		}
		else if(gender == '2' || gender == '4') {
			System.out.println("여성");
		}
		
		
		
	}
}
