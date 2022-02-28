package recursion;

import java.util.Scanner;

/*
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/
class Solution8 {
	public static String[] returnKeys(int n) {
		String[] returnKeys = null;

		switch (n) {
		case 2:
			returnKeys = new String[] { "a", "b", "c" };
			break;
		case 3:
			returnKeys = new String[] { "d", "e", "f" };
			break;
		case 4:
			returnKeys = new String[] { "g", "h", "i" };
			break;
		case 5:
			returnKeys = new String[] { "j", "k", "l" };
			break;
		case 6:
			returnKeys = new String[] { "m", "n", "o" };
			break;
		case 7:
			returnKeys = new String[] { "p", "q", "r", "s" };
			break;
		case 8:
			returnKeys = new String[] { "t", "u", "v" };
			break;
		case 9:
			returnKeys = new String[] { "w", "x", "y", "z" };
			break;
		}

		return returnKeys;
	}

	private static void printKeypad(int input, String outputSoFar) {

		// base case
		if (input == 0 || input == 1) {
			System.out.println(outputSoFar);
			return;
		}

		String[] keys = returnKeys(input % 10);
		for (int i = 0; i < keys.length; i++) {
			printKeypad(input / 10, keys[i] + outputSoFar);
		}

	}

	public static void printKeypad(int input) {
		// Write your code here
		printKeypad(input, "");
	}
}

public class PrintKeypadCombinations {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		Solution8.printKeypad(input);

	}

}
