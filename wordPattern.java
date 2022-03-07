/**
 * String pattern, String s
 * ���ĺ����� �̷���� pattern (ex abba)�� string s�� ���� ��Ģ�� ������ �ִ� �� Ȯ��
 * ex) abba, dog cat cat dog�� true // abba, dog cat cat fish�� false
 */
package ������;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class wordPattern {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String pattern = keyboard.nextLine();
		String s = keyboard.nextLine();
		
		System.out.println(function(pattern, s));  // ��� �� ���
	}
	public static boolean function(String pattern, String s) {
		String word[] = s.split(" ");  // ����� ���еǾ��ִ� �ܾ���� �и�
		
		if(word.length != pattern.length()) {  // �ܾ��� ������ ������ ���̰� ���� ������ ���� true�� �� �� ����
			return false;
		}
		
		LinkedHashMap<String, String> alpha = new LinkedHashMap<>();  // put�� ���� ������ ���� linkedhashmap ���, pattern�� �´� �ܾ ����
		
		int i;
		for(i = 0; i < pattern.length(); i++) {
			if(alpha.containsKey(pattern.substring(i, i + 1))) {  // �̹� �ش� key�� �����ϴ� ���
				if(!alpha.get(pattern.substring(i, i + 1)).equals(word[i])) {  
					return false;  // Ȯ���Ϸ��� �ܾ key�� ����Ǿ� �ִ� value�� �ٸ��� pattern�� ���� �ʴ� ��
				}
				// key�� ����Ǿ� �ִ� value�� ������ pattern�� ��ġ�Ѵٰ� ���� ��
			}
			else {  // �ش� key�� �������� �ʴ� ���
				if(alpha.containsValue(word[i])) {  // Ȯ���Ϸ��� �ܾ �̹� �ٸ� key�� ��Ī�� �Ǿ������� pattern�� ���� �ʴ� ��
					return false;
				}
				else {  // key�� ���� value�� ���� ��� ���ο� match�� ������ hashmap�� �߰�����
					alpha.put(pattern.substring(i, i + 1), word[i]);
				}
			}
		}
		
		return true;  // �߰��� �ƹ� ���ǿ��� �ɸ��� ������ true return <- pattern�� ��ġ��
	}

}
