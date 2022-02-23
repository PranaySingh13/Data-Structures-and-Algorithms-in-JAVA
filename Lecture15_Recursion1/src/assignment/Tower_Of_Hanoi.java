package assignment;

import java.util.Scanner;

/*
Tower of Hanoi
 
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. 
The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). 
The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.

Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.

Sample Input 2 :
3
Sample Output 2 :
a c
a b
c b
a c
b a
b c
a c
 */
class Solution5 {
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// base case
		if (disks == 0) {
			return;
		}

		// Recursion Call 1
		towerOfHanoi(disks - 1, source, destination, auxiliary);

		System.out.println(source + " " + destination);

		// Recursion Call 2
		towerOfHanoi(disks - 1, auxiliary, source, destination);
	}
}

public class Tower_Of_Hanoi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Solution5.towerOfHanoi(n, 'a', 'b', 'c');

	}

}
