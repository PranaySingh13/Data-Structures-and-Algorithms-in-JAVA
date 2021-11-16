package patterns;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// outer loop
		for (int i = 1; i <= n; i++) {

			// space loop
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");// whitespace
			}

			// print loop
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");//whitespace after *
			}

			System.out.println();
		}
	}

}
