package twoDimensionalArrays;

public class JaggedArrays {

	public static void main(String[] args) {

		int arr[][] = new int[3][5];
		System.out.println(arr);// address of master 2d array
		System.out.println(arr[0]);// address of 1st 1d array at 0th index

		int arr2[][] = new int[4][];
		System.out.println(arr2);// address of master 2d array

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);// null because 1d array is not created
		}

		System.out.println(arr[0][0]);// 0
		// System.out.println(arr2[0][0]);//Null Pointer Exception

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new int[2];
			System.out.println(arr2[i]);// addresses of the 1d arrays
		}

		System.out.println(arr2[0][0]);// 0 because now 1d arrays are created for arr2

		/*
		 * A Jagged array is an array of arrays such that member arrays can be of
		 * different sizes, i.e., we can create a 2-D array but with a variable number
		 * of columns in each row. These types of arrays are also known as Jagged
		 * arrays.
		 */

		// Creating Jagged Arrays
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new int[i + 2];
		}

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = count++;
			}
		}

		// Printing Jagged Arrays
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
