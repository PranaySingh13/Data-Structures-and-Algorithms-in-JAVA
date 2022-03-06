package searching;

public class Linear_Search_Time_Space_Complexity {

	public static int linearSearch(int[] arr, int x) {

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == x) {
//				return i;
//			}
//		}
//		return -1;

		// Alternative
		for (int i : arr) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 40, 10, 4 };
		int x = 10;

		// Function Call
		int result = linearSearch(arr, x);
		if (result == -1) {
			System.out.println("Element is not present in array.");
		} else {
			System.out.println("Element is present at index " + result);
		}

	}

}

/*
 * Time Complexity
 * 
 * Here we are calculating no. of unit operations.
 * 
 * Assuming K Work is done by if condition and it will work for array length. So
 * Worst Case is the element is found at last index of array or not found in the
 * array. Therefore, Worst Case Time Complexity is k*N = O(N).
 * 
 * Best Case is the element is found at first index of array. So the constant
 * time is required. Therefore, Best Case Time Complexity is O(1).
 * 
 * Space Complexity
 * 
 * Space Complexity is the extra memory space required by an algorithim in its
 * life cycle.
 * 
 * Here, only i variable points to location for memory So we can see that the
 * space is constant for any N size array. Therefore,Space Complexity is O(1).
 */
