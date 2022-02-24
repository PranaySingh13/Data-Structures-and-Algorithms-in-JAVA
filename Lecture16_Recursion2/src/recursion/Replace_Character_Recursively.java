package recursion;

import java.util.Scanner;

/*
Sample Input :
abacd
a x
Sample Output :
xbxcd
*/
class Solution {
	public static String replaceCharacter(String input, char c1, char c2) {

		// base case
		if (input.length() <= 1) {
			return input;
		}

		// Recursion Call
		String smallString = replaceCharacter(input.substring(1), c1, c2);

		// Small Calculation
		if (input.charAt(0) == c1) {
			return c2 + smallString;
		} else {
			return input.charAt(0) + smallString;
		}
	}
}

public class Replace_Character_Recursively {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(Solution.replaceCharacter(input, c1, c2));

	}

}
