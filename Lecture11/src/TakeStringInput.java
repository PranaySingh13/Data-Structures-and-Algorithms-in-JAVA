import java.util.Scanner;

public class TakeStringInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * next() will return next token. One token is the sequence of characters until
		 * it finds delimiter like space, tab, enter.
		 */
		String str1 = sc.next();
		System.out.println(str1 + " " + str1.length());

		/*
		 * nextLine() will return entire line until its find delimiter enter.
		 */
		String str2 = sc.nextLine();
		System.out.println(str2 + " " + str2.length());

	}

}
