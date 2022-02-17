package recursion;

import java.util.Scanner;

/* Fiboncacci Series:- 0,1,1,2,3,5,8,13,21------ . 
 * Formula F(n)=F(n-1)+F(n-2) where F(0)=0 and F(1)=1.*/

public class Nth_Fibonacci_Number_Recursion {

	public static int fib(int n) {

		// base case
		if (n == 0 || n == 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

}
