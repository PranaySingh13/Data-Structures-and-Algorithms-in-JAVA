package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LargestColumnSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@SuppressWarnings("resource")
	public static int[][] take2DInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = s.nextInt();
		System.out.println("Number of columns ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element at " + i + " row " + j + " column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static int largestColSum(int input[][]) {

		int largest = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;

		for (int j = 0; j < cols; j++) {

			int sum = 0;

			for (int i = 0; i < rows; i++) {
				sum = sum + input[i][j];
			}
			if (sum > largest) {
				largest = sum;
			}
		}

		return largest;
	}

	public static void print(int[][] input) {
		int rows = input.length;
		int cols = input[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		int input[][] = take2DInput();
		print(input);
		System.out.println("Largest col sum " + largestColSum(input));

	}

}
