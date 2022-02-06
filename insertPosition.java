/**
 * int nums[], int target
 * nums[]에 target이 있는 경우 해당 index, 없는 경우 target이 있어야 할 index 출력
 */
package 연습용;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class insertPosition {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		int[] nums = new int[4];
		
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		int target = keyboard.nextInt();
		
		ArrayList<Integer> position = new ArrayList<>();  // element 파악을 쉽게 하기 위한 arraylist
		
		for(i = 0; i < nums.length; i++) {
			position.add(nums[i]);
		}
		
		if(position.contains(target)) {  // target이 이미 있는 경우
			System.out.println(position.indexOf(target));
		}
		else {  // target이 없는 경우 추가하고 sorting 진행
			position.add(target);
			Collections.sort(position);
			System.out.println(position.indexOf(target));
		}
	}
}
