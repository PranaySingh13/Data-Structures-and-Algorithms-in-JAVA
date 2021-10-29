package if_else;

import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("One");
		}

		// we can have multiple else if
		// in if-else statements, once a condition is satisfied remaining all the
		// conditions are skipped without evaluation.
		else if (a == 2) {
			System.out.println("Two");
		} else if (a == 3) {
			System.out.println("Three");
		} else {
			System.out.println("None of one, two or three");
		}

	}

}
