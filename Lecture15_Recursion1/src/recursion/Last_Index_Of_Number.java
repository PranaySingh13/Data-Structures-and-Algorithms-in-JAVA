package recursion;

import java.util.Scanner;

/*
Sample Input :
4
9 8 10 8
8
Sample Output :
3
*/
class Solution5 {

	public static int lastIndex(int input[], int x) {

		return lastIndexBetter(input, x, input.length - 1);
	}

	private static int lastIndexBetter(int input[], int x, int lastIndex) {

		if (lastIndex == 0) {
			return -1;
		}

		if (input[lastIndex] == x) {
			return lastIndex;
		}

		int smallAnswer = lastIndexBetter(input, x, lastIndex - 1);
		return smallAnswer;
	}
}

public class Last_Index_Of_Number {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution5.lastIndex(input, x));

	}

}
