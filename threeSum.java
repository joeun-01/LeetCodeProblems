package 연습용;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class threeSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nums[] = new int[6];

		int i, j;
		for (i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}

		List<List<Integer>> output = new ArrayList<>();
		HashMap<Integer, Integer> comb = new HashMap<>();
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums.length; j++) {
				if(i == j) {
					continue;
				}
				if(comb.containsValue(nums[j])) {
					List<Integer> inside = new ArrayList<>();
					inside.add(nums[i]);
					inside.add(nums[j]);
					inside.add(-nums[i] - nums[j]);
					Collections.sort(inside);
					if(!output.contains(inside)) {
						output.add(inside);
					}
				}
				else {
					comb.put(nums[j], -nums[i] - nums[j]);
				}
			}
			comb.clear();
		}

		System.out.println(output.toString());
	}

}
