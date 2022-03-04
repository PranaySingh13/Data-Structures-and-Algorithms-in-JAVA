package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
*/
public class Find_Unique_Element_In_Array {
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

	public static int findUnique1(int[] arr) {
		// Approach 1 Native Loop Approach

		Arrays.sort(arr);
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] != arr[i + 1]) {
				return arr[i];
			}
			i = i + 2;
		}

		return arr[arr.length - 1];

		/*
		 * Here, Time complexity of Arrays.sort() method is O(n logn) in worst case
		 * scenario.
		 * 
		 * Once array is sorted, traversing an array takes n/2 iterations. So total time
		 * complexity of above algorithm is O(n logn + n/2) i.e O(n logn)
		 */
	}

	public static int findUnique2(int[] arr) {
		// Approach 2 HashMap Approach

		/*
		 * The simplest way to get unique elements from the array is by putting all
		 * elements of the array into hashmap's key and then print the keySet(). The
		 * hashmap contains only unique keys, so it will automatically remove that
		 * duplicate element from the hashmap keySet.
		 */
		HashMap<Integer, Integer> map = new HashMap<>(arr.length);

		for (int num : arr) {
			Integer occurrence = map.get(num);

			// if occurrence is null, set it to 1,
			// else increment the occurrence
			map.put(num, occurrence == null ? 1 : occurrence + 1);
		}

		// traversing entryset to find the key with occurrence == 1
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				return e.getKey();
			}
		}

		return -1;
		/*
		 * In best and average case, Time Complexity of HashMap insertion operation is
		 * O(1) and in worst case it is O(n).
		 * 
		 * Once all the elements are inserted into HashMap, we need to traverse through
		 * (Capacity of HashMap + size of HashMap) elements of HashMap i.e O(capacity +
		 * n)
		 * 
		 * So total time complexity of above algorithm is O(n)
		 * 
		 * Space Complexity
		 * 
		 * In this approach, we are using an additional datastructure i.e. HashMap of
		 * size n. So space complexity of above program is O(n)
		 */
	}

	public static int findUnique3(int[] arr) {
		// Approach 3 XOR Approach

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];// XORing
		}

		/*
		 * After Traversing entire array whatever value will be there inside result
		 * variable is our unique element in the array.
		 */
		return (result > 0 ? result : -1);

		/*
		 * Time Complexity
		 * 
		 * O(n)
		 * 
		 * Space Complexity
		 * 
		 * No extra space is required.
		 * 
		 */
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int input[] = takeInputArray();
			System.out.println(Find_Unique_Element_In_Array.findUnique1(input));
			System.out.println(Find_Unique_Element_In_Array.findUnique2(input));
			System.out.println(Find_Unique_Element_In_Array.findUnique3(input));
			t -= 1;
		}

	}
}
