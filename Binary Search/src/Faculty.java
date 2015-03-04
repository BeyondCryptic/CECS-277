import java.util.Comparator;


public class Faculty implements EmployeeInfo, Comparable<Faculty>{
	
	private String lastName;
	private String firstName;
	private String idNumber;
	private String gender;
	private String level;
	private Education education;
	private final String AS;
	private final String AO;
	private final String FU;
	
	public Faculty() {
		lastName = "";
		firstName = "";
		idNumber = "";
		gender = "";
		level = "";
		education = new Education();
		AS = "Assistant Professor";
		AO = "Associate Professor";
		FU = "Full-Time Professor";
	}
	
	public Faculty(String id, String lastName, String firstName, String gender, String level, String degree, String major, int numberOfResearch) {
		this.level = "";
		education = new Education();
		AS = "Assistant Professor";
		AO = "Associate Professor";
		FU = "Full-Time Professor";
		setID(id);
		setName(lastName, firstName);
		setGender(gender);
		setLevel(level);
		setDegree(degree);
		setMajor(major);
		setResearch(numberOfResearch);
	}
	
	public String toString() {
		return "Employee ID Number: " + getID() 
				+ "\nEmployee Name: " + getName() 
				+ "\nGender: " + getGender() 
				+ "\nLevel: " + getLevel()
				+ "\nDegree: " + getDegree()
				+ "\nMajor: " + getMajor()
				+ "\nResearch: " + getResearch()
				+ "\nMonthly Salary: " + monthlyEarnings();
	}
	
	public int compareTo(Faculty e) {
		return this.lastName.compareTo(e.lastName);
	}
	
	/**
	 * Object for comparator to sort ID numbers by descending order.
	 */
	public static Comparator<Faculty> idComparatorDSD = new Comparator<Faculty>() {
		public int compare(Faculty f1, Faculty f2) {
			return Integer.parseInt(f2.idNumber)-Integer.parseInt(f1.idNumber);
		}
	};
	
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
	
	public void setEducation(Education education) {
		this.education = education;
	}
	
	public Education getEducation() {
		return education;
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