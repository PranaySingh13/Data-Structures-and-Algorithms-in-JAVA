package linkedList;

public class Linked_List_Introduction {

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);

		// Creating another node
		Node<Integer> node2 = new Node<>(20);

		// updaing node1 to point to the next node
		node1.next = node2;

		// same address i.e; node 1 has now address for next node2
		System.out.println(node2);// Node@7de26db8
		System.out.println(node1.next);// Node@7de26db8

		System.out.println(node2.next);// as this last node(tail)
	}

}
