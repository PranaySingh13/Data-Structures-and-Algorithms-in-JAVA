package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2*/

/*(The Reversal Algorithm) 
 rotate(arr[], d, n)
 Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is : 
 
 Reverse A to get ArB, where Ar is reverse of A.
  reverse(arr[], 0, d-1) ;
  
  Reverse B to get ArBr, where Br is reverse of B.
  reverse(arr[], d, n-1);
  
  Reverse all to get (ArBr) r = BA.
  reverse(arr[], 0, n-1);
  
  Time Complexity : O(n)

Auxiliary Space: O(1)
  */
class Solution {
	public static void rotate(int[] arr, int d) {

		// base case
		if (d == 0) {
			return;
		}

		int n = arr.length;

		// in case the rotating factor is
		// greater than array length
		d = d % n;

		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void reverse(int arr[], int startIndex, int endIndex) {

		int temp;
		while (startIndex < endIndex) {
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
}

public class Rotate_Array {

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
			int d = Integer.parseInt(br.readLine().trim());
			Solution.rotate(input, d);
			printArray(input);

			t -= 1;
		}
	}

}
