/**
 * int[] prices
 * 각 날짜에 해당하는 가격이 있는 prices에서 최대 이익 구하기 = 최저로 사고 최고가로 팔기, 팔기 전에 사야함
 */
package 연습용;
import java.util.Scanner;

public class maxProfit {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] prices = new int[7];
		
		int i;
		// 값 입력 받기
		for(i = 0; i < prices.length; i++) {
			prices[i] = keyboard.nextInt();
		}
		
		int min = prices[0], max = prices[0], profit = 0;
		
		for(i = 0; i < prices.length; i++) {
			if(prices[i] < min) {  // min 구하기
				min = prices[i];  
				max = prices[i];  // min 값이 바뀌면 이전 max는 사용할 수 없게 됨
			}
			if(prices[i] - min > profit) {  // profit이 전보다 많을 때만 변경해주기
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
