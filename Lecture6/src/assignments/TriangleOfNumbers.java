package assignments;

import java.util.Scanner;

/*Print This Pattern
    1
   232
  34543
 4567654
567898765
*/
public class TriangleOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, num = 1, gap;

		gap = n - 1;

		for (j = 1; j <= n; j++) {
			num = j;

			for (i = 1; i <= gap; i++)
				System.out.print(" ");

			gap--;

			for (i = 1; i <= j; i++) {
				System.out.print(num);
				num++;
			}
			num--;
			num--;
			for (i = 1; i < j; i++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}

}
