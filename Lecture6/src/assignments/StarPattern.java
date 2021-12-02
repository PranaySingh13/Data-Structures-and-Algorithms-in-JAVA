package assignments;

import java.util.Scanner;

/*Print This Pattern
   *
  *** 
 *****
*******
*/
public class StarPattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count=1;//Print Control for odd print

		// outer loop
		for (int i = 1; i <= n; i++) {

			// space loop
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");// whitespace
			}

			// print loop
			for (int k = 1; k <= count; k++) {
				System.out.print("*");
			}
			count+=2;
			System.out.println();
		}

	}

}
