/**
 * int nums[], int val
 * nums[]���� val�� �����Ͽ� ���
 */
package ������;
import java.util.ArrayList;
import java.util.Scanner;

public class removeElement {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		int nums[] = new int[8];
		
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		int val = keyboard.nextInt();
		
		ArrayList<Integer> remove = new ArrayList<>();  // val�� ���ϰ� �����ϱ� ���� arraylist(index �ڵ� ����)
		
		for(i = 0; i < nums.length; i++) {
			if(nums[i] != val) {  // val�� �ƴ� ���鸸 �־���
				remove.add(nums[i]);  
				nums[remove.lastIndexOf(nums[i])] = nums[i];  // arraylist�� add�ϴ� ���ÿ� nums[] �����
				// lastIndexOf�� ���� ������ �ߺ��Ǵ� ���� ���� ��쿡 ���� �ֱٿ� add�� index�� ã�ƾ��ϱ� ����
			}
		}
		
		for(i = 0; i < remove.size(); i++) {  // arraylist length��ŭ ����ϸ� �����Ѹ�ŭ ��� �� 
			System.out.println(nums[i]);
		}
		
	}
}
