package patterns;

import java.util.Scanner;

public class StarSquarePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//outer loop for no of rows
		for (int i = 1; i <= n; i++) {

			//inner loop for no of cols
			for (int j = 1; j <= n; j++) {

				//what to print
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
