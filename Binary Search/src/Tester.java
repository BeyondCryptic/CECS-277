import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numberInput = 0;
		
		Faculty facultyOne = new Faculty(243, "Johnson", "Anne", "F", "FU", "Ph.D", "Engineering", 3);
		Faculty facultyTwo = new Faculty(791, "Bouris", "William", "F", "AO", "Ph.D", "English", 1);
		Faculty facultyThree = new Faculty(623, "Andrade", "Christopher", "F", "AS", "MS", "Physical Education", 0);
		
		Faculty[] facultyObjects = {facultyOne, facultyTwo, facultyThree};
		
		InsertionSort.InsertionSort(facultyObjects);
		
		BinarySearcher searchOne= new BinarySearcher(facultyObjects);
		
		System.out.println("Sorted by ID Numbers: ");
		for (int i = 0; i < facultyObjects.length; i++) {
			System.out.println(facultyObjects[i].getName() + " - ID: " + facultyObjects[i].getID());
		}
		
		System.out.println("Enter the ID Number you're searching for: ");
		
		numberInput = scan.nextInt();
		
		Faculty searchForThis =  new Faculty(numberInput, "Employee", "Fake", "M", "FU", "Ph.D", "Computer Science", 0);;
		
		// Below doesn't work yet...
		System.out.println("The index of " + numberInput + " is: " + searchOne.BinarySearcher(searchForThis));
		
		// Stuff under here works.
		
		ArrayList<Integer> userNumber = new ArrayList<Integer>();
		
		System.out.println("Next, we will search for user-entered numbers.");
		System.out.println("Please enter your numbers. Enter \"-1\" to stop.");
		
		int input = scan.nextInt();
		
		while(input != -1) {
			userNumber.add(input);
			input = scan.nextInt();
		}
		
		Integer[] numbers = new Integer[userNumber.size()];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = userNumber.get(i);
		}
		
		InsertionSort.InsertionSort(numbers);
		
		BinarySearcher searchTwo = new BinarySearcher(numbers);
		
		System.out.println("Please enter the number you want to search for: ");
		
		input = scan.nextInt();
		
		System.out.println("The index of " + input + " is: " + searchTwo.BinarySearcher(input));
	}
}
