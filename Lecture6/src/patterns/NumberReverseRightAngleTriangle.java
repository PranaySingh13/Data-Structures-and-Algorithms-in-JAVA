package patterns;

import java.util.Scanner;

public class NumberReverseRightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Pattern 1
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("----------");

		// Pattern 2
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println("----------");
	}

}
