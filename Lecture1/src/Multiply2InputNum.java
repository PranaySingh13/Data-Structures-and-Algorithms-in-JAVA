import java.util.Scanner;

public class Multiply2InputNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int j = scan.nextInt();

		int k = i * j;
		System.out.println(k);

		// For Long
		long l = scan.nextLong();

		// For Double
		double d = scan.nextDouble();

		// For Float
		float f = scan.nextFloat();

		// For String
		String str1 = scan.nextLine();
		String str2 = scan.next();

		// For Char
		char c = str1.charAt(0);// 0th index

	}

}
