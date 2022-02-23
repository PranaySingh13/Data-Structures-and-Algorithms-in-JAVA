package assignment;

import java.util.Scanner;

/*
Sample Input 1 :
xpixpi
Sample Output :
x3.14x3.14
*/
class Solution {

	public static String replace(String input) {

		// base case
		if (input.length() <= 1) {
			return input;
		}

		String smallString = replace(input.substring(1));

		if (input.charAt(0) == 'p') {
			if (smallString.charAt(0) == 'i') {
				return "3.14" + smallString.substring(1);
			} else {
				return input.charAt(0) + smallString;
			}
		} else {
			return input.charAt(0) + smallString;
		}
	}
}

public class Replace_Pi_In_String {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.replace(input));

	}

}
