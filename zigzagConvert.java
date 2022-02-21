/**
 * String s, int numRows
 * s를 지그재그 형태로 바꾼 후 출력
 * ex) something, 3이면
 * s   t   g     output은 stgoehnmi가 됨
 * o e h n
 * m   i
 */
package 연습용;
import java.util.Scanner;

public class zigzagConvert {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		String s = keyboard.nextLine();
		int numRows = keyboard.nextInt();
		
		int i;
		String array[] = new String[numRows];  // 지그재그 형식으로 바꿨을 때 줄 별로 글자들을 저장하기 위해서 numRows 크기의 배열을 만듦
		
		for(i = 0; i < array.length; i++) {  // 초기화
			array[i] = "";
		}
		 
		if(numRows == 1) {  // row가 1개일 때는 지그재그 형식으로 바꾸지 않고 그대로 출력해도 됨
			System.out.println(s);
		}
		else {
			int row = 0, value = 2 * (numRows - 1);  // 일렬로 세워지는 부분의 첫 index가 항상 + 2(numRow - 1)만큼 된다는 걸 생각 <- 지그재그의 규칙
			for(i = 0; i < s.length(); i++) {
				array[row] += s.substring(i, i + 1);  // 해당되는 줄에 더해주기
				if((i % value < numRows - 1) && (i % value >= 0)) {  // 일렬로 세워지는 부분에서는 row + 1을 하고 대각선 부분은 row - 1을 해줘야함
					row++;
				}
				else {
					row--;
				}
			}
			
			String output = "";
			for(i = 0; i < array.length; i++) {  // 각 줄에 있는 글자들을 합친 후 
				output += array[i];
			}
			
			System.out.println(output);  // 출력
		}	
	}
}
