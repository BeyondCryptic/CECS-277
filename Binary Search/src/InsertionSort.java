
public class InsertionSort<T extends Comparable<T>> {
	public static <T extends Comparable<T>> void InsertionSort(T[] a) {
		for (int unsorted = 1; unsorted < a.length; ++unsorted) {
			T nextItem = a[unsorted];
			int location = unsorted;
			while ((location > 0) && (a[location-1].compareTo(nextItem) > 0)) {
				a[location] = a[location-1];
				location--;
			}
			a[location] = nextItem;
		}
	}
}
