package linkedList;

public class Delete_Node_In_Linked_List {

	// Case 1 Delete Node at Starting
	public static Node<Integer> deleteAtStart(Node<Integer> head) {

		Node<Integer> temp = head;
		temp = temp.next;
		return temp;
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

	// Case 3 Delete Intermidiate Node in List
	public static Node<Integer> delete(Node<Integer> head, int position) {
		// If the first node is null or there is only one node, then they return null.
		if (head == null || head.next == null)
			return null;

		int i = 0;
		Node<Integer> temp = head;
		while (i < position - 1) {
			temp = temp.next;
			i++;
		}

		if (temp.next.next == null) {
			temp = temp.next.next;// where temp.next should not be null otherwise it will arise
			// NullPointerException
		}

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
		Node<Integer> head1 = new Node<>(1);
		Node<Integer> second = new Node<>(2);
		Node<Integer> third = new Node<>(3);
		Node<Integer> fourth = new Node<>(4);
		head1.next = second;
		second.next = third;
		third.next = fourth;

		Node<Integer> resultNodeHead1 = deleteAtStart(head1);
		printList(resultNodeHead1);// 2 3 4

		Node<Integer> resultNodeHead2 = deleteAtEnding(head1);
		printList(resultNodeHead2);// 1 2 3

		Node<Integer> resultNodeHead3 = delete(head1, 2);
		printList(resultNodeHead3);// 1 2 3
	}

}
