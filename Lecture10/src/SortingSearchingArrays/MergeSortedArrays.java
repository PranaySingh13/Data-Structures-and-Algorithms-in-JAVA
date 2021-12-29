package SortingSearchingArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
*/
public class MergeSortedArrays {

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

	public static int[] merge(int arr1[], int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
	
		int[] arr3 = new int[n1 + n2];
		
		int i = 0, j = 0, k = 0;
		
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				
				//a[x++] increments x, not the element at index x.
				arr3[k++] = arr1[i++];
				
				/*
				 * Detailed meaning of above 
				 arr3[k] = arr1[i];
				 k++;
				 i++;
				 */
			
			else
				arr3[k++] = arr2[j++];
		}
		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];
		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
		return arr3;
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

			int[] input1 = takeInput();
			int[] input2 = takeInput();
			int[] ans = MergeSortedArrays.merge(input1, input2);
			printArray(ans);

			t -= 1;
		}
	}

}
