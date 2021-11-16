package patterns;

import java.util.Scanner;

public class NumberSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// pattern1
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("------------");

		// pattern2
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("------------");

		// pattern3
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
		
		System.out.println("------------");

		// pattern4
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= 1; j--) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

}
