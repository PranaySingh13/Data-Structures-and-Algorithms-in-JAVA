package assignment;

import java.util.Scanner;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println(n%10);
		System.out.println(n%100);
	}

}
