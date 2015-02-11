
public class Faculty extends Employee implements EmployeeInfo {
	
	private String level;
	private Education education;
	private final String AS;
	private final String AO;
	private final String FU;
	
	public Faculty() {
		level = "";
		education = new Education();
		AS = "Assistant Professor";
		AO = "Associate Professor";
		FU = "Full-Time Professor";
	}
	
	public Faculty(String id, String lastName, String firstName, String gender, int month, int day, int year, String level, String degree, String major, int numberOfResearch) {
		this.level = "";
		education = new Education();
		AS = "Assistant Professor";
		AO = "Associate Professor";
		FU = "Full-Time Professor";
		setID(id);
		setName(lastName, firstName);
		setGender(gender);
		setBirthdate(month, day, year);
		setLevel(level);
		setDegree(degree);
		setMajor(major);
		setResearch(numberOfResearch);
	}
	
	public String toString() {
		return //"Employee ID Number: " + getID() 
				//+ "\nEmployee Name: " + getName() 
				//+ "\nGender: " + getGender() 
				//+ "\nBirthdate: " + getBirthdate() 
				super.toString() 
				+ "\nLevel: " + getLevel()
				+ "\nDegree: " + getDegree()
				+ "\nMajor: " + getMajor()
				+ "\nResearch: " + getResearch()
				+ "\nMonthly Salary: " + monthlyEarnings();
	}
	
	public void setLevel(String level) {
		if (level.equalsIgnoreCase("AS")) {
			this.level = AS;
		} else if (level.equalsIgnoreCase("AO")) {
			this.level = AO;
		} else if (level.equalsIgnoreCase("FU")) {
			this.level = FU;
		}
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setDegree(String degree) {
		education.setDegree(degree);
	}
	
	public String getDegree() {
		return education.getDegree();
	}
	
	public void setMajor(String major) {
		education.setMajor(major);
	}
	
	public String getMajor() {
		return education.getMajor();
	}
	
	public void setResearch(int numberOfResearch) {
		education.setResearch(numberOfResearch);
	}
	
	public int getResearch() {
		return education.getResearch();
	}
	
	public double monthlyEarnings() {
		double earnings = 0.00;
		if (getLevel().equalsIgnoreCase(AS)) {
			earnings = FACULTY_MONTHLY_SALARY;
		} else if (getLevel().equalsIgnoreCase(AO)) {
			earnings = FACULTY_MONTHLY_SALARY * 1.2;
		} else if (getLevel().equalsIgnoreCase(FU)) {
			earnings = FACULTY_MONTHLY_SALARY * 1.4;
		}
		return earnings;
	}
	
}