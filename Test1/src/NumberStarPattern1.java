import java.util.Scanner;

public class NumberStarPattern1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= 1; j--) {
				if(i==j) {
					System.out.print("*");
					continue;
				}
				System.out.print(j);
			}

			System.out.println();
		}

	}

}