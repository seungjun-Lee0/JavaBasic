package lsj.basic.day05;

import java.util.Scanner;

public class CardCheck {
	public static void main(String[] args) {
		String cardNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input Card Number");
		cardNum = sc.next();
		
		if(cardNum.charAt(0) == '3' && cardNum.charAt(1) == '5') {
			System.out.print("JCB card - ");
			if(cardNum.charAt(3) == '3')
			{
				System.out.println("NH card");
			}
			else if(cardNum.charAt(4) == '0')
			{
				System.out.println("Sinhan card");
			}
			else if(cardNum.charAt(4) == '1')
			{
				System.out.println("KB card");
			}
		}
		else if(cardNum.charAt(0) == '4') {
			System.out.print("Visa card - ");
			if(cardNum.charAt(1) == '0') {
				System.out.println("BC card");
			}
			else if(cardNum.charAt(1) == '3') {
				System.out.println("Sinhan card");
			}
			else if(cardNum.charAt(1) == '5') {
				System.out.println("KB card");
			}
		}
		else if(cardNum.charAt(0) == '5') {
			System.out.print("Maestro card - ");
			if(cardNum.charAt(1) == '1') {
				System.out.println("Sinhan card");
			}
			else if(cardNum.charAt(1) == '2') {
				System.out.println("Wehan card");
			}
			else if(cardNum.charAt(1) == '4') {
				System.out.println("KB card");
			}
		}
		
	}
}
