/**
 * integer nums[]
 * nums[]�� �� �ڸ����� ������ ���ڿ� 1�� ���� ���� ���
 */
package ������;
import java.util.Scanner;

public class plusOne {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[4];
		
		// �� �Է� �ޱ�
		int i;
		String sum = "";
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
			sum += Integer.toString(nums[i]);  // �� nums[]�� ���ļ� ���ڸ� �������ϱ� ������ string���� ��ȯ
		}
		
		int nine = 0;  // parseInt�� ������ ������ �ֱ� ������ �� �ں��� 9�� ������ �ľ��Ͽ� ��ȯ�� ������ �ִ��� �ٿ���
		for(i = sum.length() - 1; i >= 0; i--) {
			if(sum.charAt(i) == '9') {
				nine++;
			}
			else {
				break;  // �� �ں��� �� ���̶� 9�� ������ �ٷ� break�� �ɾ���, 9�� �ƴϸ� �ش� �ڸ����� 1�� �����ָ� �Ǳ� ����
			}
		}
		
		if(nine == 0) {  // 9�� ������ �� ������ �ڸ����� 1�� �����ָ� ��
			sum = sum.substring(0, sum.length() - 1) + Integer.toString(Integer.parseInt(sum.substring(sum.length() - 1)) + 1);
		}
		else if(nine == sum.length()) {  // ��� 9�� �̷���� ������ ������ 10^9�� ����
			sum = "1";
			for(i = 0; i < nine; i++) {
				sum += "0";
			}
		}
		else {  // �� �̿��� ��쿡�� 9�� �� �� �ڸ��������� ��ȭ�� �ֱ� ������ �� �κи� ��ȯ
			sum = sum.substring(0, sum.length() - nine - 1) + Integer.toString(Integer.parseInt(sum.substring(sum.length() - nine - 1)) + 1);
		}
		
		int[] result = new int[sum.length()];  // nums[]�� �ڸ����� �ٲ���� ���� �ֱ� ������ ���ο� �迭 ����
		
		for(i = 1; i <= result.length; i++) {  // �־���
			result[i - 1] = Integer.parseInt(sum.substring(i - 1, i));
		}
		
		for(i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
}
