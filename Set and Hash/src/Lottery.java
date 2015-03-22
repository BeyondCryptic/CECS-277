import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Lottery {
	
	public Set<Integer> myTicket;
	public Set<Integer> winningNumbers;
	public Set<Integer> matchingNumbers;
	
	public Lottery() {
		myTicket = getTicket();
		System.out.println("Your ticket was: " + myTicket.toString());
		winningNumbers = generateWinningNumbers();
		System.out.println("Winning numbers: " + winningNumbers.toString());
		matchingNumbers = getMatchingNumbers();
		if (matchingNumbers.size() > 0) {
			System.out.println("Matching numbers: " + matchingNumbers.toString());
		}
		else {
			System.out.println("Matching numbers: Sorry, you didn't match any winning numbers!");
		}
		getPrize();
	}
	
	public static Set<Integer> getTicket() {
		TreeSet<Integer> ticket = new TreeSet<Integer>();
		System.out.println("Type 6 lotto numbers: ");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			int input = in.nextInt();
			while (input < 1 || input > 40 || ticket.contains(input)) {
				if (ticket.contains(input)) {
					System.out.println("You already chose that number!");
					input = in.nextInt();
				}
				if (input < 1 || input > 40) {
					System.out.println("Invalid choice. Please enter a number from 1 to 40.");
					input = in.nextInt();
				}
			}
			ticket.add(input);
		}
		in.close();
		return ticket;
	}
	
	public static Set<Integer> generateWinningNumbers() {
		TreeSet<Integer> winning = new TreeSet<Integer>();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int number = r.nextInt(40) + 1;
			while (winning.contains(number)) {
				number = r.nextInt(40) + 1;
			}
			winning.add(number);
		}
		return winning;
	}
	
	public Set<Integer> getMatchingNumbers() {
		TreeSet<Integer> matchingNumbers = new TreeSet<Integer>();
		matchingNumbers.addAll(myTicket);
		matchingNumbers.retainAll(winningNumbers);
		return matchingNumbers;
	}
	
	public void getPrize() {
		int size = matchingNumbers.size();
		if (size == 0) {
			// Do nothing.
		}
		else if (size == 1) {
			System.out.println("Your prize is: $250.00");
		}
		else if (size == 2) {
			System.out.println("Your prize is: $500.00");
		}
		else if (size == 3) {
			System.out.println("Your prize is: $1000.00");
		}
		else if (size == 4) {
			System.out.println("Your prize is: $2000.00");
		}
		else if (size == 5) {
			System.out.println("Your prize is: $4000.00");
		}
		else if (size == 6) {
			System.out.println("Your prize is: $8000.00");
		}
	}
}
