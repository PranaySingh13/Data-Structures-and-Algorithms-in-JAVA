package recursion;

import java.util.Scanner;

/*Sample Input 1 :
 3 4
Sample Output 1 :
81*/
public class Calculate_Power {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(Solution.power(x, n));
	}

}

class Solution {

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		return x * power(x, n - 1);
	}

}
