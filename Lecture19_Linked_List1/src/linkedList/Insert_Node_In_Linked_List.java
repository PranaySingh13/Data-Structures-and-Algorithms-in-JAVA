package linkedList;

public class Insert_Node_In_Linked_List {

	// Case 1 Inserting Node at Starting
	public static Node<Integer> insertAtStart(Node<Integer> head, int data) {
		Node<Integer> newNode = new Node<>(data); // Create a new node
		newNode.next = head; // Set next node of new node to current head
		head = newNode; // Update the head pointer to the new node
		return head;
	}

	// Case 2 Inserting Node at Ending
	public static Node<Integer> insertAtEnd(Node<Integer> head, int data) {

		Node<Integer> newNode = new Node<>(data);

		// If linked list is empty
		if (head == null) {
			head = newNode;//update newNode as head
			return head;
		}
		Node<Integer> temp = head;

		// If Not Empty, Traverse till the last Node
		while (temp.next != null) {
			temp = temp.next;
		}

		// Now we reached the last node as loop ends so it will have temp.next=null;

		temp.next = newNode;// Set next as newNode
		return head;
	}

	// Case 3 Inserting Node at Random Position in Linked List
	public static Node<Integer> insertAtPosition(Node<Integer> head, int position, int data) {

		// Creating a new Node
		Node<Integer> newNode = new Node<>(data);

		// Insert at beginning
		if (position == 0) {
			insertAtStart(head, data);
		}

		int i = 0;
		Node<Integer> temp = head;

		while (i < position - 1) {
			temp = temp.next;
			i++;
		}

		/*
		 * In Linked List make the new links before you break the previous node link
		 * because if you break first you will not be able to point to next node.
		 */
		newNode.next = temp.next;
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

	public static void main(String[] args) {

		Node<Integer> head1 = new Node<>(10);
		Node<Integer> resultNodeHead1 = insertAtStart(head1, 20);

		printList(resultNodeHead1);// 20 10

		Node<Integer> resultNodeHead2 = insertAtEnd(head1, 20);
		printList(resultNodeHead2);// 10 20

		Node<Integer> head2 = new Node<>(1);
		Node<Integer> second = new Node<>(2);
		Node<Integer> third = new Node<>(3);
		Node<Integer> fourth = new Node<>(4);
		head2.next = second;
		second.next = third;
		third.next = fourth;

		Node<Integer> resultNodeHead3 = insertAtPosition(head2, 2, 9);
		printList(resultNodeHead3);// 1 2 9 3 4

	}

}
