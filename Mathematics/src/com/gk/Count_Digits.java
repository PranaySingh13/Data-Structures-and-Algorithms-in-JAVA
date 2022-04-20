package com.gk;

import java.util.Scanner;

public class Count_Digits {

	// T.C. is O(n).
	public static int countDigitIterative(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	// T.C. is O(n).
	public static int countDigitRecursive(int n) {
		if (n == 0)
			return 0;
		return 1 + countDigitRecursive(n / 10);
	}

	// T.C. is O(1).
	public static int countDigitLogarathmic(int n) {

		return (int) Math.floor(Math.log10(n) + 1);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countDigitIterative(n));
		System.out.println(countDigitRecursive(n));
		System.out.println(countDigitLogarathmic(n));

	}

}
