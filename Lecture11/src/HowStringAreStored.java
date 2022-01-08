
public class HowStringAreStored {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

		/*
		 * String Pool Optimization As abc is stored in String Pool in Heap memory.
		 * JavaRun time return same address to str2 as of str1 because abc is already
		 * exist in String Pool.
		 */
		System.out.println(str1 == str2);// true as they have same address

		/*
		 * str3 will create a new string other than string pool in the heap memory with
		 * the different address
		 */
		System.out.println(str1 == str3);// false as they have different address

		/*
		 * equals() method compares content rather than the address
		 */
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

	}

}
