/**
 * int nums[], int target
 * nums[]�� target�� �ִ� ��� �ش� index, ���� ��� target�� �־�� �� index ���
 */
package ������;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class insertPosition {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		int[] nums = new int[4];
		
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		int target = keyboard.nextInt();
		
		ArrayList<Integer> position = new ArrayList<>();  // element �ľ��� ���� �ϱ� ���� arraylist
		
		for(i = 0; i < nums.length; i++) {
			position.add(nums[i]);
		}
		
		if(position.contains(target)) {  // target�� �̹� �ִ� ���
			System.out.println(position.indexOf(target));
		}
		else {  // target�� ���� ��� �߰��ϰ� sorting ����
			position.add(target);
			Collections.sort(position);
			System.out.println(position.indexOf(target));
		}
	}
}
