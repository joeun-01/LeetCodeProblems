/**
 * String s
 * s���� �ߺ��Ǵ� ���ĺ��� ���� ���� �� substring�� ���� ����ϱ�
 */
package ������;
import java.util.Scanner;
import java.util.ArrayList;

public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String s = keyboard.nextLine();
		
		int i, j, length = 0;
		ArrayList<Character> list = new ArrayList<>();  // substring ������ ���� ArrayList
		
		for(i = 0; i < s.length(); i++) {
			if(!list.contains(s.charAt(i))) {  // ���ĺ� �ߺ��� ���� ��� �׳� list�� �־���
				list.add(s.charAt(i));
			}
			else {  // �ߺ��� �ִ� ��� �տ� �ִ� �ߺ� ���ĺ����� ���� - �ߺ��� ������ ���ο� substring
				int num = list.indexOf(s.charAt(i));
				for(j = 0; j <= num; j++){  // index�� �������̱� ������ �����ؾߵ�
					list.remove(0);  // ��������
				}
				list.add(s.charAt(i));  // ���� �ߺ��� ������ ������ ��� �־������
			}
			if(list.size() > length) {  // length�� ��� ���ؼ� ���� ���̰� ���� ���� ����
				length = list.size();
			}
		}
		
		System.out.println(length);
	}
}
