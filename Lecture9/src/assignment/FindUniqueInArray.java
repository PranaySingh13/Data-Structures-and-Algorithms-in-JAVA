package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
 * */
public class FindUniqueInArray {
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

	public static int findUnique(int[] arr) {

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

			if (flag == false) {
				value = arr[i];
			}
		}

		return value;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int input[] = takeInputArray();
			System.out.println(FindUniqueInArray.findUnique(input));
			t -= 1;
		}

	}

}
