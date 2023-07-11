/**
 * 숫자로 이루어진 String
 * 숫자 문자열이 대칭으로 이루어져 있는지 확인
 * */
package 연습용;
import java.util.Scanner;

public class isPalindromeNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 문자열 입력받기
		int x = keyboard.nextInt();		
		String x1 = Integer.toString(x);
	
		String odd_even;  // 문자열 길이가 짝수일 때와 홀수일 때를 나누어서 생각
		
		if(x1.length() % 2 == 0) {
			odd_even = "even";
		}
		else {
			odd_even = "odd";
		}
		
		int i, success = 1;
		int middle = Math.round(x1.length() / 2);
		
		if(odd_even.equals("odd")) {
			for(i = 1; i <= middle; i++) {  // 가운데부터 시작해서 양쪽을 비교하는 방식
				if(!x1.substring(middle - i, middle - i + 1).equals(x1.substring(middle + i, middle + i + 1))){
					success = 0;  // 대칭이 깨지면 break
					break;
				}
			}
		}
		else if(odd_even.equals("even")) {
			for(i = 1; i<= middle; i++) {  // 가장 안쪽에 있는 쌍부터 서로를 비교하는 방식
				if(!x1.substring(middle - i, middle - i + 1).equals(x1.substring(middle + i - 1, middle + i))){
					success = 0;  // 대칭이 깨지면 break
					break;
				}
			}
		}
		// 크아아아앙
		if(success == 1) {
			System.out.println("true");
		}
		else if(success == 0) {
			System.out.println("false");
		}
	}
}
