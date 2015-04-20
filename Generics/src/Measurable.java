import java.util.ArrayList;

public class Measurable<T> {
	
	public Measurable() {
		
	}
	
	public T largest(ArrayList<T> list) {
		T largest = list.get(0);
		for (T item : list) {
			if (item.toString().compareTo(largest.toString()) > 0) {
				largest = item;
			}
		}
		return largest;
	}
}
