package DSA.Array;

public class MyArrayList {
	private int capacity = 5;
	private int[] arr;
	private int size;

	public MyArrayList() {
		arr = new int[capacity];
	}

	/**
	 * 1. Check array is full.(size==capacity) 
	 * true: do the following  
	 * a. Create a temp array by doubling the capacity. 
	 * b. Copy all the elements from actual array to temp array. 
	 * c. assign temp array reference to actual array reference.
	 *  d.add the current element to actual array and increase the size by 1.
	 * 
	 * false: do the following 
	 * a. add the element to the actual array. 
	 * b. increase the size  by 1.
	 * 
	 */
	public void add(int data) {
		if (isFull()) {
			resize();

		}

		arr[size] = data;
		size++;

	}

	public void add(int index, int data) {
		if (isWithInRange(index)) {
			// Bucket is full?
			if (isFull()) {
				resize();
			}

			for (int i = size; i >= index; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = data;
			size++;
		}

	}

	private boolean isFull() {
		return size == arr.length;
	}

	private void resize() {
		if (size == arr.length) {
			capacity = capacity * 2;
			int[] temp = new int[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = arr[i];
			}
			arr = temp;

		}
	}

	/**
	 * It is checking
	 * 
	 * @param index
	 * @return
	 */
	private boolean isWithInRange(int index) {
		return index >= 0 && index < size;
	}

	/**
	 * Assume given index is within the range.
	 * 
	 * 1. Do the shifting from right to left. 2. decrease the size by 1
	 * 
	 */
	public void deleteByIndex(int index) {
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;

	}

	public void deleteByElement(int data) {
		int index = searchHelper(data);
		if (index != -1) {
			deleteByIndex(index);
		}

	}

	private int searchHelper(int data) {
		for (int i = 0; i < size; i++) {
			if (data == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public boolean search(int data) {
		int index = searchHelper(data);
//		if(index!=-1) {
//			return true;
//		}
//		return false;
		return index != -1;
	}

	public void printData() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int size() {
		return size;
	}

	public int get(int index) {
		if (!(size > 0)) {
			System.out.println("You fool you! Bucket is empty");
			return -1;
		}
		return arr[index];
	}
}
