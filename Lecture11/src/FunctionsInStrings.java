
public class FunctionsInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String equals() and equalsIgnoreCase() methods of the String class to compare
		 * the contents of two Strings.
		 */
		String str = "Pranay Singh";
		String str1 = "pranay singh";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		/**
		 * 1. String "Length" Method String class provides an inbuilt method to
		 * determine the length of the Java String.
		 */
		System.out.println("Length: " + str.length());

		/**
		 * 2. String "indexOf" Method String class provides an inbuilt method to get the
		 * index of a character in Java String.
		 */
		System.out.println("Index: " + str.indexOf('S'));

		/*
		 * 3. String "charAt" Method “charAt” method and provide the index whose
		 * character you need to find.
		 */
		System.out.println("Char at Index 4: " + str.charAt(4));

		/*
		 * 4. String "CompareTo" Method This method is used to compare two strings. Use
		 * the method “compareTo” and specify the String that you would like to compare.
		 * Use “compareToIgnoreCase” in case you don’t want the result to be case
		 * sensitive.
		 * 
		 * The result will have the value 0 if the argument string is equal to this
		 * string; a value less than 0 if this string is lexicographically(ASCII Values
		 * Difference) less than the string argument; and a value greater than 0 if this
		 * string is lexicographically(ASCII Values Difference) greater than the string
		 * argument.
		 */

		System.out.println(str.compareTo("Pranay Singh"));// 0
		System.out.println(str.compareToIgnoreCase("pranay singh"));// 0
		System.out.println(str.compareTo("pranay singh"));// -32
		System.out.println(str.compareToIgnoreCase("pranaysingh"));// -83

		/*
		 * 5. String "Contain" Method Use the method “contains” to check if a string
		 * contains another string and specify the characters you need to check. Returns
		 * true if and only if this string contains the specified sequence of char
		 * values.
		 */
		System.out.println(str.contains("ing"));

		/*
		 * 6. String "endsWith" Method This method is used to find whether a string ends
		 * with a particular prefix or not. Returns true if the character sequence
		 * represented by the argument is a suffix of the character sequence represented
		 * by this object. Vice versa for startsWith method
		 */
		System.out.println(str.startsWith("Pra"));
		System.out.println(str.endsWith("ngh"));

		/*
		 * 7. String "replaceAll" & "replaceFirst" Method Java String Replace,
		 * replaceAll and replaceFirst methods. You can specify the part of the String
		 * you want to replace and the replacement String in the arguments.
		 */
		System.out.println(str.replace("Pranay", "Raja"));

		/*
		 * 8. String Java "toLowercase" & Java "toUppercase" Use the “toLowercase()” or
		 * “ToUpperCase()” methods against the Strings that need to be converted.
		 */
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		/*
		 * 9. String boolean isEmpty() checks if string is empty (length is 0).
		 */
		System.out.println(str.isEmpty());

		/*
		 * 10. String boolean isBlank() checks if string is empty or contain only
		 * spaces.
		 */
		String str2 = "  ";
		System.out.println(str2.isBlank());

		/*
		 * 11. String concat(String str) concatenates specified string
		 */
		System.out.println(str.concat(str1));

		/*
		 * 12. String trim() removes beginning and ending spaces of this string.
		 */

		String str4 = "  Pranay Singh  ";
		System.out.println(str4.trim());
	}

}

/*
 * Some Important Key Points about Java Strings 
 * 1. Strings are not NULL
 * terminated in Java: Unlike C and C++, String in Java doesn't terminate with
 * null character. Instead String is an Object in Java and backed by a character
 * array. You can get the character array used to represent String in Java by
 * calling toCharArray() method of java.lang.String class of JDK. 
 * 
 * 2. Internally, String is stored as a character array only. 
 * 
 * 3. String is a Immutable and Final class, that is, once created the value cannot be altered. Thus String
 * objects are called immutable. 
 * 
 * 4. The Java Virtual Machine(JVM) creates a  memory location especially for Strings called String Constant Pool. That’s
 * why String can be initialized without the ‘new’ keyword.
 */
