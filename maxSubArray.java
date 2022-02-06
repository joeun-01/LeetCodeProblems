/**
 * integer nums[]
 * nums[]���� ������ �� ���� ū ���� ���� �κ� �迭�� �� ���ϱ� - kadane's algorithm �̿�
 * kadane's algorithm : ��ü ��x���� �ִ� ���� ������ �κ� �迭�� ���ϴ� �˰���
 *  - dynamic programming �̿�
 *  - �ٽ� ���� : max(nums[i], nums[i] + nums[i-1])
 *  - nums[i]�� max������ ���� �� ��� �ش� nums[i]���� �ִ� ���� ������ ���ο� �κ� �迭�� �����Ѵٰ� ����
 *  - ���� �κк��� nums[i]�� ���� Ŭ �������� �ִ� ���� ������ �κ� �迭
 */
package ������;
import java.util.Scanner;

public class maxSubArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[9];
		
		// �� �Է� �ޱ�
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		if(nums.length == 1) {  // �迭�� ���� �ϳ��ۿ� ���� ��� �״�� ���
			System.out.println(nums[0]);
		}
		
		int max = nums[0];  // ù ��° ���� max�� ����
		for(i = 1; i < nums.length; i ++) {  // i-1�� �̿��ϱ� ������ i�� 1���� ����
			nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);  // kadane's algorithm
			if(nums[i] > max) {  
				max = nums[i];  // ���� ����� ���� max ���� �ٷιٷ� ����
			}
		}
		
		System.out.println(max);
	}
}
