/**
 * int n
 * n개의 계단을 1, 2칸씩 올라가는 경우의 수를 출력하기
 */
package 연습용;

import java.util.Scanner;

public class climbStairs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		int i;  // i가 2칸씩 올라가는 개수 0 ~ n / 2까지
		long way = 0;
		for(i = 0; i <= n / 2; i++) {  // 2칸씩 올라가는 경우를 하나씩 늘려줌
			way += combination(n - i, i);  // 여러 자리 중에 2가 들어갈 자리를 고르는 거기 때문에 조합 사용
		}
		
		System.out.println(way);
	}

	public static int combination(int n, int r) {  // dynamic programming을 이용해서 runtime 줄여주기
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
