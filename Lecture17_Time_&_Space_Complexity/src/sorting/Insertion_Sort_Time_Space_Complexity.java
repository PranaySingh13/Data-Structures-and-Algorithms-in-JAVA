package sorting;

public class Insertion_Sort_Time_Space_Complexity {

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;// predecessor index
			int temp = arr[i];// current element

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		insertionSort(arr);
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
