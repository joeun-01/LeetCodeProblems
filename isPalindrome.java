/**
 * String s
 * s�� ��Ī���� �ƴ��� ���
 */
package ������;
import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String s = keyboard.nextLine();
		
		s = s.toLowerCase();  // ��ҹ��� ������ �����ֱ� ���� ���
		s = s.replaceAll("[^0-9a-zA-Z]", "");  // Ư������, ���� ����
		
		int i, suc = 1;
		for(i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) {  // ���� ������ ��
				suc = 0;  // ��Ī�� ��߳��� ���� break
				break;
			}
		}
		
		if(suc == 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
				

	}

}
