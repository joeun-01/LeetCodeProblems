/**
 * int nums[]
 * nums[]에서 세 수를 더하여 0이 되는 모든 조합을 찾기 - x + y + z = 0
 * 최대한 시간복잡도를 줄이기 위해서 음수만 비교했는데도 O(n)으로 바꾸는 방법은 모르겠음 ㅜ
 */
package 연습용;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class threeSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nums[] = new int[16];
		HashMap<Integer, Integer> list = new HashMap<>();

		int i, j;
		for (i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
			if(nums[i] <= 0 && !list.containsValue(nums[i])) {
				list.put(i, nums[i]);  // 시간복잡도를 줄이기 위해서 중복, 양수를 제거해줌 - 음수는 (0, 0, 0)이 아닌 이상 조합에 무조건 필요하기 때문에 음수만 가지고도 판별 가능
			}
		}
		
		List<List<Integer>> output = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();  // hashmap에 기준이 되는 x를 제외한 y와 z를 저장해줌
		for(Integer key : list.keySet()) {
			for(j = 0; j < nums.length; j++) {
				if(key == j) {
					continue;
				}
				if(map.containsValue(nums[j])) {  // y가 이미 value로 있다는 것은 y에 맞는 z가 이미 나왔음을 의미, list에 넣어줌
					List<Integer> inside = new ArrayList<>();
					inside.add(list.get(key));
					inside.add(nums[j]);
					inside.add(-list.get(key) - nums[j]);
					Collections.sort(inside);  // list끼리의 비교는 순서까지 같아야 함
					if(!output.contains(inside)) output.add(inside);  // 해당 조합이 없는 경우 최종 list에 넣어줌
				}
				else {
					map.put(nums[j], -list.get(key) - nums[j]);  // 이 때 z = -(x + y)
				}
			}
			map.clear();  // x마다 새로운 map으로 만들어줌
		}

		System.out.println(output.toString());  // list를 string으로 만들어서 출력
	}
}
