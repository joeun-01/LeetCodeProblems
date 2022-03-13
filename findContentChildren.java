/**
 * int g[], int s[]
 * g[] : �� ���̵��� ���ϴ� ��Ű�� �ּ� ũ��, s[] : �����ϴ� �� ��Ű�� ũ��
 * ���̵鿡�� ��Ű�� �������� �� ���� �� �ִ� ���̵��� �ִ� ���� ���ϱ�
 *  - ���̵��� �԰���� ũ�⺸�� ��Ű�� ũ�ų� ���� ��쿡�� ���� ����
 */
package leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class findContentChildren {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int g[] = new int[3];
		int s[] = new int[2];
		
		// �� �Է� �ޱ�
		int i, j;
		for(i = 0; i < g.length; i++) {
			g[i] = keyboard.nextInt();
		}
		for(i = 0; i < s.length; i++) {
			s[i] = keyboard.nextInt();
		}
		
		Arrays.sort(g);  // ũ�⺰�� ��Ű ����� ���� �ϱ� ���ؼ� �������� ����
		Arrays.sort(s);
		
		int ate = 0;  // ��Ű�� ���� �� �ִ� ���̵��� ��
		i = 0;
		j = 0;
		while(i < g.length && j < s.length) {  // ���̵��̳� ��Ű �� �� �ϳ��� ������ Ȯ���� ��� break
			if(g[i] <= s[j]) {  // ���̿��� ��Ű�� �� �� �ִ� ���
				ate++;  
				i++;  // ���̿� ��Ű�� ��Ī�Ǿ��� ������ �� �� �Ѿ
				j++;
			}
			else {  // ���̿��� ��Ű�� �� �� ���� ���
				j++;  // �������� ������ �߱� ������ �� ��쿡�� �� ��Ű�� ���� �� �ִ� ���̰� �� �̻� �������� ���� - �Ѿ
			}
		}
		
		System.out.println(ate);
	}
}
