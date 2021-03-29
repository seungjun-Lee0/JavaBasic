package lsj.basic.day05;

import java.util.Random;
import java.util.Scanner;

//output start point of the value
		// in reference type variable
		
		// Structure of JVM
		// stack : space for when user declare variables
		// heap  : space for object type(instance)

public class Arrays {

	public static void main(String[] args) {
		// array
		// store same type elements
		// the values that compose array calls element
		
		// Declaration
		// valueType[] arrayName;
		// valueType arrayName[];
		String[] userID;
		String[] passcode;
		int[] age;
		
		// Initiation
		// arrayName = new valueType[index];
		userID = new String[3];
		passcode = new String[3];
		age = new int[3];
		
		Scanner cs = new Scanner(System.in);
		
		/*for(int i = 0; i < 3; i++) {
		System.out.println("input user ID");
		userID[i] = cs.next();
		
		System.out.println("input passcode");
		passcode[i] = cs.next();
		
		System.out.println("input age");
		age[i] = cs.nextInt();
		
		System.out.println(userID[i] + " " + passcode[i]+ " " + age[i]);
		}*/
		
		// program that output six random numbers from 1 to 45
		
		int [] lotto = new int[6];
		Random rnd = new Random();
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = rnd.nextInt(45);
			System.out.println(lotto[i] + 1);
		}
		
		
		
	}
}
