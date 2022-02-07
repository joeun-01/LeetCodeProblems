/**
 * string a, b
 * 2진수인 string a, b를 입력받은 후 더한 값을 2진수로 출력
 */
package 연습용;
import java.util.Scanner;
import java.math.BigInteger;

public class addBinary {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//값 입력 받기
		String a = keyboard.nextLine();
		String b = keyboard.nextLine();
		
		BigInteger a1 = new BigInteger(a, 2);  // 문제의 범위를 다 포용하기 위해서 BigInteger 사용
		BigInteger b1 = new BigInteger(b, 2);  // 생성자를 통해 a와 b가 2진수임을 밝힘
		
		BigInteger sum = a1.add(b1);  // a + b 진행
		
		System.out.println(sum.toString(2));  // 2진수 string으로 출력하기 위해서 toString(2)사용 - 이 때 2는 2진수를 의미

	}

}
