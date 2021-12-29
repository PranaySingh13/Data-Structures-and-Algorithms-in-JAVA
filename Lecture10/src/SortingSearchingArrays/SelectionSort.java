package SortingSearchingArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4
*/
public class SelectionSort {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void selectionSort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {

			// Find the minimum element in the array(assuming the first element of array as
			// minimum)
			int minimum = input[i];
			int minIdx = i;

			for (int j = i + 1; j < input.length; j++) {

				// to sort in descending order, change < to > in this
				// line select the minimum element in each loop

				if (input[j] < minimum) {

					minimum = input[j];// new minimum value
					minIdx = j;// Changing Index pointer for minimum
				}
			}

			int temp = input[i];// storing temporarily for swap

			// Swap
			input[i] = input[minIdx];
			input[minIdx] = temp;
		}

	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			SelectionSort.selectionSort(input);
			printArray(input);

			t -= 1;
		}
	}

}
