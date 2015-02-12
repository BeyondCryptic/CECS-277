import java.util.Arrays;

public class ProgramTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// String id, String lastName, String firstName, String gender, int month, int day, int year, double rate
		Staff staffOne = new Staff("123", "Allen", "Paita", "M", 2, 23, 1959, 50.00);
		Staff staffTwo = new Staff("456", "Zapata", "Steven", "F", 7, 12, 1964, 35.00);
		Staff staffThree = new Staff("789", "Rios", "Enrique", "M", 6, 2, 1970, 40.00);
		
		// String id, String lastName, String firstName, String gender, int month, int day, int year, String level, String degree, String major, int numberOfResearch
		Faculty facultyOne = new Faculty("243", "Johnson", "Anne", "F", 4, 27, 1962, "FU", "Ph.D", "Engineering", 3);
		Faculty facultyTwo = new Faculty("791", "Bouris", "William", "F", 3, 14, 1975, "AO", "Ph.D", "English", 1);
		Faculty facultyThree = new Faculty("623", "Andrade", "Christopher", "F", 5, 22, 1980, "AS", "MS", "Physical Education", 0);
		
		// String id, String lastName, String firstName, String gender, int month, int day, int year, double rate, int hoursWorkedAWeek
		PartTime partTimeOne = new PartTime("455", "Guzman", "Augusto", "F", 8, 10, 1977, 35.00, 30);
		PartTime partTimeTwo = new PartTime("678", "Depirro", "Martin", "F", 9, 15, 1987, 30.00, 15);
		PartTime partTimeThree = new PartTime("945", "Aldaco", "Marque", "M", 11, 24, 1988, 20.00, 35);
		
		Employee[] employees = {staffOne, staffTwo, staffThree, facultyOne, facultyTwo, facultyThree, partTimeOne, partTimeTwo, partTimeThree};
		
		double totalMonthly = 0.00;
		double totalMonthlyPartTime = 0.00;
		
		for (Employee e : employees) {
			totalMonthly += e.monthlyEarnings();
			if (e instanceof PartTime) {
				totalMonthlyPartTime += e.monthlyEarnings();
			}
			System.out.println(e + "\n----------------------------------");
		}

		System.out.println("Total Monthly Salary: " + totalMonthly);
		System.out.println("Total Monthly Salary (Part-Time): " + totalMonthlyPartTime);
		
		System.out.println("Descending Order By ID: ");
		
		Employee[] employeesTwo = {staffThree, staffOne, staffTwo, facultyThree, facultyTwo, facultyOne, partTimeOne, partTimeThree, partTimeTwo};
		
		Arrays.sort(employeesTwo, Employee.idComparatorDSD);
		
		for (Employee e : employeesTwo) {
			System.out.println(e + "\n----------------------------------");
		}
		
		System.out.println("Ascending Order By Last Name: ");
		
		Employee[] employeesThree = {staffThree, staffOne, staffTwo, facultyThree, facultyTwo, facultyOne, partTimeOne, partTimeThree, partTimeTwo};
		
		System.out.println("Descending Order By ID: ");
		
		Arrays.sort(employeesThree);
		
		for (Employee e : employeesThree) {
			System.out.println(e + "\n----------------------------------");
		}
		
		System.out.println("Test Duplication: ");
		
		Faculty testClone = (Faculty) facultyOne.clone();
		
		System.out.println("First Faculty's Major: " + facultyOne.getMajor());
		System.out.println("Cloned Faculty's Major: " + testClone.getMajor());
		
		System.out.println("Setting First Faculty's Major to \"Computer Science\"!");
		facultyOne.setMajor("Computer Science");
		
		System.out.println("First Faculty's Major: " + facultyOne.getMajor());
		System.out.println("Cloned Faculty's Major: " + testClone.getMajor());
		
	}
	
}