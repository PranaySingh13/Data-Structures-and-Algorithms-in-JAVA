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
public class InsertionSort {

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

	public static void insertionSort(int[] arr) {

		// Assume first element should be sorted
		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i;

			// Compare key with each element on the left of it until an
			// element smaller than it is found
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];// shift by one place to the left
				j--;
			}

			arr[j] = key;// placed to right sorted
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
			InsertionSort.insertionSort(input);
			printArray(input);

			t -= 1;
		}
	}
}
