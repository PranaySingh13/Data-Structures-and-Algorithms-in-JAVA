package recursion;

import java.util.Scanner;

/*
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
*/
class Solution1 {
	public static String removeConsecutiveDuplicates(String s) {

		// base case
		if (s.length() <= 1) {
			return s;
		}

		// Recursive Call
		String smallString = removeConsecutiveDuplicates(s.substring(1));

		// Small Calculation
		if (s.charAt(0) == s.charAt(1)) {
			return smallString;
		} else {
			return s.charAt(0) + smallString;
		}
	}
}

public class Remove_Duplicates_Recursively {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(Solution1.removeConsecutiveDuplicates(input));

	}

}
