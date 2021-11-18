package assignment;

import java.util.Scanner;

public class XTermsOfAP {

	public static void main(String[] args) {
		/*
		 * Write a program to print first x terms of the series 3N + 2 which are not
		 * multiples of 4.
		 */

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();

		if (x >= 1 && x <= 1000) {

			int count=1;
			for (int i = 1; count <= x; i++) {
				int num = 0;
				num = num + (3 * i + 2);
				if (num % 4 == 0) {
					continue;
				}
				System.out.print(num+" ");
				count++;
			}
		}
	}

}
