/**
 * String haystack, String needle
 * haystack���� needle�� ó�� ������ index ���
 */
package ������;
import java.util.Scanner;

public class implementNeedle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		String haystack = keyboard.nextLine();
		String needle = keyboard.nextLine();
		
		System.out.println(haystack.indexOf(needle));  // ó�� ������ index ���
	}
}
