/**
 * int[] prices
 * �� ��¥�� �ش��ϴ� ������ �ִ� prices���� �ִ� ���� ���ϱ� = ������ ��� �ְ��� �ȱ�, �ȱ� ���� �����
 */
package ������;
import java.util.Scanner;

public class maxProfit {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] prices = new int[7];
		
		int i;
		// �� �Է� �ޱ�
		for(i = 0; i < prices.length; i++) {
			prices[i] = keyboard.nextInt();
		}
		
		int min = prices[0], max = prices[0], profit = 0;
		
		for(i = 0; i < prices.length; i++) {
			if(prices[i] < min) {  // min ���ϱ�
				min = prices[i];  
				max = prices[i];  // min ���� �ٲ�� ���� max�� ����� �� ���� ��
			}
			if(prices[i] - min > profit) {  // profit�� ������ ���� ���� �������ֱ�
				max = prices[i];
				profit = max - min;  
			}
		}
		
		if(profit > 0) {
			System.out.println(profit);
		}
		else {
			System.out.println("0");
		}
		
	}

}
