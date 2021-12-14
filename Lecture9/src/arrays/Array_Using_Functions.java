package arrays;

import java.util.Scanner;

public class Array_Using_Functions {

	public static int[] takeInput() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		return input;
	}

	public static void print(int input[]) {
		int sizeOfArray = input.length;

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = takeInput();

		print(arr);
	}

}
