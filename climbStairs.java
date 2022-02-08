/**
 * int n
 * n���� ����� 1, 2ĭ�� �ö󰡴� ����� ���� ����ϱ�
 */
package ������;

import java.util.Scanner;

public class climbStairs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		int i;  // i�� 2ĭ�� �ö󰡴� ���� 0 ~ n / 2����
		long way = 0;
		for(i = 0; i <= n / 2; i++) {  // 2ĭ�� �ö󰡴� ��츦 �ϳ��� �÷���
			way += combination(n - i, i);  // ���� �ڸ� �߿� 2�� �� �ڸ��� ���� �ű� ������ ���� ���
		}
		
		System.out.println(way);
	}

	public static int combination(int n, int r) {  // dynamic programming�� �̿��ؼ� runtime �ٿ��ֱ�
		int[][] comb = new int[50][50];
		comb[1][0] = 1;
		comb[1][1] = 1;
		
		int i, j;
		for(i = 2; i <= n; i++) {
			comb[i][0] = 1;
			for(j = 1; j <= r; j++) {
				comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
			}
		}
		
		return comb[n][r];
	}

}
