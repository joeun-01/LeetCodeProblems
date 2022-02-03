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
		
		String standard = strs[0], common = "";
		int length = 0;
		
        if(strs.length == 1){  // 문자열이 한 개일 때는 그 문자열 자체
            standard = strs[0];
        }
        else {
		    for(i = 1; i < strs.length; i++) {
		    	length = Math.min(standard.length(), strs[i].length());  // for문에서 index가 벗어나는 것을 막기 위해 더 짧은 문자열까지만 비교
		    	for(j = 0; j < length; j++) {
		    		if(standard.charAt(j) == strs[i].charAt(j)) {  // 기준과 다른 문자열들을 비교
						common += strs[i].charAt(j);
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