/**
 * (), [], {}�� �̷���� �ִ� String
 * (), [], {}�� ����� ¦ ������ �ִ� �� Ȯ�� - ������ ���� ����� Ȯ���ؾ� �� 
 * */
package ������;
import java.util.Scanner;

public class validParentheses {
	public boolean isValid(String s) {
		int success = 0;  // string���� (), {}, []�� �߰��ߴ� �� Ȯ��
		if(s.equals(" ")) {  // �������� string�� ��� �˻��ߴٸ� true return
			return true;
		}
		
		int i;
		for(i = 0; i < s.length(); i++) {  // string�� (), {}, []�� �ִ� �� Ȯ��
			if(s.charAt(i) == '(' && s.charAt(i + 1) == ')' || s.charAt(i) == '{' && s.charAt(i + 1) == '}' || s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
				s = s.substring(0, i) + s.substring(i + 2);  // �ִٸ� string���� �� �κ��� ��������
				success = 1;  // ���Ÿ� �Ϸ��ߴٴ� ǥ��
				break;
			}
		}
		
		if(success == 1) {  // ���Ÿ� �Ϸ������� �ٽ� �Լ��� ȣ���Ͽ� ��� �˻�
			return isValid(s);
		}
		else {  // (), {}, [] �� �ƹ��͵� �߰ߵ��� �ʾҴٸ� ����� ¦�������� �ʴٴ� ���̱� ������ �ٷ� false return
			return false;  //��Ͱ� �Ϸ�Ǹ鼭 ��� false�� return�� ��
		}
	}
	public static void main(String[] args) {
		validParentheses paren = new validParentheses();
		Scanner keyboard = new Scanner(System.in);

		String s = keyboard.nextLine();
		s = s + " ";

		System.out.println(paren.isValid(s));
	}

}
