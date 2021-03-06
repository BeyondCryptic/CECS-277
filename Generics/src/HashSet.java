import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
   This class implements a hash set using separate chaining.
 * @param <T>
 */
public class HashSet<T> {
	private ArrayList<Node> buckets;
	private int currentSize;

	/**
      Constructs a hash table.
      @param bucketsLength the length of the buckets array
	 */
	public HashSet(int bucketsLength) {
		buckets = new ArrayList<Node>();
		for (int i = 0; i < bucketsLength; i++) {
			buckets.add(i, null);
		}
		currentSize = 0;
	}

	/**
      Tests for set membership.
      @param x an object
      @return true if x is an element of this set
	 */
	public boolean contains(T x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.size();

		Node current = buckets.get(h);
		while (current != null) {
			if (current.data.equals(x)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
      Adds an element to this set.
      @param x an object
      @return true if x is a new object, false if x was
      already in the set
	 */
	public boolean add(T x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.size();

		Node current = buckets.get(h);
		while (current != null) {
			if (current.data.equals(x)) {
				return false;
			}
			// Already in the set
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = buckets.get(h);
		buckets.set(h, newNode);
		currentSize++;
		return true;
	}

	/**
      Removes an object from this set.
      @param x an object
      @return true if x was removed from this set, false
      if x was not an element of this set
	 */
	public boolean remove(T x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.size();

		Node current = buckets.get(h);
		Node previous = null;
		while (current != null) {
			if (current.data.equals(x)) {
				if (previous == null) {
					buckets.set(h, current.next);
				}
				else {
					previous.next = current.next;
				}
				currentSize--;
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

	/**
      Returns an iterator that traverses the elements of this set.
      @return a hash set iterator
	 */
	public Iterator iterator() {
		return new HashSetIterator();
	}

	/**
      Gets the number of elements in this set.
      @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	class Node {
		public T data;
		public Node next;
	}

	class HashSetIterator implements Iterator {
		private int bucketIndex;
		private Node current;

		/**
         Constructs a hash set iterator that points to the
         first element of the hash set.
		 */
		public HashSetIterator() {
			current = null;
			bucketIndex = -1;
		}

		public boolean hasNext() {
			if (current != null && current.next != null) {
				return true;
			}
			for (int b = bucketIndex + 1; b < buckets.size(); b++) {
				if (buckets.get(b) != null) {
					return true;
				}
			}
			return false;
		}

		public Object next() {
			if (current != null && current.next != null) {            
				current = current.next; // Move to next element in bucket
			}
			else { // Move to next bucket
				do {
					bucketIndex++;
					if (bucketIndex == buckets.size()) {
						throw new NoSuchElementException();
					}
					current = buckets.get(bucketIndex);
				}
				while (current == null);            
			}
			return current.data;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}