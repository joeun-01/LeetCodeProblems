/**
 * String s
 * s에서 가장 긴 대칭 substring 구하기 
 */
package 연습용;
import java.util.Scanner;
import java.util.ArrayList;

public class longestPalindrome {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s = keyboard.nextLine();
		
		int i;
		ArrayList<Integer> index = new ArrayList<>();  // 대칭일 때 왼쪽, 오른쪽 index를 저장하기 위한 arraylist
		
		for(i = 0; i < s.length() - 1; i++) {  // 대칭인 곳 찾기
			if(i < s.length() - 2 && s.charAt(i) == s.charAt(i + 2)) {  // if를 따로 써줘야 모든 경우를 고려할 수 있음
				index.add(i);
				index.add(i + 2);
			}
			if(s.charAt(i) == s.charAt(i + 1)) {
				index.add(i);
				index.add(i + 1);
			}
		}
		
		if(index.size() == 0) {  // 대칭이 없는 경우 바로 첫번째 글자 출력하고 끝
			System.out.println(s.substring(0, 1));
		}
		
		int j;
		String pal = "";
		String output = "";
		for(i = 0; i < index.size(); i += 2) {  // i는 왼쪽, i + 1은 오른쪽이기 때문에 +2씩 해줘야함
			pal = s.substring(index.get(i), index.get(i + 1) + 1);
			for(j = 1; j < s.length() - 1; j++) {
				if(index.get(i) - j < 0 || index.get(i + 1) + j > s.length() - 1) {  // 아까 저장한 index를 기준으로 좌우로 계속 비교해나감
					break;
				}
				if(s.charAt(index.get(i) - j) == s.charAt(index.get(i + 1) + j)) {
					pal = s.substring(index.get(i) - j, index.get(i) - j + 1) + pal + s.substring(index.get(i + 1) + j, index.get(i + 1) + j + 1);

				}
				else {  // 대칭이 깨지면 바로 break
					break;
				}
			}
			if(pal.length() > output.length()) {  // longest substring을 찾아야하기 때문에 길이 비교 후 저장
				output = pal;
			}
		}
		
		System.out.println(output);
		
	}
}
