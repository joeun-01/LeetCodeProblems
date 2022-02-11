/**
 * int numRows
 * list<list<Integer>>�� �̿��ؼ� �Ľ�Į �ﰢ���� ���
 *  - �Ľ�Į �ﰢ���� ���� �� ���ڸ� ���� ���� ���� ���ڰ� �Ǵ� ��?
 */
package ������;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class pascalTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// �� �Է� �ޱ�
		int numRows = keyboard.nextInt();
		
		List<List<Integer>> list = new LinkedList<>();
		
		int i, j;
		for(i = 0; i < numRows; i++) {
			List<Integer> inside = new LinkedList<>();  // ��ø list�� ������ �ٱ� list�� �־� �� list�� �ϳ� ������ ��
			if(i == 0 || i == 1) {  // 1��°�� 2��° ���� ���ڸ� ���� �ʿ䰡 ���� ������ �־��ֱ⸸ ��
				for(j = 0; j <= i; j++) {
					inside.add(1);
				}
			}
			else {
				inside.add(1);  // ���� ���̵忡 1�� ���� ������
				inside.add(1);
				for(j = 1; j < i; j++) {  // ���� �� ���ڸ� ���� �� �� �ڸ��� ���� ��
					inside.add(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
			}
			list.add(inside);  // ������� ���� list�� �ٱ� list�� �־���
		}
		
		for(i = 0; i < numRows; i++) {  // ��ø�̱� ������ ���� �ݺ������� ���
			for(j = 0; j <= i; j++) {
				System.out.print(list.get(i).get(j) + " ");  
			}
			System.out.println();
		}
	}
}
