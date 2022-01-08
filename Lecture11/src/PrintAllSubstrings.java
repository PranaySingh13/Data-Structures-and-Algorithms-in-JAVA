import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAllSubstrings {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void printSubstrings(String str) {

		int c = 0;
		while (c <= str.length()) {

			for (int i = c; i <= str.length(); i++) {

				System.out.print(str.substring(c, i) + " ");
			}

			c++;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		PrintAllSubstrings.printSubstrings(str);

	}

}
