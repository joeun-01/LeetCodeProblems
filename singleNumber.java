package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int[] number = new int[5];
        
        int i;

        for(i = 0; i < number.length; i++) {
            number[i] = keyboard.nextInt();
        }

        System.out.println(getNum(number));
        keyboard.close();
    }

    static public int getNum(int[] nums) {
        HashMap<Integer, String> list = new HashMap<Integer, String>();

        int i;
        for(i = 0; i < nums.length; i++) {
            if(list.containsKey(nums[i])) {  // 이미 nums[i]가 있는 경우 중복이라고 생각하고 N으로 수정
                list.put(nums[i], "N");
            }
            else {
                list.put(nums[i], "Y");  // 처음에는 Y로 설정
            }
        }
        
        for(Integer value : list.keySet()) {
            if(list.get(value) == "Y") {
                return value;
            } 
        }

        return 0;
    }
    
}
