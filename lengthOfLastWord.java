/**
 * String s
 * s에서 마지막 글자의 길이 구하기
 */
package 연습용;
import java.util.Scanner;

public class lengthOfLastWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String s = keyboard.nextLine();
		
		s = " " + s.trim();  // 마지막으로 띄어쓰기가 된 부분을 찾기 위해서 공백 없이 단어만 있을 경우를 대비하여 앞에 " " 붙여주기, 그 외의 쓸데없는 공백은 제거
		
		System.out.println(s.length() - s.lastIndexOf(" ") - 1);

	}

}
