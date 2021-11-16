package assignment;

import java.util.Scanner;

public class SumofevenoddinN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int soe = 0, soo = 0;
		while (n != 0) {
			int temp = n % 10;
			if (temp % 2 == 0) {
				soe += temp;
			}
			if (temp % 2 != 0) {
				soo += temp;
			}
			n = (int) (n / 10);
		}
		System.out.println(soe + " " + soo);

	}

}
