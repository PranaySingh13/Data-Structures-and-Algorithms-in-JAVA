package recursion;

public class Check_Sorted_Array_Recursion {

	/*
	 * Traditional Recursive Method for Arrays i.e; of creating mulitple small
	 * arrays which takes loads of memory.
	 */
	public static boolean checkSorted(int input[]) {

		if (input.length <= 1) {
			return true;
		}

		if (input[0] > input[1]) {
			return false;
		}

		int smallInput[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallInput[i - 1] = input[i];
		}

		boolean smallAnswer = checkSorted(smallInput);
		return smallAnswer;
	}

	/*
	 * Smartest Recursive Method for Arrays i.e; not creating multiple arrays we are
	 * only changing the window for startIndex.
	 */
	public static boolean checkSortedBetter(int input[], int startIndex) {

		// base case 1
		if (startIndex >= input.length - 1) {
			return true;
		}

		// base case 2
		if (input[startIndex] > input[startIndex + 1]) {
			return false;
		}

		// Recursive Call and shifting the startIndex
		boolean smallAnswer = checkSortedBetter(input, startIndex + 1);
		return smallAnswer;
	}

	public static void main(String[] args) {
		int[] input = { 2, 3, 6, 10, 11 };
		System.out.println(checkSorted(input));
		System.out.println(checkSortedBetter(input, 0));
	}

}
