package recursion;

import java.util.Scanner;
/*
Sample Input 1:
xyz
Sample Output 1:
""
z
y
yz
x
xz
xy
xyz 
*/

class Solution5 {

	public static String[] returnSubsequences(String s) {

		// base case
		if (s.length() == 0) {
			String answer[] = { "" };
			return answer;
		}

		// recursion Call
		String[] smallString = returnSubsequences(s.substring(1));

		// creating new array for storing subsequence of twice length of smallString as
		// smallString subsequences are also part of main String.
		String[] answer = new String[2 * smallString.length];

		// Copying subsequences of smallString into main String
		int k = 0;
		for (int i = 0; i < smallString.length; i++) {
			answer[k] = smallString[i];
			k++;
		}

		// appending main String character with the subsequences of smallString gives
		// all subsequnces
		for (int i = 0; i < smallString.length; i++) {
			answer[k] = s.charAt(0) + smallString[i];
			k++;
		}

		return answer;
	}
}

public class Return_Subsequences {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer[] = Solution5.returnSubsequences(s);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
