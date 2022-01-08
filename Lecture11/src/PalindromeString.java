import java.util.Scanner;

/*
Sample Input 1 :
abcdcba
Sample Output 1 :
true
*/
public class PalindromeString {

	public static boolean isPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++) {

			if (str.charAt(i) == str.charAt(j)) {
				j--;
			} else {
				return false;
			}

			if (i == j)
				break;

		}

		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
	}

}