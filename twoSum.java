/**
 * integer nums[]와 integer target
 * nums[]에서 두 개의 숫자를 골라 더했을 때 target이 되는 index 찾기
 * */
package 연습용;
import java.util.Scanner;
import java.util.HashMap;

public class twoSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		// 값 입력받기
		int[] nums = new int[4];
		
		int i;
		System.out.println("Nums: ");
		for(i = 0; i < 4; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		System.out.println("Target: ");
		int target = keyboard.nextInt();
		
		HashMap<Integer, Integer> sum = new HashMap<>();  // hashmap에 x, target - x 값 저장
		
		int dup = 0;  // 혹시 target을 3 3이나 4 4 등 같은 애로 만들 수 있는 지 확인
		for(i = 0; i < nums.length; i++) {
			if(sum.containsKey(nums[i]) && nums[i] == sum.get(nums[i])) {  // 짝수이고 nums에 같은 값이 두 개 있어야 중복으로 계산
				dup = 1;
			}
			sum.put(nums[i], target - nums[i]);
		}
		
		for(i = 0; i < nums.length; i++) {
			if(dup == 1) {  // dup의 경우 절반으로 나눈 숫자가 있는 index만 찾으면 됨
				if(nums[i] == (target / 2)) {
					//System.out.print(i + " ");
				}
			}
			else {  // dup이 아닌 경우 key와 value에 matching되는 값을 nums에서 찾음
				
				for(Integer key : sum.keySet()) {
					if(target % 2 == 0) {  // 짝수일 때는 target / 2인 값이 한 개만 있는 경우를 제외시켜주어야 함
						if(nums[i] != target / 2 && (nums[i] == sum.get(key) || nums[i] == key)) {
							System.out.println(i + " ");
						}
					}
					else {	
						if(nums[i] == sum.get(key) || nums[i] == key) {
							System.out.println(i + " ");
						}
					}
				}
			}
			
		}
		*/
		
		int[] nums = new int[4];
		int i;
		
		System.out.println("Nums: ");
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		System.out.println("Target: ");
		int target = keyboard.nextInt();
		
		HashMap<Integer, Integer> sum = new HashMap<>();
		int dup = 0;
		
		for(i = 0; i < nums.length; i++) {
			if(target % 2 == 0 && nums[i] == target / 2 && sum.containsValue(nums[i])) {  // 짝수이고 nums에 같은 값이 두 개 있어야 중복으로 계산
				dup = 1;
			}
			sum.put(i, nums[i]);
		}
		
		System.out.println(dup);
		
		for(Integer key : sum.keySet()) {
			if(dup == 1) {
				if(sum.get(key) == target / 2) {
					System.out.print(key + " ");
				}
			}
			else {
				if(target % 2 == 0) {
					if(sum.get(key) != target - sum.get(key) && sum.containsValue(target - sum.get(key))) {
						System.out.print(key + " ");
					}
				}
				else {
					if(sum.containsValue(target - sum.get(key))) {
						System.out.print(key + " ");
					}
				}
				
			}
		}
	}
}
