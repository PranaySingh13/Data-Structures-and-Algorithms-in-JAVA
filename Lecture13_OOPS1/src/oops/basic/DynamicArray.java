package oops.basic;

public class DynamicArray {

	private int data[];
	private int nextIndex;

	public DynamicArray() {
		data = new int[5];
		nextIndex = 0;
	}

	public int size() {
		return nextIndex;
	}

	public void add(int element) {
		if (nextIndex == data.length) {
			restructure();
		}
		data[nextIndex] = element;
		nextIndex++;
	}

	public void restructure() {
		int temp[] = data;// copy the previous data array in the new temp array
		data = new int[data.length * 2];// creating the new array
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];// copying the elements from the temp array to newly created array
		}
	}

	public void set(int index, int element) {
		if (index > nextIndex) {
			return;
		} else if (index < nextIndex) {
			data[index] = element;
		} else {
			add(element);
		}
	}

	public int get(int index) {
		if (index >= nextIndex) {
			// error out
			return -1;
		}
		return data[index];
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int removeLast() {
		if (size() == 0) {
			// error out
			return -1;
		}
		int value = data[nextIndex - 1];
		data[nextIndex - 1] = 0;
		nextIndex--;
		return value;
	}

}
