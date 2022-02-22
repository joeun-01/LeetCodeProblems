/**
 * int height[]
 * n개의 높이를 가진 height에서 가장 큰 부피를 구하기
 * 6 5 4 가 있으면 최대 부피는 4(높이) * 2(너비) = 8
 */
package 연습용;
import java.util.Scanner;

public class maxArea {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int height[] = new int[10];

		int i, j;  // 값 입력 받기
		for (i = 0; i < height.length; i++) {
			height[i] = keyboard.nextInt();
		}

		int max = (height.length - 1) * Math.min(height[0], height[height.length - 1]), area;  // max값을 우선 맨 양쪽 값으로 구함
		int longer = height[0];
		
		for(i = 1; i < height.length; i++) {  // 우선 맨 왼쪽을 기준으로 한 번 더 구해줌
			area = i * Math.min(height[0], height[i]);
			if (area > max) {
				max = area;
			}
		}

		for (i = 1; i < height.length - 1; i++) {  // 기준보다 더 높은 기둥이 있으면 한 번 더 넓이를 비교해줌 - 더 높은 기둥이 있을 때만 최댓값이 변할 확률이 생김
			if (height[i] > longer) {  // 더 낮은 기둥일 경우 높이, 너비가 모두 작아지기 때문에 넓이는 작아지기만 함
				longer = height[i];
				for (j = i + 1; j < height.length; j++) {
					area = (j - i) * Math.min(height[i], height[j]);
					if (area > max) {  // max값 비교
						max = area;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
