package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Sample Input 2:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
Sample Output 2 :
3 9 12 6 32 4 11 5 19 
2 1 4 3 
 * */
public class SwapAlternateInArray {
	/*
	 * The object of class BufferedReader is made static because it is being used by
	 * multiple functions.
	 */

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInputArray() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void swapAlternate(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {

			// we have to store previous value in new variable before its get updated.
			int a = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = a;
			i++;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int input[] = takeInputArray();
			SwapAlternateInArray.swapAlternate(input);
			printArray(input);
			t -= 1;
		}
	}

}
