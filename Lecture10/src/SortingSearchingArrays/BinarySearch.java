package SortingSearchingArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Sample Input 2:
7
1 2 3 4 5 6 7
2
9
7
Sample Output 2:
-1
6
 * */
public class BinarySearch {
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

	//Binary Search is only for sorted arrays.
	public static int binarySearch(int[] arr, int x) {
		int startIndex = 0;
		int endIndex = arr.length - 1;

		// Repeat until the pointers start and end meet each other
		while (startIndex <= endIndex) {

			int midIndex = startIndex + (endIndex - startIndex) / 2;// Middle Index

			if (x == arr[midIndex]) {// element found
				return midIndex;
			} else if (x > arr[midIndex]) {// x is on the right side
				startIndex = midIndex + 1;
			} else {// x is on the left side
				endIndex = midIndex - 1;
			}
		}

		return -1;// Element is not found
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] input = takeInput();
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int x = Integer.parseInt(br.readLine().trim());
			System.out.println(BinarySearch.binarySearch(input, x));

			t -= 1;
		}
	}

}
