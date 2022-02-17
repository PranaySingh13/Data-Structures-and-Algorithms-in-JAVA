package recursion;

/*
 * Recursion in computer science is a method where the solution to a problem
 * depends on solutions to smaller instances of the same problem.
 */

/*
 * recursion a function calls itself to solve smaller problems
 * 
 * Base Case: A recursive function must have a terminating condition at which
 * the function will stop calling itself. Such a condition is known as a base
 * case.
 * 
 * Recursive Call: The recursive function will recursively invoke itself on the
 * smaller version of problem.
 * 
 * Small Calculation: Generally we perform a some calculation step in each
 * recursive call. We can perform this calculation step before or after the
 * recursive call depending upon the nature of the problem.
 * 
 * 
 * It is important to note here that recursion uses in-built stack to store the recursive
 * calls. So, to avoid memory overflow problem, we should define a recursive
 * solution with minimum possible number of recursive calls such that the base
 * condition is achieved before the recursion stack starts overflowing on
 * getting completely filled.
 */

public class RecursionFactorial {

	public static int factorial(int n) {

		// Base Case
		if (n == 0) {
			return 1;// as 0!=1
		}

		// Recursive Call
		int smallAnswer = factorial(n - 1);

		// Small Calculation
		return n * smallAnswer;
	}

	public static void main(String[] args) {

		int answer = factorial(4);
		System.out.println(answer);

	}

}
