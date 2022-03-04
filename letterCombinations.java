package 연습용;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class letterCombinations {
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String digits = keyboard.nextLine();

		String alphabet[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		letter(digits, 0, alphabet, "");
	}

	public static void letter(String word, int digit, String[] alpha, String output) {
		if (digit == word.length()) {
			list.add(output);
		}
		int leng = alpha[Integer.parseInt(word.substring(digit, digit + 1))].length();
		
		int i;
		for (i = 0; i < leng; i++) {
			output += alpha[Integer.parseInt(word.substring(digit, digit + 1))].substring(i, i + 1);
			System.out.println(output);
			letter(word, digit + 1, alpha, output);
			output = output.substring(0, output.length() - 1);
		}
	}
	/*
	 * private void dfs(int st, String digits, StringBuilder sb, List<String> res,
	 * Map<Character, String> map) { if(st == digits.length()) {
	 * res.add(sb.toString()); return; }
	 * 
	 * String str = map.get(digits.charAt(st)); for(int i = 0; i < str.length();
	 * i++) { sb.append(str.charAt(i)); dfs(st + 1, digits, sb, res, map);
	 * sb.setLength(sb.length() - 1); } }
	 */
}
