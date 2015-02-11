
public class Staff extends Employee implements EmployeeInfo {
	
	private double hourlyRate;
	
	public Staff() {
		hourlyRate = 0.00;
	}
	
	public Staff(String id, String lastName, String firstName, String gender, int month, int day, int year, double rate) {
		setID(id);
		setName(lastName, firstName);
		setGender(gender);
		setBirthdate(month, day, year);
		setRate(rate);
	}
	
	public String toString() {
		return //"Employee ID Number: " + getID() 
				//+ "\nEmployee Name: " + getName() 
				//+ "\nGender: " + getGender() 
				//+ "\nBirthdate: " + getBirthdate() 
				super.toString() 
				+ "\nFull Time" 
				+ "\nMonthly Salary: " + monthlyEarnings();
	}
	
	public void setRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double getRate() {
		return hourlyRate;
	}
	
	public double monthlyEarnings() {
		return getRate() * STAFF_MONTHLY_HOURS_WORKED;
	}
	
}