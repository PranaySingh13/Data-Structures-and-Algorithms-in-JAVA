package sorting;

import java.util.Arrays;

/* Merge Sort is a Divide and Conquer algorithm. 
 * It divides the input array into two halves, calls 
 * itself for the two halves, and then merges the two 
 * sorted halves.
 * 
 * we can see that the array is recursively divided into two
 *halves till the size becomes 1. Once the size becomes 1, 
 *the merge processes come into action and start merging 
 *arrays back till the complete array is merged.*/
public class Merge_Sort_Time_Space_Complexity {

	public static void mergeSort(int[] input) {

		// base case
		if (input.length == 1) {
			return;
		}

		int startIndex = 0;
		int endIndex = input.length - 1;

		// Find the middle point to divide the array into two halves
		int midIndex = startIndex + (endIndex - startIndex) / 2;

		int[] leftInput = Arrays.copyOfRange(input, startIndex, midIndex + 1);
		mergeSort(leftInput);// Call mergeSort for first half

		int[] rightInput = Arrays.copyOfRange(input, midIndex + 1, endIndex + 1);
		mergeSort(rightInput);// Call mergeSort for second half

		// Merge the two halves sorted
		merge(input, leftInput, rightInput);
	}

	public static void merge(int[] input, int[] leftInput, int[] rightInput) {
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
				 * Detailed meaning of above arr3[k] = arr1[i]; k++; i++;
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

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		mergeSort(arr);
		print(arr);

	}

}

/*
 * Time Complexity
 * 
 * Here we are calculating recurrence relation.
 * 
 * Merge Sort is a recursive algorithm and time complexity can be expressed as
 * following recurrence relation. T(n) = 2T(n/2) + O(n).
 * 
 * Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and
 * best) as merge sort always divides the array into two halves and takes linear
 * time to merge two halves.
 * 
 * Space Complexity
 * 
 * Space Complexity is the extra memory space required by an algorithim in its
 * life cycle.
 * 
 * For Storing Recursion functions it takes extra space of O(logN).
 * 
 * For creating and copying the element in the new array doing some work K for
 * every iteration till array length N.So taking k*N= O(N) extra Space.
 * 
 * Overall Space Complexity is O(N) + O(logN) = O(N) as O(logN) is comparitively
 * Smaller.
 * 
 * Drawbacks of Merge Sort
 * 
 * Slower comparative to the other sort algorithms for smaller tasks.
 * 
 * Merge sort algorithm requires an additional memory space of 0(n) for the
 * temporary array.
 * 
 * It goes through the whole process even if the array is sorted.
 * 
 */
