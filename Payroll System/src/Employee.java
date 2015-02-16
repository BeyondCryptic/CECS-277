/**
 * 
 * @author David Van
 * @version 1.0
 * 
 */

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public abstract class Employee implements Cloneable, Comparable<Employee>{
	
	private String lastName;
	private String firstName;
	private String idNumber;
	private String gender;
	private Calendar birthdate;
	
	public Employee() {
		lastName = "";
		firstName = "";
		idNumber = "";
		gender = "";
		birthdate = new GregorianCalendar();
	}
	
	/**
	 * Returns a string representation.
	 * @return Returns a string representation of the Employee object.
	 */
	public String toString() {
		return "Employee ID Number: " + getID() 
				+ "\nEmployee Name: " + getName() 
				+ "\nGender: " + getGender() 
				+ "\nBirthdate: " + getBirthdate();
	}
	
	/**
	 * Compares two employee objects (last name), for ascending order.
	 * @param e Employee object.
	 */
	public int compareTo(Employee e) {
		return this.lastName.compareTo(e.lastName);
	}
	
	/**
	 * Object for comparator to sort ID numbers by descending order.
	 */
	public static Comparator<Employee> idComparatorDSD = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return Integer.parseInt(e2.idNumber)-Integer.parseInt(e1.idNumber);
		}
	};
	
	/**
	 * @return Returns cloned object.
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	/**
	 * Sets the name.
	 * @param lastName Last Name
	 * @param firstName First Name
	 */
	public void setName(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	/**
	 * Gets the name.
	 * @return Returns First and Last Name.
	 */
	public String getName() {
		return firstName + " " + lastName;
	}
	
	/**
	 * Sets the ID Number.
	 * @param idNumber ID Number.
	 */
	public void setID(String idNumber) {
		this.idNumber = idNumber;
	}
	
	/**
	 * Gets the ID Number.
	 * @return Returns the ID Number.
	 */
	public String getID() {
		return idNumber;
	}
	
	/**
	 * Sets the gender.
	 * @param gender Gender.
	 */
	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("M")) {
			this.gender = "Male";
		}
		else if (gender.equalsIgnoreCase("F")) {
			this.gender = "Female";
		}
	}
	
	/**
	 * Gets the gender.
	 * @return Gets the gender.
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the birthdate.
	 * @param month Month.
	 * @param day Day.
	 * @param year Year.
	 */
	public void setBirthdate(int month, int day, int year) {
		birthdate.set(Calendar.MONTH, month-1);
		birthdate.set(Calendar.DAY_OF_MONTH, day);
		birthdate.set(Calendar.YEAR, year);
	}
	
	/**
	 * Gets the birthdate.
	 * @return Birthdate.
	 */
	public String getBirthdate() {
		
		int tempMonth = birthdate.get(Calendar.MONTH);
		
		String month = "";
		
		if (tempMonth == 0) {
			month = "January";
		} else if (tempMonth == 1) {
			month = "February";
		} else if (tempMonth == 2) {
			month = "March";
		} else if (tempMonth == 3) {
			month = "April";
		} else if (tempMonth == 4) {
			month = "May";
		} else if (tempMonth == 5) {
			month = "June";
		} else if (tempMonth == 6) {
			month = "July";
		} else if (tempMonth == 7) {
			month = "August";
		} else if (tempMonth == 8) {
			month = "September";
		} else if (tempMonth == 9) {
			month = "October";
		} else if (tempMonth == 10) {
			month = "November";
		} else if (tempMonth == 11) {
			month = "December";
		}
		
		return month  
		+ " " + birthdate.get(Calendar.DAY_OF_MONTH) 
		+ ", " + birthdate.get(Calendar.YEAR);
	}
	
	/**
	 * Abstract method to get monthly salary.
	 * @return Monthly Salary.
	 */
	public abstract double monthlyEarnings();
	
}