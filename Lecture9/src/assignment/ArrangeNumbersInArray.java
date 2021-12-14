package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sample Input 1 : 6 Sample Output 1 : 1 3 5 6 4 2
 * 
 * Sample Input 2 : 9 Sample Output 2 : 1 3 5 7 9 8 6 4 2
 */
public class ArrangeNumbersInArray {
	
	/*
	The object of class BufferedReader is made static because it
	is being used by multiple functions.
	*/
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			ArrangeNumbersInArray.arrange(arr, n);
			printArray(arr);

			t -= 1;
		}
	}
	
	public static void arrange(int[] arr, int n) {

		if (n == 0) {
			return;
		}

		if (n % 2 == 0) {
			// odd part
			int count = 1;
			for (int i = 0; i <= (n - 1) / 2; i++) {
				arr[i] = count;
				count = count + 2;
			}
			// even part
			int count2 = n;
			for (int i = (n + 1) / 2; i < n; i++) {
				arr[i] = count2;
				count2 = count2 - 2;
			}
		} else {
			// odd part
			int count = 1;
			for (int i = 0; i <= (n - 1) / 2; i++) {
				arr[i] = count;
				count = count + 2;
			}
			// even part
			int count2 = n - 1;
			for (int i = (n + 1) / 2; i < n; i++) {
				arr[i] = count2;
				count2 = count2 - 2;
			}
		}
	}

}
