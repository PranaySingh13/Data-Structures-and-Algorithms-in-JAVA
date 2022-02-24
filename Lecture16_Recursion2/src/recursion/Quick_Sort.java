package recursion;

import java.util.Scanner;

/*
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
*/
class Solution4 {
	public static void quickSort(int[] input) {

		quickSort(input, 0, input.length - 1);

	}

	public static void quickSort(int[] input, int startIndex, int endIndex) {

		// base case
		if (startIndex >= endIndex) {
			return;
		}

		int pivotPosition = partition(input, startIndex, endIndex);

		// Recursion Call 1 for Part 1
		quickSort(input, startIndex, pivotPosition - 1);

		// Recursion Call 2 for Part 2
		quickSort(input, pivotPosition + 1, endIndex);
	}

	public static int partition(int[] input, int startIndex, int endIndex) {

		// Find Pivot
		int pivot = input[startIndex];

		// Place Pivot at its position
		// checking for all inputs which is less than pivot
		int count = 0;
		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (input[i] <= pivot)
				count++;
		}

		int pivotPosition = startIndex + count;
		// swapping pivot at pivotPosition
		int temp1 = input[startIndex];
		input[startIndex] = input[pivotPosition];
		input[pivotPosition] = temp1;

		// Ensure the array towards left will be less than pivot and towwards right will
		// be greater than pivot
		int a = startIndex, b = endIndex;
		while (a < pivotPosition && b > pivotPosition) {
			if (input[a] <= input[pivotPosition]) {
				a++;
			} else if (input[b] > input[pivotPosition]) {
				b--;
			} else {
				// Swap
				int temp2 = input[a];
				input[a] = input[b];
				input[b] = temp2;
				a++;
				b--;
			}
		}

		return pivotPosition;
	}
}

public class Quick_Sort {

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
		Solution4.quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
