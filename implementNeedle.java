/**
 * String haystack, String needle
 * haystack에서 needle이 처음 나오는 index 출력
 */
package 연습용;
import java.util.Scanner;

public class implementNeedle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String haystack = keyboard.nextLine();
		String needle = keyboard.nextLine();
		
		System.out.println(haystack.indexOf(needle));  // 처음 나오는 index 출력
	}
}
