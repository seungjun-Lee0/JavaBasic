package SJ.basic.day04;

public class Loop {
	public static void main(String[] args) {
		//while
		int i = 1;
		while(i <= 10) {
			System.out.println(i + "");
			i++;
		}
		
		i = 1;
		while(i <= 50) {
			System.out.println(i);
			i+=2;
		}
		
		int y = 2;
		while(y <= 50) {
			System.out.println(y);
			y+=2;
		}
		
		i = 1;
		int sum =0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		i = 1;
		int j = 100;
		int some = (i+j) * j /2 ;
		
		System.out.println(some);
		
		
 	}
}