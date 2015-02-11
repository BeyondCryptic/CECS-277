
public class PartTime extends Staff {
	
	private int hoursWorkedAWeek;
	private final int WEEKS_IN_A_MONTH;
	
	public PartTime() {
		hoursWorkedAWeek = 0;
		WEEKS_IN_A_MONTH = 4;
	}
	
	public PartTime(String id, String lastName, String firstName, String gender, int month, int day, int year, double rate, int hoursWorkedAWeek) {
		WEEKS_IN_A_MONTH = 4;
		setID(id);
		setName(lastName, firstName);
		setGender(gender);
		setBirthdate(month, day, year);
		setRate(rate);
		setHours(hoursWorkedAWeek);
	}
	
	public String toString() {
		return "Employee ID Number: " + getID() 
				+ "\nEmployee Name: " + getName() 
				+ "\nGender: " + getGender() 
				+ "\nBirthdate: " + getBirthdate() 
				+ "\nHours Worked Per Month: " + getHoursPerMonth() 
				+ "\nMonthly Salary: " + monthlyEarnings();
	}
	
	public void setHours(int hoursWorkedAWeek) {
		this.hoursWorkedAWeek = hoursWorkedAWeek;
	}
	
	public int getHours() {
		return hoursWorkedAWeek;
	}
	
	public int getHoursPerMonth() {
		return getHours() * WEEKS_IN_A_MONTH;
	}
	
	public double monthlyEarnings() {
		return getHours() * getRate() * WEEKS_IN_A_MONTH;
	}
	
}