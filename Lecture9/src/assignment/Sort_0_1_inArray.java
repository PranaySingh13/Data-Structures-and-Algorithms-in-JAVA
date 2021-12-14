package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1  
 * */
public class Sort_0_1_inArray {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
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

	public static void sortZeroesAndOne(int[] arr) {
		int sum = 0;
		
		//Taking Sum of 1's in array.
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		//setting 0's for less than array length-sum of 1s
		for (int i = 0; i < (arr.length - sum); i++) {
			arr[i] = 0;
		}
	
		//setting 1's for remaining array length
		for (int i = (arr.length - sum); i < arr.length; i++) {
			arr[i] = 1;
		}

	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}



	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			Sort_0_1_inArray.sortZeroesAndOne(input);
			printArray(input);

			t -= 1;
		}
	}

}
