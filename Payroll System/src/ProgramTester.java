
public class ProgramTester {
	
	public static void main(String[] args) {
		
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
		
		for (Employee e : employees) {
			System.out.println(e + "\n----------------------------------");
		}
		
	}
	
}