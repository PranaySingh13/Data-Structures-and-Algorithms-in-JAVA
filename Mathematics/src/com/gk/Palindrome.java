package com.gk;

import java.util.Scanner;

/*
Example
1221
true
123
false
*/
public class Palindrome {

	// T.C. is O(n).
	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse = 0;
		while (temp != 0) {
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp = temp / 10;
		}
		return (reverse == n) ? true : false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindrome(n));
	}

}
