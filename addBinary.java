/**
 * string a, b
 * 2������ string a, b�� �Է¹��� �� ���� ���� 2������ ���
 */
package ������;
import java.util.Scanner;
import java.math.BigInteger;

public class addBinary {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//�� �Է� �ޱ�
		String a = keyboard.nextLine();
		String b = keyboard.nextLine();
		
		BigInteger a1 = new BigInteger(a, 2);  // ������ ������ �� �����ϱ� ���ؼ� BigInteger ���
		BigInteger b1 = new BigInteger(b, 2);  // �����ڸ� ���� a�� b�� 2�������� ����
		
		BigInteger sum = a1.add(b1);  // a + b ����
		
		System.out.println(sum.toString(2));  // 2���� string���� ����ϱ� ���ؼ� toString(2)��� - �� �� 2�� 2������ �ǹ�

	}

}
