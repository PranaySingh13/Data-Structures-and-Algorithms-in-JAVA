package recursion;

import java.util.Arrays;
import java.util.Scanner;

/*
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
*/
class Solution3 {

	public static void mergeSort(int[] input) {

		// base case
		if (input.length == 1) {
			return;
		}

		int startIndex = 0;
		int endIndex = input.length - 1;
		int midIndex = startIndex + (endIndex - startIndex) / 2;

		int[] leftInput = Arrays.copyOfRange(input, startIndex, midIndex + 1);
		mergeSort(leftInput);//Recursion Call 1

		int[] rightInput = Arrays.copyOfRange(input, midIndex + 1, endIndex + 1);
		mergeSort(rightInput);//Recursion Call 2

		//Calculation
		merge(input, leftInput, rightInput);

	}

	private static void merge(int[] input, int[] leftInput, int[] rightInput) {

		int n1 = leftInput.length;
		int n2 = rightInput.length;

		int newSortedInput[] = new int[n1 + n2];

		// For Traversing in arrays.
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (leftInput[i] < rightInput[j]) {

				// a[x++] increments x, not the element at index x.
				newSortedInput[k++] = leftInput[i++];

				/*
				 * Detailed meaning of above 
				 * arr3[k] = arr1[i]; 
				 * k++; 
				 * i++;
				 */
			} else {
				newSortedInput[k++] = rightInput[j++];
			}
		}

		// Store remaining element of left array(if any)
		while (i < n1) {
			newSortedInput[k++] = leftInput[i++];
		}

		// Store remaining element of right array(if any)
		while (j < n2) {
			newSortedInput[k++] = rightInput[j++];
		}

		// Copy All Sorted elements in input main array
		for (int a = 0; a < input.length; a++) {
			input[a] = newSortedInput[a];
		}
	}

}

public class Merge_Sort {

	@SuppressWarnings("resource")
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		Solution3.mergeSort(input);
		printArray(input);
	}

}
