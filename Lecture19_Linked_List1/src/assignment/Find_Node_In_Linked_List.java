package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Sample Input 1 :
2
3 4 5 2 6 1 9 -1
5
10 20 30 40 50 60 70 -1
6
Sample Output 1 :
2
-1*/

public class Find_Node_In_Linked_List {

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

			System.out.println(Solution1.findNode(head, n));

			t -= 1;
		}

	}

}

class Solution1 {

	public static int findNode(LinkedListNode<Integer> head, int n) {

		if (head == null) {
			return -1;
		}

		int index = 0;
		while (head != null) {
			if (head.data == n) {
				return index;
			}
			head = head.next;
			index++;
		}

		return -1;
	}

}
