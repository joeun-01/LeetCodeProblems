/**
 * String s, int numRows
 * s�� ������� ���·� �ٲ� �� ���
 * ex) something, 3�̸�
 * s   t   g     output�� stgoehnmi�� ��
 * o e h n
 * m   i
 */
package ������;
import java.util.Scanner;

public class zigzagConvert {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String s = keyboard.nextLine();
		int numRows = keyboard.nextInt();
		
		int i;
		String array[] = new String[numRows];  // ������� �������� �ٲ��� �� �� ���� ���ڵ��� �����ϱ� ���ؼ� numRows ũ���� �迭�� ����
		
		for(i = 0; i < array.length; i++) {  // �ʱ�ȭ
			array[i] = "";
		}
		 
		if(numRows == 1) {  // row�� 1���� ���� ������� �������� �ٲ��� �ʰ� �״�� ����ص� ��
			System.out.println(s);
		}
		else {
			int row = 0, value = 2 * (numRows - 1);  // �Ϸķ� �������� �κ��� ù index�� �׻� + 2(numRow - 1)��ŭ �ȴٴ� �� ���� <- ��������� ��Ģ
			for(i = 0; i < s.length(); i++) {
				array[row] += s.substring(i, i + 1);  // �ش�Ǵ� �ٿ� �����ֱ�
				if((i % value < numRows - 1) && (i % value >= 0)) {  // �Ϸķ� �������� �κп����� row + 1�� �ϰ� �밢�� �κ��� row - 1�� �������
					row++;
				}
				else {
					row--;
				}
			}
			
			String output = "";
			for(i = 0; i < array.length; i++) {  // �� �ٿ� �ִ� ���ڵ��� ��ģ �� 
				output += array[i];
			}
			
			System.out.println(output);  // ���
		}	
	}
}
