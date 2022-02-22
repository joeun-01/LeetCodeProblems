/**
 * int height[]
 * n���� ���̸� ���� height���� ���� ū ���Ǹ� ���ϱ�
 * 6 5 4 �� ������ �ִ� ���Ǵ� 4(����) * 2(�ʺ�) = 8
 */
package ������;
import java.util.Scanner;

public class maxArea {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int height[] = new int[10];

		int i, j;  // �� �Է� �ޱ�
		for (i = 0; i < height.length; i++) {
			height[i] = keyboard.nextInt();
		}

		int max = (height.length - 1) * Math.min(height[0], height[height.length - 1]), area;  // max���� �켱 �� ���� ������ ����
		int longer = height[0];
		
		for(i = 1; i < height.length; i++) {  // �켱 �� ������ �������� �� �� �� ������
			area = i * Math.min(height[0], height[i]);
			if (area > max) {
				max = area;
			}
		}

		for (i = 1; i < height.length - 1; i++) {  // ���غ��� �� ���� ����� ������ �� �� �� ���̸� ������ - �� ���� ����� ���� ���� �ִ��� ���� Ȯ���� ����
			if (height[i] > longer) {  // �� ���� ����� ��� ����, �ʺ� ��� �۾����� ������ ���̴� �۾����⸸ ��
				longer = height[i];
				for (j = i + 1; j < height.length; j++) {
					area = (j - i) * Math.min(height[i], height[j]);
					if (area > max) {  // max�� ��
						max = area;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
