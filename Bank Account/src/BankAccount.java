import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
	A bank account has a balance that can be changed by deposits and withdrawals.
*/
public class BankAccount {
	private double balance;
	public int accountNumber;

	/**
	Constructs a bank account with a zero balance.
	*/
	public BankAccount() {
		balance = 0.0;
		accountNumber = 0;
	}
	
	/**
	Constructs a bank account with a given account number and a initial balance.

	*/
	public BankAccount(double balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	/**
	Reads an account number and balance.
	@param in the scanner
	@return true if the data was read
	false if the end of the stream was reached
	 * @throws IOException 
	*/
	public void read(Scanner in) throws IOException {
		try {
			String accountNumber = "";
			String balance = "";
			String line = in.nextLine();
			String[] temp = line.split(" ");
			try {
				accountNumber = temp[0];
				balance = temp[1];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				throw new IOException();
			}
			char[] testAccountNumber = accountNumber.toCharArray();
			for (char c : testAccountNumber) {
				if (!Character.isDigit(c)) {
					throw new IOException();
				}
			}
			char[] testBalance = balance.toCharArray();
			for (char c : testBalance) {
				if (!Character.isDigit(c) && c != '.') {
					throw new IOException();
				}
			}
			this.balance = Double.parseDouble(balance);
			this.accountNumber = Integer.parseInt(accountNumber);
		}
		catch (IOException e) {
			throw new IOException();
		}

	}	
	//Note: You need to check for incompatible input.
	
	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	
	private void depositMoney(double money) {
		balance+=money;
	}
	
	/**
	Withdraws money from the bank account.
	@param amount the amount to withdraw
	*/
	
	private void withdrawMoney(double money) {
		balance-=money;
	}
	
	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	
	public double checkBalance() {
		return balance;
	}
	
	/**
	Gets the account number of the bank account.
	@return the account number
	*/
	
	private int getAccountNumber() {
		return accountNumber;
	}

}
