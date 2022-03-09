package oops.generics;

public class Generic_Method {

	// Generic Method
	public static <T> void printArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer a[] = new Integer[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		String s[] = new String[10];
		for (int i = 0; i < a.length; i++) {
			s[i] = "Hi";
		}

		printArray(a);
		printArray(s);
	}

}
