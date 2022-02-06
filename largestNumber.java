package ¿¬½À¿ë;
import java.util.Scanner;
import java.util.ArrayList;

public class largestNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] nums = new int[3];
		ArrayList<String> sorted = new ArrayList<>();
		
		int i, j;
		for(i = 0; i < nums.length; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		int insert = 0;
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < sorted.size(); j++) {
				if((Integer.toString(nums[i]) + sorted.get(j)).compareTo(sorted.get(j) + Integer.toString(nums[i])) > 0){
					sorted.add(j, Integer.toString(nums[i]));
					insert = 1;
					break;
				}
			}
			if(insert != 1) {
				sorted.add(sorted.size(), Integer.toString(nums[i]));
			}
			insert = 0;
		}
		
		String output = "";
		for(i = 0; i < sorted.size(); i++) {
			output += sorted.get(i);
		}
		
		if(output.charAt(0) == '0') {
			System.out.println("0");
		}
		else {
			System.out.println(output);
		}
		
	}
}
