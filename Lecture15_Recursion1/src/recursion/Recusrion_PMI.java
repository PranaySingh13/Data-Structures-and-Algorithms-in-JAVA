package recursion;

/* PMI
 * 
 * 
 * It is interesting to note here that the concept of recursion is based on the
 * mathematical concept of PMI (Principle of Mathematical Induction). When we
 * use PMI to prove a theorem, we have to show that the base case (usually for
 * x=0 or x=1) is true and, the induction hypothesis for case x=k is true must
 * imply that case x=k+1 is also true. We can now understand how the steps which
 * we followed in recursion are based on the induction steps, as in recursion
 * also, we have a base case while the assumption corresponds to the recursive
 * call.
 */
public class Recusrion_PMI {

	public static int sum(int n) {

		// base case
		if (n == 1) {
			return 1;
		}

		// induction hypothesis and small calculation
		return n + sum(n - 1);
	}

	public static void main(String[] args) {

		int answer = sum(10000);
		System.out.println(answer);
	}

}
