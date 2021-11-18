package assignment;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int choice = scanner.nextInt();
		scanner.close();

		if (n >= 1 && n <= 12) {
			int sum = 0, product = 1;
			if (choice == 1) {

				for (int i = 1; i <= n; i++) {
					sum += i;
				}

				System.out.println(sum);

			} else if (choice == 2) {

				for (int i = 1; i <= n; i++) {
					product *= i;
				}

				System.out.println(product);

			} else {
				System.out.println(-1);
			}

		}

	}
}
