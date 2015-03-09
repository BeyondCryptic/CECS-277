
public class BinarySearcher<T extends Comparable<T>> {
	private T[] array;
	
	public BinarySearcher(T[] array) {
		super();
		this.array = array;
	}
	
	public int BinarySearcher(T object) {
		int min = 0;
		int max = array.length-1;
		while (max >= min) {
			int middle = (max+min)/2;
			if (array[middle].compareTo(object) == 0) {
				return middle;
			}
			else if (array[middle].compareTo(object) < 0) {
				min = middle + 1;
			}
			else {
				max = middle - 1;
			}
		}
		return -1;
	}
}
