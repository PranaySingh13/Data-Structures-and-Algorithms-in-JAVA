import java.util.Scanner;

public class ReverseString {

	public static char[] reverseString(String str) {

		char[] ch = new char[str.length()];

		for (int i = ch.length - 1, j = 0; i >= 0; i--) {

			while (j < ch.length) {

				ch[j] = str.charAt(i);
				j++;
				break;
			}
		}

		return ch;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseString(str));
	}
}
