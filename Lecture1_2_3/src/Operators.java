import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fah = sc.nextInt();

		int cel1 = (5 * (fah - 32)) / 9;

		int cel2 = (int) ((5.0 / 9) * (fah - 32));

		System.out.println(cel1 + " " + cel2);

		// Arithmetic Operator
		System.out.println(9 + 5);
		System.out.println(9 - 5);
		System.out.println(9 * 5);
		System.out.println(9 / 5);
		System.out.println(9 % 5);

		// Relational Operator
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("A is greater than B");
		}

		if (a < b) {
			System.out.println("A is less than B");
		}

		if (a == b) {
			System.out.println("A is equal to B");
		}

		if (a >= b) {
			System.out.println("A is greater than equal to B");
		}

		if (a <= b) {
			System.out.println("A is less than equal to B");
		}

		if (a != b) {
			System.out.println("A is not equal to B");
		}

		// Logical Operator
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		if (p > q && p > r) {
			System.out.println(p + " is largest");
		}
		if (p < q || p == r) {
			System.out.println(p + " is smallest or either equal to " + r);
		}
		if (p != q) {
			System.out.println(p + " is not equal to " + q);
		}
	}

}
