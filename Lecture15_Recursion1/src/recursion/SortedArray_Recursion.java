package recursion;

public class SortedArray_Recursion {

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

	
	public static void main(String[] args) {
		int[] input = { 2, 3, 6, 10, 11 };
		System.out.println(checkSorted(input));
	}

}
