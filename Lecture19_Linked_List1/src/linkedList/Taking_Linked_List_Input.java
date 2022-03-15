package linkedList;

import java.util.Scanner;

public class Taking_Linked_List_Input {

	/* Time Complexity is O(n) */
	@SuppressWarnings("resource")
	public static Node<Integer> takeInput() {

		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while (data != -1) {
			// Creating New Node with the given data
			Node<Integer> newNode = new Node<>(data);

			// If the linked list is empty, then make the new Node as head and tail
			if (head == null) {
				head = newNode;
				tail = newNode;
			}

			// travel till the last(tail) node and insert the new node there
			else {
				tail.next = newNode;// Inserting new node at last(tail) node
				tail = newNode;// Now the new node will be the new tail
			}
			data = sc.nextInt();// Taking new data
		}

		return head;// returning the linked list from head
	}

	public static void printLinkedList(Node<Integer> head) {

		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLinkedList(head);

	}

}
