package ¿¬½À¿ë;
import java.util.Scanner;

public class mySqrt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		
		long i, result = 0;
		for(i = 0; i <= x; i++) {
			System.out.println(i);
			if(i * i > x) {
				result = i - 1;
				break;
			}
		}
		
		if(x == 1) {
			result = 1;
		}
		
		System.out.println(result);
	}

}
