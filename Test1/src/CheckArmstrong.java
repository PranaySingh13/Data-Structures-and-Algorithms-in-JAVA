import java.util.Scanner;

/*
Check Armstrong

Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

Input Format :
Integer n

Output Format :
true or false

*/
public class CheckArmstrong {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n, count = 0, arm = 0;

		while (temp != 0) {

			temp /= 10;
			count++;

		}

		temp = n;

		while (temp != 0) {
			int t1 = temp % 10;
			int t2 = count;
			int t3 = t1;
			while (t2 != 1) {
				t3 = t3 * t1;
				t2--;

			}
			arm = arm + t3;
			temp /= 10;

		}

		if (arm == n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
