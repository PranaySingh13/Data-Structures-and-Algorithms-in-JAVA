package com.gk;

import java.util.Scanner;

public class Trailing_Zeroes_In_Factorial {

	// Naive Method
	/* T.C. is O(n). But it will have overflow issues for larger values of n. */
	public static int countTrailingZeroesInFactorial1(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result = result * i;

		int count = 0;
		while (result != 0) {
			if (result % 10 == 0)
				count++;
			result = result / 10;
		}
		return count;
	}

	// Efficient Method
	/*
	 * Count Numbers of 5s till N as its product with 2s will produce multiples of
	 * 10.
	 * 
	 * T.C. is O(logn) which is less than T.C. of Naive Solution.
	 */
	public static int countTrailingZeroesInFactorial2(int n) {
		int result = 0;
		for (int i = 5; i <= n; i = i * 5)
			result = result + (n / i);
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 100
		System.out.println(countTrailingZeroesInFactorial1(n));// 0
		System.out.println(countTrailingZeroesInFactorial2(n));// 24

	}

}
