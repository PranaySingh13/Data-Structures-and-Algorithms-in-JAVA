package recursion;

import java.util.Scanner;

/*
Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/
class Solution4 {

	public static int firstIndex(int input[], int x) {

		return firstIndexBetter(input, 0, x);
	}

	private static int firstIndexBetter(int input[], int startIndex, int x) {

		if (startIndex == input.length) {
			return -1;
		}

		if (input[startIndex] == x) {
			return startIndex;
		}

		int smallAnswer = firstIndexBetter(input, startIndex + 1, x);
		return smallAnswer;
	}
}

public class First_Index_Of_Number {

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
		System.out.println(Solution4.firstIndex(input, x));

	}

}
