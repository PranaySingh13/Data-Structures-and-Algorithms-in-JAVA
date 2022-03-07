package sorting;

public class Selection_Sort_Time_Space_Complexity {

	public static void selectionSort(int[] arr) {

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < arr.length - 1; i++) {

			int minimumIndex = i;

			// Find the minimum element in unsorted array
			for (int j = i + 1; j < arr.length; j++) {

				// To Sort in Descending Order replace < condition by >.
				if (arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
				}
			}

			// Swap the found minimum element with the first element
			int temp = arr[minimumIndex];
			arr[minimumIndex] = arr[i];
			arr[i] = temp;
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort(arr);
		print(arr);

	}

}

/*
 * Time Complexity
 *
 * Here we are calculating no. of unit operations.
 * 
 * As there are two nested loops traversing the whole array length so the time
 * complexity is O(N^2).
 * 
 * Space Complexity
 * 
 * Space Complexity is the extra memory space required by an algorithim in its
 * life cycle.
 * 
 * Here, we need two variable to keep track of the range of elements that are to
 * be checked. No other data is needed.
 * 
 * Space Complexity is O(1) i.e; Constant Time.
 * 
 * The good thing about selection sort is it never makes more than O(n) swaps
 * and can be useful when memory write is a costly operation.
 * 
 */
