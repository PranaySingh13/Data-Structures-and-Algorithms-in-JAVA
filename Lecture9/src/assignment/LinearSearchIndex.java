package assignment;

import java.util.Scanner;

/**
 * Linear search' is a method for finding an element within an array/list. It
 * sequentially checks each element of the array/list until a match is found or
 * the whole array/list has been searched.
 */
public class LinearSearchIndex {

	public static int[] takeInputArray() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}

		return input;
	}

	public static int takeInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		return x;
	}

	public static int linearSearch(int input[], int x) {
		int sizeOfArray = input.length;
		for (int i = 0; i < sizeOfArray; i++) {
			if (x == input[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = takeInputArray();
		int valueInArray = takeInput();
		int checkedIndex = linearSearch(arr, valueInArray);
		System.out.println(checkedIndex);
	}

}
