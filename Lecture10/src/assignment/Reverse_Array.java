package assignment;

import java.io.IOException;

class Solution1 {

	public static void reverseArray(int input[]) {
		reverse(input, 0, input.length - 1);
	}

	public static void reverse(int arr[], int startIndex, int endIndex) {

		int temp;
		while (startIndex < endIndex) {
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
}

public class Reverse_Array {

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Solution1.reverseArray(input);
		printArray(input);

	}

}
