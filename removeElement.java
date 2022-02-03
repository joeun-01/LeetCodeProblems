/**
 * int nums[], int val
 * nums[]에서 val을 제거하여 출력
 */
package 연습용;
import java.util.ArrayList;
import java.util.Scanner;

public class removeElement {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		int nums[] = new int[8];
		
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		int val = keyboard.nextInt();
		
		ArrayList<Integer> remove = new ArrayList<>();  // val을 편하게 제거하기 위한 arraylist(index 자동 조정)
		
		for(i = 0; i < nums.length; i++) {
			if(nums[i] != val) {  // val이 아닌 값들만 넣어줌
				remove.add(nums[i]);  
				nums[remove.lastIndexOf(nums[i])] = nums[i];  // arraylist에 add하는 동시에 nums[] 덮어쓰기
				// lastIndexOf를 쓰는 이유는 중복되는 값을 넣은 경우에 가장 최근에 add한 index를 찾아야하기 때문
			}
		}
		
		for(i = 0; i < remove.size(); i++) {  // arraylist length만큼 출력하면 제거한만큼 출력 됨 
			System.out.println(nums[i]);
		}
		
	}
}
