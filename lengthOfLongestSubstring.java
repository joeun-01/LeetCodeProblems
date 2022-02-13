/**
 * String s
 * s에서 중복되는 알파벳이 없는 가장 긴 substring의 길이 출력하기
 */
package 연습용;
import java.util.Scanner;
import java.util.ArrayList;

public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String s = keyboard.nextLine();
		
		int i, j, length = 0;
		ArrayList<Character> list = new ArrayList<>();  // substring 저장을 위한 ArrayList
		
		for(i = 0; i < s.length(); i++) {
			if(!list.contains(s.charAt(i))) {  // 알파벳 중복이 없을 경우 그냥 list에 넣어줌
				list.add(s.charAt(i));
			}
			else {  // 중복이 있는 경우 앞에 있는 중복 알파벳까지 삭제 - 중복을 제거한 새로운 substring
				int num = list.indexOf(s.charAt(i));
				for(j = 0; j <= num; j++){  // index가 가변적이기 때문에 고정해야됨
					list.remove(0);  // 마찬가지
				}
				list.add(s.charAt(i));  // 앞의 중복을 지웠기 때문에 얘는 넣어줘야함
			}
			if(list.size() > length) {  // length랑 계속 비교해서 가장 길이가 넓을 때를 구함
				length = list.size();
			}
		}
		
		System.out.println(length);
	}
}
