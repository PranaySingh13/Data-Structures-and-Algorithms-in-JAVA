package linkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		/*
		 * add(Object o) : This method appends the specified element to the end of this
		 * list.
		 */
		list1.add(15);
		list1.add(20);
		list1.add(25);

		for (int element : list1) {
			System.out.print(element + " ");// 15 20 25
		}
		System.out.println();

		/*
		 * void add(int index, Object element) : This method inserts the specified
		 * element E at the specified position in this list.It shifts the element
		 * currently at that position (if any) and any subsequent elements to the right
		 * (will add one to their indices).
		 * 
		 * Exception: Throws IndexOutOfBoundsException if the specified index is out of
		 * range (index size()).
		 */

		list1.add(1, 30);
		for (int element : list1) {
			System.out.print(element + " ");// 15 30 20 25
		}
		System.out.println();

		/*
		 * addAll(Collection c) : This method appends all of the elements in the
		 * specified collection to the end of this list, in the order that they are
		 * returned by the specified collection’s Iterator.
		 */

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(35);
		list2.add(40);
		list2.add(45);
		list2.add(50);
		list1.addAll(list2);
		for (int element : list1) {
			System.out.print(element + " ");// 15 30 20 25 35 40 45 50
		}
		System.out.println();

		/*
		 * addAll(int index, Collection c):This method inserts all of the elements in
		 * the specified collection into this list, starting at the specified position.
		 * It shifts the element currently at that position (if any) and any subsequent
		 * elements to the right (increases their indices).
		 */
		list1.addAll(2, list2);
		for (int element : list1) {
			System.out.print(element + " ");// 15 30 35 40 45 50 20 25 35 40 45 50
		}
		System.out.println();

		/*
		 * clear() method of ArrayList in Java is used to remove all the elements from a
		 * list. The list will be empty after this call
		 */
		System.out.println(list2);// [35, 40, 45, 50]
		list2.clear();
		System.out.println(list2);// []

		/*
		 * clone() method does create a completely new object with a different hashCode
		 * value, which means its in a separate memory location.
		 */
		@SuppressWarnings("unchecked")
		ArrayList<Integer> list3 = (ArrayList<Integer>) list1.clone();
		System.out.println(list3);// [15, 30, 35, 40, 45, 50, 20, 25, 35, 40, 45, 50]

		/*
		 * contains() method in Java is used for checking if the specified element
		 * exists in the given list or not.
		 * 
		 * In search operations, we can check if a given element exists in a list or
		 * not.
		 */
		System.out.println(list3.contains(35));// true
		System.out.println(list3.contains(36));// false

		/*
		 * get() method of ArrayList in Java is used to get the element of a specified
		 * index within the list.
		 * 
		 * It throws IndexOutOfBoundsException if the index is out of range
		 * (index=size())
		 */

		int element = list3.get(3);
		System.out.println(element);// 40

		/*
		 * indexOf() method of ArrayList returns the index of the first occurrence of
		 * the specified element in this list, or -1 if this list does not contain the
		 * element.
		 */
		System.out.println(list3.indexOf(35));// 2

		/*
		 * lastIndexOf() method of ArrayList in Java is used to get the index of the
		 * last occurrence of an element in an ArrayList object.
		 */
		System.out.println(list3.lastIndexOf(35));// 8

		/*
		 * isEmpty() method of ArrayList in java is used to check if a list is empty or
		 * not. It returns true if the list contains no elements otherwise it returns
		 * false if the list contains any element.
		 */
		System.out.println(list3.isEmpty());// false

		/*
		 * remove(Object obj) : It accepts object to be removed. It returns true if it
		 * finds and removes the element. It returns false if the element to be removed
		 * is not present.
		 * 
		 * Removes the first occurrence of the specified element from given list, if the
		 * element is present. If the element is not present, the given list is not
		 * changed. After removing, it shifts subsequent elements(if any) to left and
		 * decreases their indexes by 1.
		 */
		list1.remove(2);
		System.out.println(list1);// [15, 30, 40, 45, 50, 20, 25, 35, 40, 45, 50]

		/*
		 * removeAll() method of java.util.ArrayList class is used to remove from this
		 * list all of its elements that are contained in the specified collection.
		 */
		ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
		arrlist1.add(1);
		arrlist1.add(2);
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist1.add(5);

		ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
		arrlist2.add(1);
		arrlist2.add(2);
		arrlist2.add(3);
		arrlist1.removeAll(arrlist2);
		System.out.println(arrlist1);// [4, 5]

		/*
		 * removeIf() method of ArrayList is used to remove all of the elements of this
		 * ArrayList that satisfies a given predicate filter which is passed as a
		 * parameter to the method.
		 */
		arrlist1.removeIf((n) -> (n % 2 == 0));
		for (int elem : arrlist1) {
			System.out.println(elem);// 5
		}

		/*
		 * size() method of java.util.ArrayList class is used to get the number of
		 * elements in this list.
		 */
		System.out.println(list3.size());// 12

		/*
		 * listIterator() method of java.util.ArrayList class is used to return a list
		 * iterator over the elements in this list (in proper sequence). The returned
		 * list iterator is fail-fast.
		 */
		ListIterator<Integer> iterator = list3.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}

		/*
		 * forEach() method of ArrayList used to perform the certain operation for each
		 * element in ArrayList. This method traverses each element of the Iterable of
		 * ArrayList until all elements have been Processed by the method or an
		 * exception is raised.
		 */

		list3.forEach((n) -> System.out.print(n + " "));// 15 30 35 40 45 50 20 25 35 40 45 50

	}

}
