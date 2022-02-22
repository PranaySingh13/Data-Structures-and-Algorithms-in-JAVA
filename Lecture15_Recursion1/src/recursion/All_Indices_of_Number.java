package recursion;

import java.util.Scanner;

/*
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/
class Solution6 {

	public static int[] allIndexes(int input[], int x) {

		return allIndexexBetter(input, x, 0);
	}

	private static int[] allIndexexBetter(int[] input, int x, int startIndex) {

		if (startIndex == input.length) {
			int[] rv = new int[0];
			return rv;
		}
		int[] roaIndex = allIndexexBetter(input, x, startIndex + 1);
		if (input[startIndex] == x) {
			int[] totalIndex = new int[(roaIndex.length) + 1];
			totalIndex[0] = startIndex;
			for (int i = 0; i < roaIndex.length; i++) {
				totalIndex[i + 1] = roaIndex[i];
			}
			return totalIndex;
		} else {
			return roaIndex;
		}
	}
}

public class All_Indices_of_Number {

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
		int output[] = Solution6.allIndexes(input, x);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
