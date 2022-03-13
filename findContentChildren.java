/**
 * int g[], int s[]
 * g[] : 각 아이들이 원하는 쿠키의 최소 크기, s[] : 존재하는 각 쿠키의 크기
 * 아이들에게 쿠키를 나누어줄 때 받을 수 있는 아이들의 최대 수를 구하기
 *  - 아이들이 먹고싶은 크기보다 쿠키가 크거나 같을 경우에만 지급 가능
 */
package leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class findContentChildren {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int g[] = new int[3];
		int s[] = new int[2];
		
		// 값 입력 받기
		int i, j;
		for(i = 0; i < g.length; i++) {
			g[i] = keyboard.nextInt();
		}
		for(i = 0; i < s.length; i++) {
			s[i] = keyboard.nextInt();
		}
		
		Arrays.sort(g);  // 크기별로 쿠키 배급을 쉽게 하기 위해서 오름차순 정렬
		Arrays.sort(s);
		
		int ate = 0;  // 쿠키를 먹을 수 있는 아이들의 수
		i = 0;
		j = 0;
		while(i < g.length && j < s.length) {  // 아이들이나 쿠키 둘 중 하나라도 끝까지 확인한 경우 break
			if(g[i] <= s[j]) {  // 아이에게 쿠키를 줄 수 있는 경우
				ate++;  
				i++;  // 아이와 쿠키가 매칭되었기 때문에 둘 다 넘어감
				j++;
			}
			else {  // 아이에게 쿠키를 줄 수 없는 경우
				j++;  // 오름차순 정렬을 했기 때문에 이 경우에는 이 쿠키를 받을 수 있는 아이가 더 이상 존재하지 않음 - 넘어감
			}
		}
		
		System.out.println(ate);
	}
}
