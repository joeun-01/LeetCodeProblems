/**
 * String s
 * s���� ���� �� ��Ī substring ���ϱ� 
 */
package ������;
import java.util.Scanner;
import java.util.ArrayList;

public class longestPalindrome {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s = keyboard.nextLine();
		
		int i;
		ArrayList<Integer> index = new ArrayList<>();  // ��Ī�� �� ����, ������ index�� �����ϱ� ���� arraylist
		
		for(i = 0; i < s.length() - 1; i++) {  // ��Ī�� �� ã��
			if(i < s.length() - 2 && s.charAt(i) == s.charAt(i + 2)) {  // if�� ���� ����� ��� ��츦 ����� �� ����
				index.add(i);
				index.add(i + 2);
			}
			if(s.charAt(i) == s.charAt(i + 1)) {
				index.add(i);
				index.add(i + 1);
			}
		}
		
		if(index.size() == 0) {  // ��Ī�� ���� ��� �ٷ� ù��° ���� ����ϰ� ��
			System.out.println(s.substring(0, 1));
		}
		
		int j;
		String pal = "";
		String output = "";
		for(i = 0; i < index.size(); i += 2) {  // i�� ����, i + 1�� �������̱� ������ +2�� �������
			pal = s.substring(index.get(i), index.get(i + 1) + 1);
			for(j = 1; j < s.length() - 1; j++) {
				if(index.get(i) - j < 0 || index.get(i + 1) + j > s.length() - 1) {  // �Ʊ� ������ index�� �������� �¿�� ��� ���س���
					break;
				}
				if(s.charAt(index.get(i) - j) == s.charAt(index.get(i + 1) + j)) {
					pal = s.substring(index.get(i) - j, index.get(i) - j + 1) + pal + s.substring(index.get(i + 1) + j, index.get(i + 1) + j + 1);

				}
				else {  // ��Ī�� ������ �ٷ� break
					break;
				}
			}
			if(pal.length() > output.length()) {  // longest substring�� ã�ƾ��ϱ� ������ ���� �� �� ����
				output = pal;
			}
		}
		
		System.out.println(output);
		
	}
}
