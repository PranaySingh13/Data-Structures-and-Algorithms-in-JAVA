package assignments;

import java.util.Scanner;

/*
 Write a program to print triangle of user defined integers sum.
 
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 * */
public class SumPattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int currRow = 1;

		while (currRow <= n) {
			sum += currRow;
			int currCol = 1;
			while (currCol <= currRow) {
				System.out.print(currCol);
				if (currCol == currRow) {
					System.out.print("=");
				} else {
					System.out.print("+");
				}
				currCol += 1;
			}
			System.out.println(sum);
			currRow += 1;
		}

	}

}
