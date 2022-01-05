package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Sample Input 2:
2
5
0 3 0 2 0
5
9 0 0 8 2
Sample Output 2:
3 2 0 0 0
9 8 2 0 0 
 */
public class PushZerosToEnd {

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

	public static void pushZerosAtEnd(int[] arr) {

		// Count of non-zero elements
		int count = 0;

		int n = arr.length;
		
		// Traverse the array. If arr[i] is non-zero, then
		// update the value of arr at index count to arr[i]
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];//count is incremented also

		//Now with above logic all the non-zero element are pushed in front of array.  
		
		// Update all elements at index >=count with value 0
		for (int i = count; i < n; i++)
			arr[i] = 0;
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
			PushZerosToEnd.pushZerosAtEnd(input);
			printArray(input);

			t -= 1;
		}
	}
}
