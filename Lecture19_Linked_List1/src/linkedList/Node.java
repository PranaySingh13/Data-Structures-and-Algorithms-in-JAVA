package linkedList;

public class Node<T> {
	T data;
	Node<T> next;

	// Constructor to initialize the node object
	Node(T data) {
		this.data = data;// Data that the node contains
		this.next = null;// Next node that this node points to
	}
}