/**
 * integer nums[]
 * nums를 조합하여 가장 큰 숫자를 만들어 출력
 */
package 연습용;
import java.util.Scanner;
import java.util.ArrayList;

public class largestNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[3];
		ArrayList<String> sorted = new ArrayList<>();
		
		// 값 입력 받기
		int i, j;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		// insertion sort 진행 - 조건은 앞 쪽에 큰 숫자가 가도록 설정
		int insert = 0; 
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < sorted.size(); j++) {
				if((Integer.toString(nums[i]) + sorted.get(j)).compareTo(sorted.get(j) + Integer.toString(nums[i])) > 0){
					sorted.add(j, Integer.toString(nums[i]));
					insert = 1;  // for문을 다 돌 때까지 insert가 진행되었음을 의미
					break;
				}
			}
			if(insert != 1) {  // 숫자가 맨 뒤에 들어가야하는 경우
				sorted.add(sorted.size(), Integer.toString(nums[i]));
			}
			insert = 0;
		}
		
		String output = "";  // string으로 출력
		for(i = 0; i < sorted.size(); i++) {
			output += sorted.get(i);
		}
		
		if(output.charAt(0) == '0') {
			System.out.println("0");
		}
		else {
			System.out.println(output);
		}
		
	}
}
