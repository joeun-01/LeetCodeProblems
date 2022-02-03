/**
 * int 배열 nums[]
 * nums[]에서 중복되는 숫자를 제거하고 출력하기
 */
package 연습용;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class removeDuplicates {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int nums[] = new int[7];
		
		// nums[] 입력받기
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		LinkedHashSet<Integer> remove = new LinkedHashSet<>();  // 입력 순서를 보존하기 위해 LinkedHashSet 사용 <- 그냥 HashSet은 보존이 안됨
		
		for(i = 0; i <nums.length; i++) {  // 중복 add가 안되는 hashset에 넣어줌으로써 자연스럽게 중복 제거
			remove.add(nums[i]);
		}
		
		i = 0;
		for(Integer key : remove) {  // hashset에 있는 값을 nums에 덮어씌움
			nums[i++] = key;
		}
		
		for(i = 0; i < remove.size(); i++) {  // hashset length만큼 nums를 출력하면 중복제거된 곳까지만 출력됨
			System.out.println(nums[i]);
		}
	}
}
