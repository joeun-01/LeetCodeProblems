/**
 * �θ� ������ String s
 * �θ� ���ڸ� �ƶ��� ���ڷ� ��ȯ
 * */
package ������;
import java.util.Scanner;

public class romanToInt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s = " " + keyboard.nextLine();  // index ������ ����� �� ���� ���� " " �߰�
		
		int i = s.length() - 1, output = 0;
		
		while(i >= 0) {  // string�� �ڿ������� �о���̱� - C, X, I�� �տ� �پ��ִ� ��츦 ������ �ľ��ϱ� ����
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