package while_loop;

import java.util.Scanner;

public class SumofEvenNumberstillN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 2;// Next number to be added

		int sum = 0;

		while (i <= n) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);
	}

}
