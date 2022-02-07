/**
 * integer nums[]
 * nums[]를 각 자릿수로 생각한 숫자에 1을 더한 수를 출력
 */
package 연습용;
import java.util.Scanner;

public class plusOne {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[4];
		
		// 값 입력 받기
		int i;
		String sum = "";
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
			sum += Integer.toString(nums[i]);  // 각 nums[]를 합쳐서 숫자를 만들어야하기 때문에 string으로 변환
		}
		
		int nine = 0;  // parseInt의 범위가 정해져 있기 때문에 맨 뒤부터 9의 개수를 파악하여 변환할 범위를 최대한 줄여줌
		for(i = sum.length() - 1; i >= 0; i--) {
			if(sum.charAt(i) == '9') {
				nine++;
			}
			else {
				break;  // 맨 뒤부터 한 번이라도 9가 없으면 바로 break를 걸어줌, 9가 아니면 해당 자릿수에 1만 더해주면 되기 때문
			}
		}
		
		if(nine == 0) {  // 9가 없으면 맨 마지막 자릿수에 1만 더해주면 됨
			sum = sum.substring(0, sum.length() - 1) + Integer.toString(Integer.parseInt(sum.substring(sum.length() - 1)) + 1);
		}
		else if(nine == sum.length()) {  // 모두 9로 이루어져 있으면 무조건 10^9의 개수
			sum = "1";
			for(i = 0; i < nine; i++) {
				sum += "0";
			}
		}
		else {  // 그 이외의 경우에는 9와 그 전 자릿수까지만 변화가 있기 때문에 그 부분만 변환
			sum = sum.substring(0, sum.length() - nine - 1) + Integer.toString(Integer.parseInt(sum.substring(sum.length() - nine - 1)) + 1);
		}
		
		int[] result = new int[sum.length()];  // nums[]와 자릿수가 바뀌었을 수도 있기 때문에 새로운 배열 생성
		
		for(i = 1; i <= result.length; i++) {  // 넣어줌
			result[i - 1] = Integer.parseInt(sum.substring(i - 1, i));
		}
		
		for(i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
}
