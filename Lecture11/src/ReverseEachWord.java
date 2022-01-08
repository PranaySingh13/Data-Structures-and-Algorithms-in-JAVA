import java.util.Scanner;

/*
 *Input:-  abc def ghi
Output:- cba fed ihg
*/
public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				// Reverse Current Word
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for (int j = currentWordStart; j <= currentWordEnd; j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				// Add it final String(ans)
				ans += reversedWord + " ";
				currentWordStart = i + 1;
			}
		}

		// For the last Word in the String
		int currentWordEnd = i - 1;
		String reversedWord = "";
		for (int j = currentWordStart; j <= currentWordEnd; j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		ans += reversedWord;
		return ans;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReverseEachWord.reverseEachWord(input));

	}

}
