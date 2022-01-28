/**
 * String의 배열
 * 각 string에 공통으로 존재하는 접두사 찾기
 * */
package 연습용;
import java.util.Scanner;

public class longestCommonPrefix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] strs = new String[3];  
		
		// 문자열 입력받기
		int i, j;
		for(i = 0; i < strs.length; i++) {
			strs[i] = keyboard.nextLine();
		}
		
		String standard = "", common = "";
		
		// index가 벗어나는 것을 방지하기 위해 string 개수별로 common prefix 따로 계산해주기
		if(strs.length == 0) {  // 아무것도 없을 때는 그냥 빈 string
			standard = "";
		}
        else if(strs.length == 1){  // 문자열이 한 개일 때는 그 문자열 자체
            standard = strs[0];
        }
        else if(strs.length == 2){  // 문자열이 두 개일 때는 두 가지 문자열을 비교
            int length = Math.min(strs[0].length(), strs[1].length());  // for문에서 index가 벗어나는 것을 막기 위해 더 짧은 문자열까지만 비교
		
		    for(i = 0; i < length; i++) {
			    if(strs[0].charAt(i) == strs[1].charAt(i)) {
				    standard = standard + strs[0].charAt(i);
			    }
                else{
                    break;
                }
		    }
        }
        else if(strs.length > 2){  // 세 개 이상의 문자열이 있는 경우 여러가지 기준이 되는 standard를 정하고 거기에 비교
            int length = Math.min(strs[0].length(), strs[1].length());  // for문에서 index가 벗어나는 것을 막기 위해 더 짧은 문자열까지만 비교
		
		    for(i = 0; i < length; i++) {  // 기준을 먼저 정해줌
			    if(strs[0].charAt(i) == strs[1].charAt(i)) {
				    standard = standard + strs[0].charAt(i);
			    }
                else{  // else에 break를 넣은 이유는 딱 일치하는 곳까지만 확인하기 위함
                    break;
                }
		    }
		
		    for(i = 2; i < strs.length; i++) {
			    length = Math.min(strs[i].length(), standard.length());  // for문에서 index가 벗어나는 것을 막기 위해 더 짧은 문자열까지만 비교
			    for(j = 0; j < length; j++) {
				    if(standard.charAt(j) == strs[i].charAt(j)) {  // 기준과 다른 문자열들을 비교
					    common = common + strs[i].charAt(j);
				    }
                    else{
                        break;
                    }
			    }
			    standard = common;  // standard 업데이트
			    common = "";  // 후 common 초기화
		    }
        }
        
		System.out.println(standard);
	}
}
