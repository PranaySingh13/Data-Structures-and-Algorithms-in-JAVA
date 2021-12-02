package assignments;

import java.util.Scanner;

/*
Print This Pattern
  *
 ***
*****
 ***
  * 
*/
public class DiamondOfStars {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// sp stands for space
		// st stands for number
		int sp = n / 2, st = 1;

		// Outer for loop for number of lines
		for (int i = 1; i <= n; i++) {

			// Inner for loop for printing space
			for (int j = 1; j <= sp; j++)
				System.out.print(" ");

			// Inner for loop for printing star
			int count = st / 2 + 1;
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
				if (k <= st / 2)
					count--;
				else
					count++;
			}

			// To goto next line
			System.out.println();
			if (i <= n / 2) {

				// sp decreased by 1
				// st increased by 2
				sp = sp - 1;
				st = st + 2;
			}

			else {

				// sp increased by 1
				// st decreased by 2
				sp = sp + 1;
				st = st - 2;
			}
		}
	}

}
