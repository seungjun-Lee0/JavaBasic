package lsj.basic.day04;

import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {
		String pass = "7888";
		String password;
		int hashPassword = pass.hashCode();
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("passcode");
		password = sc.nextLine();
		
		
		if(password.hashCode() == hashPassword) {
			
			System.out.println("로그인 성공");
			break;
		}
		else {
			System.out.println("다시 시도");
		}
		}
		
		
	}

}
