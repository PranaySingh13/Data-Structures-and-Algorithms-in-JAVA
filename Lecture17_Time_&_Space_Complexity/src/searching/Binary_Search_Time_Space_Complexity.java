package searching;

public class Binary_Search_Time_Space_Complexity {

	// Iterative implementation of Binary Search
	public static int binarySearch(int[] arr, int x) {

		int startIndex = 0;
		int endIndex = arr.length - 1;

		while (startIndex <= endIndex) {

			int midIndex = startIndex + (endIndex - startIndex) / 2;

			// Check if x is present at mid
			if (arr[midIndex] == x) {
				return midIndex;
			}
			// If x greater, ignore left half
			else if (x > arr[midIndex]) {
				startIndex = midIndex + 1;
			}
			// If x is smaller, ignore right half
			else {
				endIndex = midIndex - 1;
			}
		}

		return -1;// if not found
	}

	// Recursive implementation of Binary Search:
	public static int binaryRecursiveSearch(int[] arr, int x) {

		return binaryRecursiveSearch(arr, 0, arr.length - 1, x);
	}

	public static int binaryRecursiveSearch(int[] arr, int startIndex, int endIndex, int x) {

		while (startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;

			// base case
			if (arr[midIndex] == x) {
				return midIndex;
			}

			if (x > arr[midIndex]) {
				return binaryRecursiveSearch(arr, midIndex + 1, endIndex, x);
			} else {
				return binaryRecursiveSearch(arr, startIndex, midIndex - 1, x);
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int x = 50;

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
