/**
 * String s
 * s가 대칭인지 아닌지 출력
 */
package 연습용;
import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String s = keyboard.nextLine();
		
		s = s.toLowerCase();  // 대소문자 구분을 없애주기 위해 사용
		s = s.replaceAll("[^0-9a-zA-Z]", "");  // 특수문자, 띄어쓰기 제거
		
		int i, suc = 1;
		for(i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) {  // 양쪽 끝부터 비교
				suc = 0;  // 대칭이 어긋나는 순간 break
				break;
			}
		}
		
		if(suc == 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
