/**
 * int numRows
 * list<list<Integer>>을 이용해서 파스칼 삼각형을 출력
 *  - 파스칼 삼각형은 위의 두 숫자를 합한 값이 밑의 숫자가 되는 거?
 */
package 연습용;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class pascalTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		int numRows = keyboard.nextInt();
		
		List<List<Integer>> list = new LinkedList<>();
		
		int i, j;
		for(i = 0; i < numRows; i++) {
			List<Integer> inside = new LinkedList<>();  // 중첩 list기 때문에 바깥 list에 넣어 줄 list를 하나 만들어야 함
			if(i == 0 || i == 1) {  // 1번째나 2번째 줄은 숫자를 더할 필요가 없기 때문에 넣어주기만 함
				for(j = 0; j <= i; j++) {
					inside.add(1);
				}
			}
			else {
				inside.add(1);  // 양쪽 사이드에 1을 먼저 더해줌
				inside.add(1);
				for(j = 1; j < i; j++) {  // 위의 두 숫자를 더한 게 그 자리의 값이 됨
					inside.add(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
			}
			list.add(inside);  // 만들어진 안쪽 list를 바깥 list에 넣어줌
		}
		
		for(i = 0; i < numRows; i++) {  // 중첩이기 때문에 이중 반복문으로 출력
			for(j = 0; j <= i; j++) {
				System.out.print(list.get(i).get(j) + " ");  
			}
			System.out.println();
		}
	}
}
