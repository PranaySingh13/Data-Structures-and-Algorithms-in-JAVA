
public class SubstringFunctionsInString {

	public static void main(String[] args) {
		/*
		 * 1. String substring(int beginIndex) returns substring for given begin index
		 */
		String str = "Pranay Singh";
		System.out.println(str.substring(7));

		/*
		 * 2. String substring(int beginIndex, int endIndex) Returns a string that is a
		 * substring of this string. The substring begins with the character at the
		 * specified index and extends to the end of this string.
		 */
		System.out.println(str.substring(0, 6));

	}

}
