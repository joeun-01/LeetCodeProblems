/**
 * int �迭 nums[]
 * nums[]���� �ߺ��Ǵ� ���ڸ� �����ϰ� ����ϱ�
 */
package ������;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class removeDuplicates {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int nums[] = new int[7];
		
		// nums[] �Է¹ޱ�
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		LinkedHashSet<Integer> remove = new LinkedHashSet<>();  // �Է� ������ �����ϱ� ���� LinkedHashSet ��� <- �׳� HashSet�� ������ �ȵ�
		
		for(i = 0; i <nums.length; i++) {  // �ߺ� add�� �ȵǴ� hashset�� �־������ν� �ڿ������� �ߺ� ����
			remove.add(nums[i]);
		}
		
		i = 0;
		for(Integer key : remove) {  // hashset�� �ִ� ���� nums�� �����
			nums[i++] = key;
		}
		
		for(i = 0; i < remove.size(); i++) {  // hashset length��ŭ nums�� ����ϸ� �ߺ����ŵ� �������� ��µ�
			System.out.println(nums[i]);
		}
	}
}
