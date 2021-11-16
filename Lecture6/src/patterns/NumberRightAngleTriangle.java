package patterns;

import java.util.Scanner;

public class NumberRightAngleTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Pattern1
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("------------");

		// Pattern2
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println("------------");
	}

}
