package recursion;

import java.util.Scanner;

/*
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
*/
public class Print_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Solutions.print(n);

	}

}

class Solutions {

	public static void print(int n) {

		if (n == 0) {
			return;// The return keyword finished the execution of a method
		}

		print(n - 1);
		System.out.print(n + " ");
	}
}
