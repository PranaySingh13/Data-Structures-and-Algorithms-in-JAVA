package assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n >= 0 && n <= 10000) {
			int i = 1;
			while (i <= 10) {
				System.out.println(n * i);
				i++;
			}
		}
	}

}
