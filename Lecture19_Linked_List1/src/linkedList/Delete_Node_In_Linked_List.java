package linkedList;

import java.util.Scanner;

public class Delete_Node_In_Linked_List {

	// Case 1 Delete Node at Starting
	public static Node<Integer> deleteAtStart(Node<Integer> head) {

		// If List is Empty
		if (head == null)
			return head;

		Node<Integer> temp = head;
		head = head.next;// moving the head pointer to next node
		temp.next = null;// disposing the first head node from linked list

		return head;// as it will hold first node of linked list
	}

	// Case 2 Delete Node at Ending
	public static Node<Integer> deleteAtEnding(Node<Integer> head) {

		// If the first node is null or there is only one node, then they return null.
		if (head == null || head.next == null)
			return null;

		// Find the second last node
		Node<Integer> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		// Change next of second last
		temp.next = null;
		return head;
	}

	public static int length(Node<Integer> head) {

		int count = 0;
		while (head.next != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	// Case 3 Delete Intermidiate Node in List
	public static Node<Integer> deleteNode(Node<Integer> head, int position) {
		// If linked list is empty
		if (head == null)
			return head;

		// If head needs to be removed
		if (position == 0) {
			return deleteAtStart(head);
		}

		// If position is more than number of nodes

		int length = length(head); // This step for storing length in variable reduces time complexity.
		if (position > length)
			return head;

		int i = 0;
		Node<Integer> temp = head;
		// Find previous node of the node to be deleted
		while (i < position - 1 && temp != null) {
			temp = temp.next;
			i++;
		}

		/*
		 * In Linked List make the new links before you break the previous node link
		 * because if you break first you will not be able to point to next node.
		 */
		Node<Integer> newNode = temp.next.next;// where temp.next should not be null otherwise it will arise
		// NullPointerException
		temp.next = newNode;

		return head;
	}

	public static void printList(Node<Integer> headNode) {
		Node<Integer> temp = headNode;// Start from the head of the list

		while (temp != null) {// Till we reach the last node
			System.out.print(temp.data + " ");
			temp = temp.next;// Update temp to point to the next Node
		}
		System.out.println();
	}

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

	public static void main(String[] args) {
		Node<Integer> head1 = takeInput();
		Node<Integer> resultNodeHead1 = deleteAtStart(head1);
		printList(resultNodeHead1);

		Node<Integer> head2 = takeInput();
		Node<Integer> resultNodeHead2 = deleteAtEnding(head2);
		printList(resultNodeHead2);

		Node<Integer> head3 = takeInput();
		Node<Integer> resultNodeHead3 = deleteNode(head3, 2);
		printList(resultNodeHead3);
	}

}
