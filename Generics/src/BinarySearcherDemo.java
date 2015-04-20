import java.util.Arrays;
import java.util.Scanner;

public class BinarySearcherDemo {
	public static void main(String[] args) {
		Integer[] searchThis = { 3, 1, 2, 5, 4 };
		Arrays.sort(searchThis);
		for (int i : searchThis) {
			if(i != searchThis[searchThis.length-1]) {
				System.out.print(i + ", ");
			}
			else {
				System.out.println(i);
			}
		}
		BinarySearcher searchObject = new BinarySearcher(searchThis);
		System.out.println("What number would you like to search for?");
		Scanner scan = new Scanner(System.in);
		int userNumber = scan.nextInt();
		System.out.println("Index of " + userNumber + " is: " + searchObject.search(userNumber));
	}
}
