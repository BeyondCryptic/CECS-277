import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
A bank contains account numbers and balances of each customer.
*/
public class Bank {
	private ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();

	/**
	Construct a Bank object.
	*/
	
	/**
	Reads a file with account numbers and balances and adds the accounts
	to the bank.
	@param filename the name of the file
	 * @throws IOException 
	*/
	
	public void readFile(String filename) throws IOException {
		//Create File object, a scanner object to read data from the file.
		//call the method read 
		try {
			File reader = new File(filename);
			Scanner in = new Scanner(reader);
			read(in);
			in.close();
		}
		catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		catch (IOException e) {
			throw new IOException();
		}
		finally {
		}
	}
	
	//Note: call the method read
	
	/**
	Read a file with account numbers and balances and adds the accounts
	to the bank.
	@param in the scanner for reading the input
	 * @throws IOException 
	*/
	private void read(Scanner in) throws IOException {
		while (in.hasNextLine()) {
			//Create a BankAccount object
			BankAccount account = new BankAccount();
			//input data for the BankAccount object
			try {
				account.read(in); // reads data, sets account number and balance
			}
			catch (IOException e) {
				throw new IOException();
			}
			//Add the BankAccount object to the accountlist
			addAccount(account);
		}
	}

	/**
	Add an account to the bank.
	@param b the BankAccount reference
	*/
	
	private void addAccount(BankAccount b) {
		accountList.add(b);
	}
	
	/**
	Gets the account with the highest balance.
	@return the account with the highest balance
	*/
	
	public BankAccount getHighestBalance() {
		double balance = 0.0;
		BankAccount temp = null;
		for (BankAccount c : accountList) {
			if (balance == 0.0) {
				balance = c.checkBalance();
				temp = c;
			}
			if (balance < c.checkBalance()) {
				balance = c.checkBalance();
				temp = c;
			}
		}
		return temp;
	}
}