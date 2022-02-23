package 연습용;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class threeSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int nums[] = new int[6];
		
		int i, j;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		ArrayList<Integer> num = new ArrayList<>();
		for(i = 0; i < nums.length; i++) {
			num.add(i, nums[i]);
		}
						
		List<List<Integer>> sum = new ArrayList<>();
		// 기준을 잡고 양쪽을 고름 만약에 0이면 절댓값이 똑같은 애들을 찾기, 기준이 양수면 더한 절댓값이 기준이 되는 음수 2개 고르기
		for(i = 0; i < num.size(); i++) {
			ArrayList<Integer> inside = new ArrayList<>();
			if(num.get(i) == 0) {
				inside.add(num.get(i));
				for(j = 0; j < num.size(); j++) {
					if(i == j) {
						continue;
					}
					if(num.get(j) == 0 && num.lastIndexOf(0) != j) {
						if(!inside.contains(num.get(j)) && !inside.contains(num.get(num.lastIndexOf(0)))) {
							inside.add(num.get(j));
							inside.add(num.get(num.lastIndexOf(0)));
						}
					}
					else if(num.get(j) != 0 && num.indexOf(-num.get(i)) != -1) {  // 없으면 -1 return
						if(!inside.contains(num.get(j)) && !inside.contains(num.get(num.indexOf(-num.get(i))) {
							inside.add(num.get(j));
							inside.add(num.get(num.indexOf(-num.get(i))));
						}						
					}
				}
				
			}
			else if(nums[i] > 0) {
				
			}
			else if(nums[i] < 0) {
				
			}
			
		}
		

	}

}
