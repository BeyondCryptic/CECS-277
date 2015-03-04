
public class BinarySearcher<T extends Comparable<T>> {
	private T[] array;
	
	public BinarySearcher(T[] array) {
		super();
		this.array = array;
	}
	
	public int BinarySearcher(T object) {
		int middle = array.length/2;
		int max = array.length;
		while (max >= middle) {
			if (array[middle].equals(object)) {
				return middle;
			}
			else if (array[middle].compareTo(object) > 1) {
				middle = middle + 1;
			}
			else {
				max = max - 1;
			}
		}
		return -1;
	}
}
