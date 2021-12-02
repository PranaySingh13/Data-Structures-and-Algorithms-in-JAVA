package assignments;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;

		System.out.print("*\n");
		// Print the first upper half
		for (i = 1; i <= n; i++) {
			System.out.print("*");
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("*");

			System.out.print("\n");
		}

		// Print the lower half of the pattern
		for (i = n - 1; i >= 1; i--) {
			System.out.print("*");
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("*");

			System.out.print("\n");
		}
		System.out.print("*");

	}

}
