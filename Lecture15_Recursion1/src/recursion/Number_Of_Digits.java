package recursion;

import java.util.Scanner;

/*Sample Input 1 :
 156
Sample Output 1 :
3*/
public class Number_Of_Digits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution1.count(n));
	}

}

class Solution1 {

	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}
}