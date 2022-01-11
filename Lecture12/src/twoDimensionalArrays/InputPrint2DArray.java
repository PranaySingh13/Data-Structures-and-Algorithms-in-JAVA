package twoDimensionalArrays;

import java.util.Scanner;

public class InputPrint2DArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter the value for " + i + " row and " + j + " column ");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
