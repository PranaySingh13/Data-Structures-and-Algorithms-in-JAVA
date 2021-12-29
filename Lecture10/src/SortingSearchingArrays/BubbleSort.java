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
public class BubbleSort {

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

	public static void bubbleSort(int[] arr) {

		// run loops two times: one for walking through the array
		// and the other for comparison
		for (int i = 0; i < arr.length - 1; i++) {

			//In each iteration, the comparison takes place up to the last unsorted element.
			for (int j = 0; j < arr.length - i - 1; j++) {

				// To sort in descending order, change > to < in this line.
				if (arr[j] > arr[j + 1]) {

					// swap if greater is at the rear position
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
			BubbleSort.bubbleSort(input);
			printArray(input);

			t -= 1;
		}
	}
}
