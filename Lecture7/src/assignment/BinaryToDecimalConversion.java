package assignment;

import java.util.Scanner;

public class BinaryToDecimalConversion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int sum = 0, two = 1, place;
		// int count=0;

		while (binary != 0) {
			place = binary % 10;
			sum = sum + (place * two);

			two *= 2;
			binary /= 10;
		}

		System.out.println(sum);

	}

}
