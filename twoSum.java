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

		int[] nums = new int[4];  // nums[], target 입력받기
		int i;
		
		System.out.println("Nums: ");
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		System.out.println("Target: ");
		int target = keyboard.nextInt();
		
		HashMap<Integer, Integer> sum = new HashMap<>();  // nums[]의 index와 value 저장할 hashmap
		int dup = 0;  // 같은 숫자 두 개를 더해야 target을 만들 수 있는 지 여부 확인
		
		for(i = 0; i < nums.length; i++) {
			if(target % 2 == 0 && nums[i] == target / 2 && sum.containsValue(nums[i])) { 
				dup = 1;  // 짝수이고 target / 2인 value가 hashmap에 2개 있는 경우에만 dup 값을 바꿔줌
			}
			sum.put(i, nums[i]);  // 일단 다 넣어주기
		}
		
		for(Integer key : sum.keySet()) {  // hashmap 전체 검사
			if(dup == 1) {  // dup = 1인 경우 target / 2인 value만 2개 찾으면 됨
				if(sum.get(key) == target / 2) {
					System.out.print(key + " ");  // 출력은 index
				}
			}
			else {
				if(target % 2 == 0) {  // dup이 아닌 경우 target / 2가 하나만 있는 경우를 걸러주어야 함 - 짝수에만 해당
					if(sum.get(key) != target - sum.get(key) && sum.containsValue(target - sum.get(key))) {
						System.out.print(key + " ");
					}
				}
				else {  // 짝, 홀 모두 value = target - value인 key만 출력
					if(sum.containsValue(target - sum.get(key))) {  // target - value를 확인하는 이유는 값이 존재하면 짝을 이루고 있다는 말이기 때문
						System.out.print(key + " ");
					}
				}
			}
		}
	}
}
