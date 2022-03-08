package sorting;

/*QuickSort is a Divide and Conquer algorithm. 
 *It picks an element as pivot and partitions 
 *the given array around the picked pivot.*/
public class Quick_Sort_Time_Space_Complexity {

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

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr);
		print(arr);

	}

}

/*
 * Analysis of QuickSort Time taken by QuickSort, in general, can be written as
 * following.
 * 
 * 
 * 
 * T(n) = T(k) + T(n-k-1) + O(n)
 * 
 * 
 * The first two terms are for two recursive calls, the last term is for the
 * partition process. k is the number of elements which are smaller than pivot.
 * The time taken by QuickSort depends upon the input array and partition
 * strategy. Following are three cases.
 * 
 * 
 * 
 * Worst Case: The worst case occurs when the partition process always picks
 * greatest or smallest element as pivot. If we consider above partition
 * strategy where last element is always picked as pivot, the worst case would
 * occur when the array is already sorted in increasing or decreasing order.
 * Following is recurrence for worst case.
 * 
 * 
 * 
 * T(n) = T(0) + T(n-1) + O(n)
 * 
 * which is equivalent to
 * 
 * T(n) = T(n-1) + O(n)
 * 
 * 
 * The solution of above recurrence is O(N^2).
 * 
 * 
 * 
 * Best Case: The best case occurs when the partition process always picks the
 * middle element as pivot. Following is recurrence for best case.
 * 
 * 
 * 
 * T(n) = 2T(n/2) + O(n)
 * 
 * 
 * The solution of above recurrence is O(nLogn).
 * 
 * Average Case: To do average case analysis, we need to consider all possible
 * permutation of array and calculate time taken by every permutation which
 * doesn’t look easy. We can get an idea of average case by considering the case
 * when partition puts O(n/9) elements in one set and O(9n/10) elements in other
 * set. Following is recurrence for this case.
 * 
 * 
 * 
 * T(n) = T(n/9) + T(9n/10) + O(n)
 * 
 * 
 * Solution of above recurrence is also O(nLogn)
 * 
 * Although the worst case time complexity of QuickSort is O(n2) which is more
 * than many other sorting algorithms like Merge Sort and Heap Sort, QuickSort
 * is faster in practice, because its inner loop can be efficiently implemented
 * on most architectures, and in most real-world data. QuickSort can be
 * implemented in different ways by changing the choice of pivot, so that the
 * worst case rarely occurs for a given type of data. However, merge sort is
 * generally considered better when data is huge and stored in external storage.
 * 
 * Space Complexity of Quick sort
 * 
 * The worst case space used will be O(n) . The average case space used will be
 * of the order O(log n) . The worst case space complexity becomes O(n) , when
 * the algorithm encounters its worst case where for getting a sorted list, we
 * need to make n recursive calls.
 */
