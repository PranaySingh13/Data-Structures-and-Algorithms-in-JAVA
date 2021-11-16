package while_loop;

import java.util.Scanner;

public class FahToCelTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int startValue = sc.nextInt();
		int endValue = sc.nextInt();
		int widthStep = sc.nextInt();

		int cel;

		while (startValue <= endValue) {
			cel = ((5 * (startValue - 32)) / 9);
			System.out.println(startValue + "\t" + cel);
			startValue += widthStep;
		}
	}

}
