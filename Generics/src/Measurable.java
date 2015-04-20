import java.util.ArrayList;

public class Measurable<T extends Comparable<T>> {
	
	public Measurable() {
		
	}
	
	public T largest(ArrayList<T> list) {
		T largest = list.get(0);
		for (T item : list) {
			if (item.compareTo(largest) > 0) {
				largest = item;
			}
		}
		return largest;
	}
}
