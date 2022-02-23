package assignment;

import java.util.Scanner;

/*
Sample Input 1 :
00001231
Sample Output 1 :
1231
*/
class Solution3 {
	public static int convertStringToInt(String input) {

		/*
		 * Subtracting the ASCII values of number string with the zero gives the integer
		 * number Ex:- '3'-'0'=3(which is integer)
		 */
		// base case
		if (input.length() <= 1) {
			return ((int) input.charAt(0)) - ((int) '0');
		}

		// Recursion Call
		int smallInteger = convertStringToInt(input.substring(1));

		// Small Calculation
		if (input.charAt(0) != '0') {
			int b = input.charAt(0) - (int) '0';
			return ((b * (int) Math.pow(10, input.length() - 1)) + smallInteger);
		} else {
			return smallInteger;
		}
	}
}

public class String_To_Integer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution3.convertStringToInt(input));

	}

}
