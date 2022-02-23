package assignment;

import java.util.Scanner;

/*
Sample Input 1 :
xaxb
Sample Output 1:
ab
*/
class Solution1 {

	public static String removeX(String input) {

		// base case 1
		if (input.length() <= 1) {
			if (input.charAt(0) != 'x') {
				return input;
			} else {
				return "";
			}
		}

		// Recursion Call
		String smallString = removeX(input.substring(1));

		// Small Calculation
		if (input.charAt(0) == 'x') {
			return smallString;
		} else {
			return input.charAt(0) + smallString;
		}

	}

}

public class Remove_X_In_String {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution1.removeX(input));

	}

}
