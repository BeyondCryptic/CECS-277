import java.util.Scanner;


public class SetAndHash {
	public static void main(String[] args) {
		System.out.println("Please select an option: \n1. Lottery\n2. Hashing");
		Scanner scan = new Scanner(System.in);
		int userChoice = scan.nextInt();
		if (userChoice == 1) {
			System.out.println("Lottery game starting...\n");
			Lottery lotto = new Lottery();
		} else if (userChoice == 2) {
			System.out.println("Employee program starting...\n");
			Hashing hash = new Hashing();
		}
	}
}
