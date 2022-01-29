/**
 * integer nums[]�� integer target
 * nums[]���� �� ���� ���ڸ� ��� ������ �� target�� �Ǵ� index ã��
 * */
package ������;
import java.util.Scanner;
import java.util.HashMap;

public class twoSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		// �� �Է¹ޱ�
		int[] nums = new int[4];
		
		int i;
		System.out.println("Nums: ");
		for(i = 0; i < 4; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		System.out.println("Target: ");
		int target = keyboard.nextInt();
		
		HashMap<Integer, Integer> sum = new HashMap<>();  // hashmap�� x, target - x �� ����
		
		int dup = 0;  // Ȥ�� target�� 3 3�̳� 4 4 �� ���� �ַ� ���� �� �ִ� �� Ȯ��
		for(i = 0; i < nums.length; i++) {
			if(sum.containsKey(nums[i]) && nums[i] == sum.get(nums[i])) {  // ¦���̰� nums�� ���� ���� �� �� �־�� �ߺ����� ���
				dup = 1;
			}
			sum.put(nums[i], target - nums[i]);
		}
		
		for(i = 0; i < nums.length; i++) {
			if(dup == 1) {  // dup�� ��� �������� ���� ���ڰ� �ִ� index�� ã���� ��
				if(nums[i] == (target / 2)) {
					//System.out.print(i + " ");
				}
			}
			else {  // dup�� �ƴ� ��� key�� value�� matching�Ǵ� ���� nums���� ã��
				
				for(Integer key : sum.keySet()) {
					if(target % 2 == 0) {  // ¦���� ���� target / 2�� ���� �� ���� �ִ� ��츦 ���ܽ����־�� ��
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
			if(target % 2 == 0 && nums[i] == target / 2 && sum.containsValue(nums[i])) {  // ¦���̰� nums�� ���� ���� �� �� �־�� �ߺ����� ���
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
