package assignment;

import java.util.Scanner;

public class ArraySum {

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
	
	public static int sum(int input[]) {
		int sizeOfArray = input.length;
		int sum=0;
		for (int i = 0; i < sizeOfArray; i++) {
			sum+=input[i];
		}

		return sum;
	}
	
	public static void main(String[] args) {
		
		int arr[]=takeInput();
		int sum=sum(arr);
		System.out.println(sum);

	}

}
