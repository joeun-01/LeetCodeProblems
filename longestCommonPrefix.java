/**
 * String�� �迭
 * �� string�� �������� �����ϴ� ���λ� ã��
 * */
package ������;
import java.util.Scanner;

public class longestCommonPrefix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] strs = new String[3];  
		
		// ���ڿ� �Է¹ޱ�
		int i, j;
		for(i = 0; i < strs.length; i++) {
			strs[i] = keyboard.nextLine();
		}
		
		String standard = "", common = "";
		
		// index�� ����� ���� �����ϱ� ���� string �������� common prefix ���� ������ֱ�
		if(strs.length == 0) {  // �ƹ��͵� ���� ���� �׳� �� string
			standard = "";
		}
        else if(strs.length == 1){  // ���ڿ��� �� ���� ���� �� ���ڿ� ��ü
            standard = strs[0];
        }
        else if(strs.length == 2){  // ���ڿ��� �� ���� ���� �� ���� ���ڿ��� ��
            int length = Math.min(strs[0].length(), strs[1].length());  // for������ index�� ����� ���� ���� ���� �� ª�� ���ڿ������� ��
		
		    for(i = 0; i < length; i++) {
			    if(strs[0].charAt(i) == strs[1].charAt(i)) {
				    standard = standard + strs[0].charAt(i);
			    }
                else{
                    break;
                }
		    }
        }
        else if(strs.length > 2){  // �� �� �̻��� ���ڿ��� �ִ� ��� �������� ������ �Ǵ� standard�� ���ϰ� �ű⿡ ��
            int length = Math.min(strs[0].length(), strs[1].length());  // for������ index�� ����� ���� ���� ���� �� ª�� ���ڿ������� ��
		
		    for(i = 0; i < length; i++) {  // ������ ���� ������
			    if(strs[0].charAt(i) == strs[1].charAt(i)) {
				    standard = standard + strs[0].charAt(i);
			    }
                else{  // else�� break�� ���� ������ �� ��ġ�ϴ� �������� Ȯ���ϱ� ����
                    break;
                }
		    }
		
		    for(i = 2; i < strs.length; i++) {
			    length = Math.min(strs[i].length(), standard.length());  // for������ index�� ����� ���� ���� ���� �� ª�� ���ڿ������� ��
			    for(j = 0; j < length; j++) {
				    if(standard.charAt(j) == strs[i].charAt(j)) {  // ���ذ� �ٸ� ���ڿ����� ��
					    common = common + strs[i].charAt(j);
				    }
                    else{
                        break;
                    }
			    }
			    standard = common;  // standard ������Ʈ
			    common = "";  // �� common �ʱ�ȭ
		    }
        }
        
		System.out.println(standard);
	}
}
