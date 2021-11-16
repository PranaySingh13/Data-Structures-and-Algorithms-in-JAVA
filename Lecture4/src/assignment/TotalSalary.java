package assignment;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		String str = sc.next();
		char grade = str.charAt(0);

		if (basic >= 0 && basic <= 7500000) {
			double hra = 0.2 * basic;
			double da = 0.5 * basic;
			double pf = 0.11 * basic;

			double totalSalary;
			int allow;

			if (grade == 'A') {
				allow = 1700;
				totalSalary = basic + hra + da + allow - pf;
				System.out.println(Math.round(totalSalary));
			} else if (grade == 'B') {
				allow = 1500;
				totalSalary = basic + hra + da + allow - pf;
				System.out.println(Math.round(totalSalary));
			} else {
				allow = 1300;
				totalSalary = basic + hra + da + allow - pf;
				System.out.println(Math.round(totalSalary));
			}
		}
	}

}
