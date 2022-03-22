package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
 */

public class Append_Last_N_To_First {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static LinkedListNode<Integer> takeInput() throws IOException {
		LinkedListNode<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
		}

		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			LinkedListNode<Integer> head = takeInput();

			int n = Integer.parseInt(br.readLine().trim());
			head = Solution2.appendLastNToFirst(head, n);
			print(head);

			t -= 1;
		}

	}

}

class Solution2 {
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {

		// If List is empty or n==0
		if (head == null || n == 0) {
			return head;
		}

		// Calculating Length of Linked List
		int count = 0;
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}

		// Find the first node of the last N nodes in the list, this node will be the
		// new head node.
		int length = count;
		int i = 0;
		LinkedListNode<Integer> temp1 = head;
		while (i < length - n) {
			temp1 = temp1.next;
			i++;
		}

		// Getting Remaining Nodes
		LinkedListNode<Integer> temp2 = head;

		// Take address of temp2 in temp4 list because temp2 will lost its head node as
		// temp2 list will traverse.
		LinkedListNode<Integer> temp4 = temp2;
		i = 0;
		while (i < length - n - 1) {
			temp2 = temp2.next;
			i++;
		}

		// make the next pointer of the previous node as NULL
		temp2.next = null;

		// Setting Last Node of N nodes list to the head of remaining nodes list

		// Take address of temp1 in temp3 list because temp1 will lost its head node as
		// temp1 list will traverse.
		LinkedListNode<Integer> temp3 = temp1;
		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = temp4;

		return temp3;

	}

	public static LinkedListNode<Integer> appendLastNToFirstAlternativeMethod(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp = head;
		int count = 0;

		if (head == null) {
			return head;
		}

		if (n == 0) {
			return head;
		}
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		int newcount = count - n;
		count = 0;
		LinkedListNode<Integer> temp1 = head;
		while (count < newcount - 1) {
			temp1 = temp1.next;
			count++;
		}
		LinkedListNode<Integer> temp2 = temp1.next;
		LinkedListNode<Integer> temp3 = temp1.next;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = head;
		temp1.next = null;
		return temp3;

	}
}
