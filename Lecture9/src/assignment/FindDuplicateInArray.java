package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Sample Input 2: 
2 
5 
0 2 1 3 1

7
0 3 1 5 4 3 2
Sample Output 2: 
1 
3
 **/

public class FindDuplicateInArray {

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

	public static int duplicateNumber(int arr[]) {
		int value = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			// for every i iteration it is set to false
			flag = false;

			for (int j = 0; j < arr.length; j++) {

				// skip at same index match
				if (i == j) {
					continue;
				}

				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag == true) {
				value = arr[i];
			}
		}

		return value;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int input[] = takeInputArray();
			System.out.println(FindDuplicateInArray.duplicateNumber(input));
			t -= 1;
		}

	}

}
