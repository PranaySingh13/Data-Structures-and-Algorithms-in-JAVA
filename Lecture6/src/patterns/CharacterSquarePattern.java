package patterns;

import java.util.Scanner;

public class CharacterSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		
		//If you want to print the ASCII values of characters then take the datatype of loop inner variable as int rather than char.

		// Pattern1
		for (char i = 'A'; i <= c; i++) {

			for (char j = 'A'; j <= c; j++) {

				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("----------");

		// Pattern2
		for (char i = c; i >= 'A'; i--) {

			for (char j = 'A'; j <= c; j++) {

				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("----------");

		// Pattern3
		for (char i = 'A'; i <= c; i++) {

			for (char j = 'A'; j <= c; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("----------");

		// Pattern4
		for (char i = 'A'; i <= c; i++) {

			for (char j = c; j >= 'A'; j--) {

				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("----------");

	}

}
