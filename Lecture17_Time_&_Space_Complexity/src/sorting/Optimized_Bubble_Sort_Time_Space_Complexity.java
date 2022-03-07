package sorting;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly
 *swapping the adjacent elements if they are in wrong order.*/
public class Optimized_Bubble_Sort_Time_Space_Complexity {

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				
				// To Sort in Descending Order replace > condition by <.
				if (arr[j] > arr[j + 1]) {

					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * Optimized Implementation: The above function always runs O(n^2) time even if
	 * the array is sorted. It can be optimized by stopping the algorithm if inner
	 * loop didn’t cause any swap.
	 */
	public static void optimizedBubbleSort(int[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				
				// To Sort in Descending Order replace > condition by <.
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 25 };
		optimizedBubbleSort(arr);
		print(arr);

	}

}
/*
 * Time Complexity
 *
 * Here we are calculating no. of unit operations.
 * 
 * Worst and Average Case Time Complexity:- As there are two nested loops
 * traversing the whole array length so the time complexity is O(N^2).
 * 
 * Best Case Time Complexity: O(n). Best case occurs when array is already
 * sorted.
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
 */
