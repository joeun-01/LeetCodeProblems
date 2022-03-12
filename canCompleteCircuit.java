package leetcode;
import java.util.Scanner;

public class canCompleteCircuit {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int gas[] = new int[5];
		int cost[] = new int[gas.length];
		
		int i;
		for(i = 0; i < gas.length; i++) {
			gas[i] = keyboard.nextInt();
		}
		for(i = 0; i < cost.length; i++) {
			cost[i] = keyboard.nextInt();
		}
		
		int start = 0;  // 출발할 수 있는 지점 찾기, 시작을 여유롭게 하기 위해서 제일 많이 남는 곳
		for(i = 1; i < gas.length; i++) {
			if(gas[i] - cost[i] > gas[start] - cost[start]) {
				start = i;
			}
		}
		
		int tank = 0;
		i = start;
		while(true) {
			tank =  tank + gas[i] - cost[i];
			System.out.println(tank + " " + i);
			if(tank > 0) {
				System.out.println("-1");
				break;
			}
			
			i++;
			if(i == gas.length) {
				i = 0;
			}
			if(i == start) {
				break;
			}
		}
		
		System.out.println(tank);
	}

}
