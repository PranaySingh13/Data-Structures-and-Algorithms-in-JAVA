package recursion;

import java.util.Scanner;

class Solution3 {

	public static boolean checkNumber(int input[], int x) {

		//base case 1
		if (input.length <= 1) {
			return false;
		}
		
		//base case 2
		if(input[input.length-1]==x) {
			return true;
		}

		//small Calculation
		int smallInput[] = new int[input.length - 1];
		for (int i = 0; i < smallInput.length; i++) {
			smallInput[i] = input[i];
		}

		//Recursive Call
		boolean result = checkNumber(smallInput, x);
		return result;
	}

}

public class Check_Number_In_Array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Solution3.checkNumber(input, x));

	}

}
