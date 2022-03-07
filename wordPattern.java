/**
 * String pattern, String s
 * 알파벳으로 이루어진 pattern (ex abba)와 string s가 같은 규칙을 가지고 있는 지 확인
 * ex) abba, dog cat cat dog는 true // abba, dog cat cat fish는 false
 */
package 연습용;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class wordPattern {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String pattern = keyboard.nextLine();
		String s = keyboard.nextLine();
		
		System.out.println(function(pattern, s));  // 결과 값 출력
	}
	public static boolean function(String pattern, String s) {
		String word[] = s.split(" ");  // 띄어쓰기로 구분되어있는 단어들을 분리
		
		if(word.length != pattern.length()) {  // 단어의 개수와 패턴의 길이가 맞지 않으면 절대 true가 될 수 없음
			return false;
		}
		
		LinkedHashMap<String, String> alpha = new LinkedHashMap<>();  // put한 순서 고정을 위해 linkedhashmap 사용, pattern에 맞는 단어를 저장
		
		int i;
		for(i = 0; i < pattern.length(); i++) {
			if(alpha.containsKey(pattern.substring(i, i + 1))) {  // 이미 해당 key가 존재하는 경우
				if(!alpha.get(pattern.substring(i, i + 1)).equals(word[i])) {  
					return false;  // 확인하려는 단어가 key에 저장되어 있는 value와 다르면 pattern이 맞지 않는 것
				}
				// key에 저장되어 있는 value와 같으면 pattern이 일치한다고 보면 됨
			}
			else {  // 해당 key가 존재하지 않는 경우
				if(alpha.containsValue(word[i])) {  // 확인하려는 단어가 이미 다른 key와 매칭이 되어있으면 pattern이 맞지 않는 것
					return false;
				}
				else {  // key도 없고 value도 없는 경우 새로운 match기 때문에 hashmap에 추가해줌
					alpha.put(pattern.substring(i, i + 1), word[i]);
				}
			}
		}
		
		return true;  // 중간에 아무 조건에도 걸리지 않으면 true return <- pattern이 일치함
	}

}
