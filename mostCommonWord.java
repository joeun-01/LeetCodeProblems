/**
 * String paragraph, String[] banned
 * paragraph에서 banned에 있는 단어를 제외하고 가장 많이 등장한 단어를 출력하기 
 */
package 연습용;
import java.util.Scanner;
import java.util.HashMap;

public class mostCommonWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String paragraph = keyboard.nextLine();
		String[] banned = new String[1];
		
		int i, plus;
		for(i = 0; i < banned.length; i++) {
			banned[i] = keyboard.nextLine();
		}
		
		paragraph = paragraph.toLowerCase();  // 구분하기 쉽게 변형
		paragraph = paragraph.replaceAll(", ", " ");  // (a, a,b) 이런 경우를 구분하기 위해서
		String[] split = paragraph.split(",|\\s");  // "," 와 " "로 단어 구분 <- 여러가지 구분자를 사용해서 split할 때는 중간에 |를 넣어주면 됨
		HashMap<String, Integer> number = new HashMap<>();
		
		for(i = 0; i < split.length; i++) {
			split[i] = split[i].replaceAll("[^0-9a-zA-Z]", "");  // 붙어있는 특수문자 제거
			if(!number.containsKey(split[i])) {  // 처음 등장한 단어의 경우 해당 단어가 1번 등장했다는 의미로 put
				number.put(split[i], 1);
			}
			else {  // 다시 등장한 단어일 경우 숫자를 1씩 올려줌
				plus = number.get(split[i]);
				plus++;  // 숫자 +1
				number.put(split[i], plus);
			}
			System.out.println(number.toString());
		}
		
		for(i = 0; i < banned.length; i++) {  // ban된 단어는 제일 많이 등장한 단어를 찾는 과정에서 제외
			number.remove(banned[i]);
		}
		
		String frequent = "";
		for(String key : number.keySet()) {
			if(!number.containsKey(frequent)) {  // 처음에는 ""가 key에 포함되어 있지 않기 때문에 첫 단어를 임의로 frequent로 지정
				frequent = key;
			}
			else {
				if(number.get(key) > number.get(frequent)) {  // key에 맞는 숫자를 비교하여 제일 많이 나온 단어를 구함
					frequent = key;
				}
			}
		}
		
		System.out.println(frequent);  // 출력
	}
}
