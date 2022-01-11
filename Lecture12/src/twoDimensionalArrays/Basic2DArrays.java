package twoDimensionalArrays;

public class Basic2DArrays {

	public static void main(String[] args) {

		int arr1[][] = new int[4][5];

		// Initializing the values
		arr1[1][2] = 6;
		arr1[2][4] = 5;

		System.out.println(arr1[1][2] + " " + arr1[2][4] + " " + arr1[0][0]);// 6 5 0

		// Array can be initialize
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr2[0][1] + " " + arr2[1][2]);// 2 6
	}

}
