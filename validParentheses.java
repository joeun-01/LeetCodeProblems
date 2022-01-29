/**
 * (), [], {}로 이루어져 있는 String
 * (), [], {}가 제대로 짝 지어져 있는 지 확인 - 닫히는 순서 제대로 확인해야 함 
 * */
package 연습용;
import java.util.Scanner;

public class validParentheses {
	public boolean isValid(String s) {
		int success = 0;  // string에서 (), {}, []를 발견했는 지 확인
		if(s.equals(" ")) {  // 문제없이 string을 모두 검사했다면 true return
			return true;
		}
		
		int i;
		for(i = 0; i < s.length(); i++) {  // string에 (), {}, []가 있는 지 확인
			if(s.charAt(i) == '(' && s.charAt(i + 1) == ')' || s.charAt(i) == '{' && s.charAt(i + 1) == '}' || s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
				s = s.substring(0, i) + s.substring(i + 2);  // 있다면 string에서 그 부분을 제거해줌
				success = 1;  // 제거를 완료했다는 표시
				break;
			}
		}
		
		if(success == 1) {  // 제거를 완료했으면 다시 함수를 호출하여 계속 검사
			return isValid(s);
		}
		else {  // (), {}, [] 중 아무것도 발견되지 않았다면 제대로 짝지어있지 않다는 뜻이기 때문에 바로 false return
			return false;  //재귀가 완료되면서 계속 false가 return될 것
		}
	}
	public static void main(String[] args) {
		validParentheses paren = new validParentheses();
		Scanner keyboard = new Scanner(System.in);

		String s = keyboard.nextLine();
		s = s + " ";

		System.out.println(paren.isValid(s));
	}

}
