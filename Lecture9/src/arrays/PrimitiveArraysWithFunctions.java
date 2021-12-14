package arrays;

public class PrimitiveArraysWithFunctions {

	public static void print(int input[]) {
		int sizeOfArray = input.length;

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println();
	}

	public static void incrementArray1(int input[]) {
		for (int i = 0; i < input.length; i++) {
			input[i]++;
		}
	}

	public static void incrementArray2(int input[]) {
		input = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			input[i]++;
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7, 8 };

		incrementArray1(arr1);
		print(arr1);// Changes are reflecting because of same memory address allocated of arr array
					// to the input array.
		incrementArray2(arr2);
		print(arr2);// Changes are not reflecting because of new memory address allocated to the
					// input array as new array is created.
		
		int arr[]=new int[5];
		arr=new int[6];
	}

}
