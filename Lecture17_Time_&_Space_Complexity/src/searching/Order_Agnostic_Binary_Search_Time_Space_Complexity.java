package searching;

/*Order-Agnostic Binary Search is a modified version of Binary Search algorithm.
Here in this modified binary search comes with one more condition checking. 
The intuition behind this algorithm is what if the order of the sorted array is not given.*/
public class Order_Agnostic_Binary_Search_Time_Space_Complexity {

	// Iterative implementation of Binary Search
	public static int binarySearch(int[] arr, int x) {

		int startIndex = 0;
		int endIndex = arr.length - 1;

		// Checking the sorted order of the given array
		boolean isAscending = arr[startIndex] < arr[endIndex];

		while (startIndex <= endIndex) {

			int midIndex = startIndex + (endIndex - startIndex) / 2;

			// Check if x is present at mid
			if (arr[midIndex] == x) {
				return midIndex;
			}

			// Ascending order
			if (isAscending == true) {

				// If x greater, ignore left half
				if (x > arr[midIndex]) {
					startIndex = midIndex + 1;
				}
				// If x is smaller, ignore right half
				else {
					endIndex = midIndex - 1;
				}
			}

			// Descending order
			else {
				// If x greater, ignore right half
				if (x > arr[midIndex]) {
					endIndex = midIndex - 1;
				}
				// If x is smaller, ignore left half
				else {
					startIndex = midIndex + 1;
				}
			}
		}

		return -1;// if not found
	}

	// Recursive implementation of Binary Search:
	public static int binaryRecursiveSearch(int[] arr, int x) {

		return binaryRecursiveSearch(arr, 0, arr.length - 1, x);
	}

	public static int binaryRecursiveSearch(int[] arr, int startIndex, int endIndex, int x) {

		// Checking the sorted order of the given array
		boolean isAscending = arr[startIndex] < arr[endIndex];

		while (startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;

			// base case
			if (arr[midIndex] == x) {
				return midIndex;
			}

			// Ascending order
			if (isAscending == true) {
				if (x > arr[midIndex]) {
					return binaryRecursiveSearch(arr, midIndex + 1, endIndex, x);
				} else {
					return binaryRecursiveSearch(arr, startIndex, midIndex - 1, x);
				}
			}
			// Descending order
			else {
				if (x > arr[midIndex]) {
					return binaryRecursiveSearch(arr, startIndex, midIndex - 1, x);
				} else {
					return binaryRecursiveSearch(arr, midIndex + 1, endIndex, x);
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 50, 40, 30, 20, 10 };
		int x = 10;

		int result1 = binarySearch(arr, x);
		if (result1 == -1) {
			System.out.println("Element is not present");
		} else {
			System.out.println("Element is present at index " + result1);
		}

		int result2 = binaryRecursiveSearch(arr, x);
		if (result2 == -1) {
			System.out.println("Element is not present");
		} else {
			System.out.println("Element is present at index " + result2);
		}
	}
}

/*
 * Time Complexity
 * 
 * Here we are calculating no. of unit operations.
 * 
 * Worst Case will be when element is not present in the array at all, so it
 * will traverse the half array length again and again(N/2^K) comparing the
 * element with the new midIndex at every iteration K. Worst Case Time
 * Complexity is O(logN).
 * 
 * Best Case is the element is found at mid index of array. So the constant time
 * is required. Therefore, Best Case Time Complexity is O(1).
 * 
 * Space Complexity
 * 
 * Space Complexity is the extra memory space required by an algorithim in its
 * life cycle.
 * 
 * In an iterative implementation of Binary Search, the space complexity will be
 * O(1).
 * 
 * This is because we need two variable to keep track of the range of elements
 * that are to be checked. No other data is needed.
 * 
 * In a recursive implementation of Binary Search, the space complexity will be
 * O(logN).
 * 
 * This is because in the worst case, there will be logN recursive calls and all
 * these recursive calls will be stacked in memory.
 */
