/**
 * String paragraph, String[] banned
 * paragraph���� banned�� �ִ� �ܾ �����ϰ� ���� ���� ������ �ܾ ����ϱ� 
 */
package ������;
import java.util.Scanner;
import java.util.HashMap;

public class mostCommonWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String paragraph = keyboard.nextLine();
		String[] banned = new String[1];
		
		int i, plus;
		for(i = 0; i < banned.length; i++) {
			banned[i] = keyboard.nextLine();
		}
		
		paragraph = paragraph.toLowerCase();  // �����ϱ� ���� ����
		paragraph = paragraph.replaceAll(", ", " ");  // (a, a,b) �̷� ��츦 �����ϱ� ���ؼ�
		String[] split = paragraph.split(",|\\s");  // "," �� " "�� �ܾ� ���� <- �������� �����ڸ� ����ؼ� split�� ���� �߰��� |�� �־��ָ� ��
		HashMap<String, Integer> number = new HashMap<>();
		
		for(i = 0; i < split.length; i++) {
			split[i] = split[i].replaceAll("[^0-9a-zA-Z]", "");  // �پ��ִ� Ư������ ����
			if(!number.containsKey(split[i])) {  // ó�� ������ �ܾ��� ��� �ش� �ܾ 1�� �����ߴٴ� �ǹ̷� put
				number.put(split[i], 1);
			}
			else {  // �ٽ� ������ �ܾ��� ��� ���ڸ� 1�� �÷���
				plus = number.get(split[i]);
				plus++;  // ���� +1
				number.put(split[i], plus);
			}
			System.out.println(number.toString());
		}
		
		for(i = 0; i < banned.length; i++) {  // ban�� �ܾ�� ���� ���� ������ �ܾ ã�� �������� ����
			number.remove(banned[i]);
		}
		
		String frequent = "";
		for(String key : number.keySet()) {
			if(!number.containsKey(frequent)) {  // ó������ ""�� key�� ���ԵǾ� ���� �ʱ� ������ ù �ܾ ���Ƿ� frequent�� ����
				frequent = key;
			}
			else {
				if(number.get(key) > number.get(frequent)) {  // key�� �´� ���ڸ� ���Ͽ� ���� ���� ���� �ܾ ����
					frequent = key;
				}
			}
		}
		
		System.out.println(frequent);  // ���
	}
}
