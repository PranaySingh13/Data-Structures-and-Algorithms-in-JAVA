package com.gk;

import java.util.Scanner;

public class Factorial {

	/*
	 * T.C. is O(n) as recurring relation is T(n)=T(n-1)+O(1).
	 * 
	 * S.C. is O(n) as it is storing n recursive functions in the stack to perform
	 * recursion.
	 */
	private static int factorialRecursive(int n) {

		// base case
		if (n == 0)
			return 1;

		// recursive call
		return n * factorialRecursive(n - 1);
	}

	/*
	 * T.C. is O(n) as for loop is running for n iterations.
	 * 
	 * S.C. is O(1) as it is taking constant space for storing variables and does
	 * not require any auxilary space as there is no data structure of size n is
	 * created.
	 */
	private static int factorialIterative(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result = result * i;
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorialRecursive(n));
		System.out.println(factorialIterative(n));

	}

}
