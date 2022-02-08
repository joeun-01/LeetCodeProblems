/**
 * int x
 * x의 제곱근 구하기 - pow(x, 0.5) 사용하지 않고
 */
package 연습용;
import java.util.Scanner;

public class mySqrt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		
		long i, result = 0;  // 큰 범위를 위해 long 사용
		for(i = 0; i <= x; i++) {
			if(i * i > x) {  // 제곱했을 때 x를 넘지 않는 최대의 i를 구하기 위한 조건 설정
				result = i - 1;  // 넘지 않는 최대 i기 때문에 딱 넘을 때 -1을 구해줌
				break;
			}
		}
		
		if(x == 1) {  // 1일때는 i - 1을 하면 안되기 때문에 따로 빼줌
			result = 1;
		}
		
		System.out.println(result);
	}

}
