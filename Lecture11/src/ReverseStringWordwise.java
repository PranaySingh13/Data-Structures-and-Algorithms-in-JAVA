import java.util.Scanner;

/*
Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
Ninjas Coding to Welcome
*/
public class ReverseStringWordwise {

	public static String reverseWordWise(String input) {
		// Write your code here
		// Specifying the pattern to be searched
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			if (input.charAt(i) == ' ') {
				output = output + input.substring(i + 1, end) + " ";
				end = i;
			}
			i--;
		}
		// For the first Word in the String
		output += input.substring(i + 1, end);
		return output;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReverseStringWordwise.reverseWordWise(input));

	}

}
