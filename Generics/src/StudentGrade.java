import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentGrade {
	
	public Map<String, Student> studentMap;
	public Map<Student, Character> gradeMap;
	
	public StudentGrade() {
		studentMap = new TreeMap<String, Student>();
		gradeMap = new TreeMap<Student, Character>();
		printMenuAndGetChoice();
	}
	
	public void printMenuAndGetChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Choose An Action: \n1. Add Student\n2. Remove Student\n3. Modify Grades\n4. Print All Grades\n5. Quit");
		int userChoice = scan.nextInt();
		while (userChoice != 5) {
			if (userChoice == 1) {
				addStudent(gradeMap, studentMap);
			}
			if (userChoice == 2) {
				removeStudent(gradeMap, studentMap);
			}
			if (userChoice == 3) {
				modifyStudent(gradeMap, studentMap);
			}
			if (userChoice == 4) {
				printGrades(gradeMap);
			}
			System.out.println("Please Choose An Action: \n1. Add Student\n2. Remove Student\n3. Modify Grades\n4. Print All Grades\n5. Quit");
			userChoice = scan.nextInt();
		}
		System.exit(0);
	}
	
	/**
	 Adds a student based on user input.  Prints an error if a student
	 is added that already exists in the map.
	 @param gradeMap the map to associate student object with a grade
	 @param StudentMap the map to associate student id with a student
	 */
	public void addStudent(Map<Student, Character> gradeMap, Map<String, Student> studentMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first name: ");
		String firstName = scan.next();
		System.out.println("Enter a last name: ");
		String lastName = scan.next();
		System.out.println("Enter a student ID: ");
		String idNumber = scan.next();
		System.out.println("Enter the student's grade: ");
		char grade = scan.next().toCharArray()[0];
		Student newStudent = new Student(firstName, lastName, idNumber);
		if (!studentMap.containsKey(newStudent.idNumber)) {
			studentMap.put(newStudent.idNumber, newStudent);
			gradeMap.put(newStudent, grade);
		}
		else {
			System.out.println("That student already exists!");
		}
	}
	
	/**
	 Removes a student from the map based on user input
	 @param gradeMap the map to associate student object with a grade
	 @param StudentMap the map to associate student id with a student
	 */
	public void removeStudent(Map<Student, Character> gradeMap, Map<String, Student> studentMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the ID number of the student you want to remove: ");
		String idNumber = scan.next();
		if (studentMap.containsKey(idNumber)) {
			gradeMap.remove(studentMap.get(idNumber));
			studentMap.remove(idNumber);
		}
		else {
			System.out.println("That student does not exist!");
		}
	}
	
	/**
	 Modifies an entry based on user input.  Prints an error if an invalid student is modified
	 @param gradeMap the map to associate student object with a grade
	 @param StudentMap the map to associate student id with a student
	 */
	public void modifyStudent(Map<Student, Character> gradeMap, Map<String, Student> studentMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the ID number of the student you want to modify: ");
		String idNumber = scan.next();
		if (studentMap.containsKey(idNumber)) {
			System.out.println("Please enter the new grade: ");
			char grade = scan.next().toCharArray()[0];
			Student temp = studentMap.get(idNumber);
			gradeMap.remove(studentMap.get(idNumber));
			gradeMap.put(temp, grade);
			
		}
		else {
			System.out.println("That student does not exist!");
		}
	}
	
	/**
	 Prints the students and grades
	 @param gradeMap the map to print
	 */
	public void printGrades(Map<Student, Character> gradeMap) {
		Set<Student> gradeList = gradeMap.keySet();
		for (Student s : gradeList) {
			System.out.println("Grade of student " + s + ": " + gradeMap.get(s));
		}
	}
	
	public class Student implements Comparable<Student> {
		
		public String firstName, lastName, idNumber;
		public char grade;
		
		public Student() {
			firstName = "";
			lastName = "";
			idNumber = "";
		}
		
		public Student(String firstName, String lastName, String idNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
		}
		
		public String toString() {
			return firstName + " " + lastName + " (ID Number: " + idNumber + ")";
		}
		
		public int compareTo(Student s) {
			return this.idNumber.compareTo(s.idNumber);
		}
	}
}