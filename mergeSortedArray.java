package ¿¬½À¿ë;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class mergeSortedArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
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
		
		for(i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		for(i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		
		
		
		
		ArrayList<Integer> sorted = new ArrayList<>();
		
		for(i = 0; i < m + n; i++) {
			if(nums1[i] != 0) {
				sorted.add(nums1[i]);
			}			
		}
		for(i = 0; i < n; i++) {
			sorted.add(nums2[i]);
		}
		
		Collections.sort(sorted);
		
		for(i = 0; i < sorted.size(); i++) {
			nums1[i] = sorted.get(i);
			System.out.println(nums1[i]);
		}
	}

}
