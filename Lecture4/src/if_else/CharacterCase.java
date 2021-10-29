package if_else;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = str.charAt(0);

		if (c >= 65 && c <= 91) {
			System.out.println(1);
		} else if (c >= 97 && c <= 122) {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}

	}

}
