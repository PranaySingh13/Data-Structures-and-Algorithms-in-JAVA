package assignment;

import java.util.Scanner;

/*
Sample Input 1 :
hello
Sample Output 1:
hel*lo
*/
class Solution4 {

	public static String addStars(String s) {

		// base case
		if (s.length() <= 1) {
			return s;
		}

		String smallString = addStars(s.substring(1));

		if (s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + smallString;
		} else {
			return s.charAt(0) + smallString;
		}
	}
}

public class Pair_Star {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution4.addStars(input));

	}

}
