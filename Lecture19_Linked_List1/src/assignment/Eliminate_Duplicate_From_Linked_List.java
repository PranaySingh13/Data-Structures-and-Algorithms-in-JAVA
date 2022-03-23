package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Sample Input 2 :
2
1 2 3 3 3 3 4 4 4 5 5 7  -1
10 10 10 10 -1

Sample Output 2 :
1 2 3 4 5 7 
10
 */
public class Eliminate_Duplicate_From_Linked_List {

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

			head = Solution3.removeDuplicates(head);
			print(head);

			t -= 1;
		}

	}

}

class Solution3 {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

		if (head == null) {
			return head;
		}

		LinkedListNode<Integer> temp = head;

		/* Traverse the list till last node */
		while (temp.next != null) {
			
			/* Compare head node with next node */
			if (temp.data.equals(temp.next.data)) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}

		return head;
	}

}
