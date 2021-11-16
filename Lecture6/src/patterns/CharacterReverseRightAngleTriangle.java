package patterns;

import java.util.Scanner;

public class CharacterReverseRightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);

		// Pattern 1
		for (char i = 'A'; i <= c; i++) {

			for (char j = c; j >= i; j--) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("----------");

		// Pattern 2
		for (char i = 'A'; i <= c; i++) {

			for (char j = c; j >= i; j--) {

				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println("----------");
	}

}
