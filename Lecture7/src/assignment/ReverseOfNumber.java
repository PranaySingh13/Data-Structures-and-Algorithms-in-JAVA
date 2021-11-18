package assignment;

import java.util.Scanner;

public class ReverseOfNumber {

	public int reverse(int number) {
		int last_digit = 0;
		int ans = 0;

		while (number != 0) {
			last_digit = number % 10;
			ans = ans * 10 + last_digit;
			number = number / 10;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {

		// Write a program to generate the reverse of a given number N.

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();

		ReverseOfNumber rn = new ReverseOfNumber();
		rn.reverse(N);
	}

}
