package lsj.basic.day05;

import java.util.Scanner;

public class Login {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// program that output log in status 
		// by typing ID and passcode
		// ID : abc123
		// passcode : 987xyz
		
		String id = "abc123";
		String pass = "987xyz";
		String inputID;
		String inputPass;
		
		Scanner sc = new Scanner(System.in);
		
		inputID = sc.next();
		inputPass = sc.next();
		
		
		if(!inputID.equals(id) && !inputPass.equals(pass)) {
			System.out.println("로그인 실패");
		}
		else if(inputID.equals(id) && !inputPass.equals(pass)) {
			System.out.println("비밀번호 오류");
		}
		else if(inputID.equals(id) && inputPass.equals(pass))
		{
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("아이디 오류");
		}
		
	}
}
