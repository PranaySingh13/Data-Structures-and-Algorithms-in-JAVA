package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0 2
 */
public class PairSum {

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

	public static int pairSum(int arr[], int x) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					count++;
				}
			}

			arr[i]=Integer.MIN_VALUE;
		}
		
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			int x = Integer.parseInt(br.readLine().trim());
			System.out.println(PairSum.pairSum(input, x));

			t -= 1;
		}
	}

}
