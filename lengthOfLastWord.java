/**
 * String s
 * s���� ������ ������ ���� ���ϱ�
 */
package ������;
import java.util.Scanner;

public class lengthOfLastWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String s = keyboard.nextLine();
		
		s = " " + s.trim();  // ���������� ���Ⱑ �� �κ��� ã�� ���ؼ� ���� ���� �ܾ ���� ��츦 ����Ͽ� �տ� " " �ٿ��ֱ�, �� ���� �������� ������ ����
		
		System.out.println(s.length() - s.lastIndexOf(" ") - 1);

	}

}
