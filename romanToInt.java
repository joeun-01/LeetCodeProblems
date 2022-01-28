/**
 * 로마 숫자인 String s
 * 로마 숫자를 아라비아 숫자로 변환
 * */
package 연습용;
import java.util.Scanner;

public class romanToInt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s = " " + keyboard.nextLine();  // index 범위가 벗어나는 걸 막기 위해 " " 추가
		
		int i = s.length() - 1, output = 0;
		
		while(i >= 0) {  // string을 뒤에서부터 읽어들이기 - C, X, I가 앞에 붙어있는 경우를 빠르게 파악하기 위함
			switch(s.charAt(i)){
			case 'M':  // 1000
				if(s.charAt(i - 1) == 'C') {  // CM = 900
					output += 900;
					i--;
				}
				else {
					output += 1000;
				}
				break;
			case 'D':  // 500
				if(s.charAt(i - 1) == 'C') {  // CD = 400
					output += 400;
					i--;
				}
				else {
					output += 500;
				}
				break;
			case 'C':  // 100
				if(s.charAt(i - 1) == 'X') {  // XC = 90
					output += 90;
					i--;
				}
				else {
					output += 100;
				}
				break;
			case 'L':  // 50
				if(s.charAt(i - 1) == 'X') {  // XL = 40
					output += 40;
					i--;
				}
				else {
					output += 50;
				}
				break;
			case 'X':  // 10
				if(s.charAt(i - 1) == 'I') {  // IX = 9
					output += 9;
					i--;
				}
				else {
					output += 10;
				}
				break;
			case 'V':  // 5
				if(s.charAt(i - 1) == 'I') {  // IV = 4
					output += 4;
					i--;
				}
				else {
					output += 5;
				}
				break;
			case 'I':  // 1
				output += 1;
				break;
			}
			i--;
		}
		
		System.out.println(output);
	}
}