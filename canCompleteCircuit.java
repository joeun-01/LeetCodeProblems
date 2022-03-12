/**
 * int gas[], int cost[]
 * gas[i]와 cost[i]에는 각 i번째 gas station에서 채울 수 있는 연료의 양과 다음 gas station으로 가기 위해 필요한 연료가 저장되어 있음
 * 두 배열을 보고 gas station을 모두 방문할 수 있는 시작 index를 출력
 */
package leetcode;
import java.util.Scanner;
import java.util.ArrayList;

public class canCompleteCircuit {
	public static int circuit(int gas[], int cost[]) {
		ArrayList<Integer> start = new ArrayList<>();  // 출발할 수 있는 index 저장
		
		int i;
		for(i = 0; i < gas.length; i++) {
			if(gas[i] - cost[i] >= 0) {  // 다음 gas station으로 이동할 수 있으면 start에 add
				start.add(i);
			}
		}
		
		int tank = 0, index, success;
		for(i = 0; i < start.size(); i++) {  // 모든 가능성 검사
			index = start.get(i);  // 시작 지점 지정
			tank = 0;  // 새로운 시작 지점마다 tank, success 초기화
			success = 1;
			while(true) {  // 한 바퀴 돌 수 있는 지 검사하는 while loop
				tank = tank + gas[index] - cost[index];  // 해당 gas station에서 기름을 채우고 다음 장소로 이동하는 cost를 빼줌
				if(tank < 0) {  // 남은 연료가 0보다 작을 경우 다음으로 넘어갈 수 없음
					success = 0;  // 실패
					break;  // time complexity 절약을 위한 break
				}
				index++;  // 다음 gas station으로 넘어감
				
				if(index == gas.length) {  // 원형이기 때문에 마지막 index에서는 첫 번째 index로 넘어가야함
					index = 0;
				}
				if(index == start.get(i)) {  // 다시 제자리로 돌아오면 성공으로 판정하고 while loop 종료
					break;
				}
			}
			if(success == 1) {  // 시작 지점을 찾은 경우 바로 break
				return start.get(i);
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int gas[] = new int[5];
		int cost[] = new int[gas.length];
		
		// 값 입력 받기
		int i;
		for(i = 0; i < gas.length; i++) {
			gas[i] = keyboard.nextInt();
		}
		for(i = 0; i < cost.length; i++) {
			cost[i] = keyboard.nextInt();
		}
		
		System.out.println(circuit(gas, cost));  // 결과 출력
	}
}
