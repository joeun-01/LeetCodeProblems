/**
 * int m, n, nums1[], nums2[]
 * 길이가 m + n인 정렬된 nums1[]과 길이가 n인 정렬된 nums2[]를 nums1[]에 재졍렬하기
 */
package 연습용;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class mergeSortedArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 값 입력 받기
		int m = keyboard.nextInt();
		int n = keyboard.nextInt();
		
		int[] nums1 = new int[m + n];
		int[] nums2 = new int[n];
		
		int i;
		for(i = 0; i < m + n; i++) {
			nums1[i] = keyboard.nextInt();
		}
		for(i = 0; i < n; i++) {
			nums2[i] = keyboard.nextInt();
		}
		
		ArrayList<Integer> sorted = new ArrayList<>();  // 빠른 sort를 위한 arraylist
		
		for(i = 0; i < m; i++) {  // m만큼을 제외한 나머지 n에는 비어있다는 뜻으로 0이 들어있음 - 제외하고 정렬
			sorted.add(nums1[i]);
		}
		for(i = 0; i < n; i++) {
			sorted.add(nums2[i]);
		}
		
		Collections.sort(sorted);  // 재정렬
		
		for(i = 0; i < sorted.size(); i++) {  // nums1[]에 덮어씌우기
			nums1[i] = sorted.get(i);
			System.out.println(nums1[i]);
		}
	}

}
