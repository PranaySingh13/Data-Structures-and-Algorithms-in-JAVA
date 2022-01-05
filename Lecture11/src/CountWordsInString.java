import java.util.Scanner;

/*
Sample Input 2:
this is a sample string

Sample Output 2:
5
*/
public class CountWordsInString {

	public static int countWords(String str) {
		int count = 0;

		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(countWords(str));
	}

}
