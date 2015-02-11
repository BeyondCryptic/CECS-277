import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee {
	
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
	
	public String toString() {
		return "Employee ID Number: " + getID() 
				+ "\nEmployee Name: " + getName() 
				+ "\nGender: " + getGender() 
				+ "\nBirthdate: " + getBirthdate();
	}
	
	public void setName(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setID(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getID() {
		return idNumber;
	}
	
	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("M")) {
			this.gender = "Male";
		}
		else if (gender.equalsIgnoreCase("F")) {
			this.gender = "Female";
		}
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setBirthdate(int month, int day, int year) {
		birthdate.set(Calendar.MONTH, month-1);
		birthdate.set(Calendar.DAY_OF_MONTH, day);
		birthdate.set(Calendar.YEAR, year);
	}
	
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
	
	public abstract double monthlyEarnings();
	
}
