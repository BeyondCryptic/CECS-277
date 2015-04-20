import java.util.Scanner;

public class Generics {
	public static void main(String[] args) {
		Integer[] searchThis = { 1, 2, 3, 4, 5 };
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
		StudentGrade students = new StudentGrade();
	}
}
