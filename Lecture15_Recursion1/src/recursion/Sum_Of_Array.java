package recursion;

import java.util.Scanner;

/*Sample Input 1 :
3
9 8 9
Sample Output 1 :
26*/
class Solution2 {
	public static int sum(int input[]) {

		// base case
		if (input.length == 1) {
			return input[0];
		}

		int smallInput[] = new int[input.length - 1];
		for (int i = 0; i < smallInput.length; i++) {
			smallInput[i] = input[i];
		}

		// Recursive Call and small Calulation
		return sum(smallInput) + input[smallInput.length];
	}
}

public class Sum_Of_Array {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		System.out.println(Solution2.sum(input));

	}

}
