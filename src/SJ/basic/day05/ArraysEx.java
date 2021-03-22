package SJ.basic.day05;

import java.util.Scanner;

public class ArraysEx {
	public static void main(String[] args){
		
		// 54.
		char [] letter = {'a', 'b', 'c'};
		for ( int index = 0; index < letter.length; index++)
		  System.out.print(letter[index] + ", ");
		

		double [] a = {1.1, 2.2, 3.3};
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		a[1] = a[2];
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		
		// sampleArray의 index의 범위를 초과하여 오류 발생
		/*int [] sampleArray = new int [10];
		for ( int index = 1; index <= sampleArray.length; index++)
		 sampleArray[index] = 3*index;*/
		
		// 55.
		int [] arrayA = new int [10];
		for (int i = 0; i < 10; i++) {
			arrayA[i] = i + 1;
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		
		int [] arrayB = new int [11];
		for (int i = 0; i < 11; i++) {
			arrayB[i] = i * 2;
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
		
		int [] arrayC = new int [10];
		for (int i = 0; i < 10; i++) {
			arrayC[i] = (i+1) * (i+1);
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
		
		int [] arrayD = new int [10];
		for (int i = 0; i < 10; i++) {
			arrayD[i] = 0;
			System.out.print(arrayD[i] + " ");
		}
		System.out.println();
		
		int [] arrayE = new int [9];
		arrayE[0] = 1;
		arrayE[1] = 4;
		arrayE[2] = 9;
		arrayE[3] = 16;
		arrayE[4] = 9;
		arrayE[5] = 7;
		arrayE[6] = 4;
		arrayE[7] = 9;
		arrayE[8] = 11;
		for (int i = 0; i < 9; i++) {
			System.out.print(arrayE[i] + " ");
		}
		System.out.println();
		
		// 56.
		int [] arrayF = new int[10];
		int [] arrayG = new int[10];
		int j = 9;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("input numbers");
			arrayF[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			arrayG[i] = arrayF[j - i];
			System.out.print(arrayG[i] + " ");
		}
		
	}
}
