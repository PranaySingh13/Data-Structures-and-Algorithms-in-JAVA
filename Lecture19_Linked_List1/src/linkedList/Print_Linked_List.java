package linkedList;

public class Print_Linked_List {

	public static void printList(Node<Integer> headNode) {
		Node<Integer> temp = headNode;// Start from the head of the list

		while (temp != null) {// Till we reach the last node
			System.out.print(temp.data + " ");
			temp = temp.next;// Update temp to point to the next Node
		}
	}

	public static void increment(Node<Integer> headNode) {
		Node<Integer> temp = headNode;

		while (temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(10);// head node
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);
		node1.next = node2;
		node2.next = node3;
		printList(node1);// 10 20 30

		System.out.println();

		Node<Integer> node4 = new Node<>(40);
		Node<Integer> node5 = new Node<>(50);
		Node<Integer> node6 = new Node<>(60);
		Node<Integer> node7 = new Node<>(70);
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;

		// considering node5 as headnode
		increment(node5);

		printList(node5);// 51 61 71
	}

}
