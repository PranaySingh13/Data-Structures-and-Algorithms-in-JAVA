package recursion;

import java.util.Scanner;

public class Print_Subsequence_Of_String {

	// Need of this function is to store output
	public static void printSubsequences(String s, String outputSoFar) {

		// base case
		if (s.length() == 0) {
			System.out.println(outputSoFar);

			// Returning after printing output
			return;
		}

		// We Choose Excluding Starting Chracter in the output string
		printSubsequences(s.substring(1), outputSoFar);

		// We Choose Including Starting Character in the output string
		printSubsequences(s.substring(1), outputSoFar + s.charAt(0));

	}

	public static void printSubsequences(String s) {

		// Initially outputSoFar String will be empty "" as we have not decided
		printSubsequences(s, "");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSubsequences(str);
	}

}
