/**
 * integer nums[]
 * nums[]에서 더했을 때 가장 큰 값을 갖는 부분 배열의 합 구하기 - kadane's algorithm 이용
 * kadane's algorithm : 전체 배쳘에서 최대 합을 가지는 부분 배열을 구하는 알고리즘
 *  - dynamic programming 이용
 *  - 핵심 공식 : max(nums[i], nums[i] + nums[i-1])
 *  - nums[i]가 max값으로 결정 된 경우 해당 nums[i]부터 최대 합을 가지는 새로운 부분 배열이 시작한다고 생각
 *  - 위의 부분부터 nums[i]가 가장 클 때까지가 최대 합을 가지는 부분 배열
 */
package 연습용;
import java.util.Scanner;

public class maxSubArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[9];
		
		// 값 입력 받기
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		if(nums.length == 1) {  // 배열에 값이 하나밖에 없을 경우 그대로 출력
			System.out.println(nums[0]);
		}
		
		int max = nums[0];  // 첫 번째 값을 max로 잡음
		for(i = 1; i < nums.length; i ++) {  // i-1을 이용하기 때문에 i는 1부터 시작
			nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);  // kadane's algorithm
			if(nums[i] > max) {  
				max = nums[i];  // 빠른 출력을 위해 max 값을 바로바로 저장
			}
		}
		
		System.out.println(max);
	}
}
