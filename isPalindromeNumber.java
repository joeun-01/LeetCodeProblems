/**
 * ���ڷ� �̷���� String
 * ���� ���ڿ��� ��Ī���� �̷���� �ִ��� Ȯ��
 * */
package ������;
import java.util.Scanner;

public class isPalindromeNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// ���ڿ� �Է¹ޱ�
		int x = keyboard.nextInt();		
		String x1 = Integer.toString(x);
	
		String odd_even;  // ���ڿ� ���̰� ¦���� ���� Ȧ���� ���� ����� ����
		
		if(x1.length() % 2 == 0) {
			odd_even = "even";
		}
		else {
			odd_even = "odd";
		}
		
		int i, success = 1;
		int middle = Math.round(x1.length() / 2);
		
		if(odd_even.equals("odd")) {
			for(i = 1; i <= middle; i++) {  // ������� �����ؼ� ������ ���ϴ� ���
				if(!x1.substring(middle - i, middle - i + 1).equals(x1.substring(middle + i, middle + i + 1))){
					success = 0;  // ��Ī�� ������ break
					break;
				}
			}
		}
		else if(odd_even.equals("even")) {
			for(i = 1; i<= middle; i++) {  // ���� ���ʿ� �ִ� �ֺ��� ���θ� ���ϴ� ���
				if(!x1.substring(middle - i, middle - i + 1).equals(x1.substring(middle + i - 1, middle + i))){
					success = 0;  // ��Ī�� ������ break
					break;
				}
			}
		}
		
		if(success == 1) {
			System.out.println("true");
		}
		else if(success == 0) {
			System.out.println("false");
		}
	}
}
