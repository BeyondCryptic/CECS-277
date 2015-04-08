import java.util.TreeMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hashing {
	
	public Map<Integer, Employee> employees;
	public Map<Employee, Integer> performance;
	public Set<Employee> employeesHash;
	
	public Hashing() {
		employees = new TreeMap<Integer, Employee>();
		performance = new TreeMap<Employee, Integer>();
		employeesHash = new HashSet<Employee>();
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		while (userChoice != 6) {
			showMenu();
			System.out.print("Enter a choice: ");
			userChoice = scan.nextInt();
			if (userChoice == 1) {
				System.out.println("Adding...");
				System.out.println("Enter a first name: ");
				String firstName = scan.next();
				System.out.println("Enter a last name: ");
				String lastName = scan.next();
				System.out.println("Enter an ID number: ");
				int idNumber = scan.nextInt();
				System.out.println("Enter a performance number: ");
				int performanceNumber = scan.nextInt();
				System.out.println("Fist Name: " + firstName + "\nLast Name: " + lastName + "\nID Number: " + idNumber + "\nPerformance: " + performanceNumber);
				Employee temp = new Employee(firstName, lastName, idNumber);
				employees.put(temp.idNumber, temp);
				performance.put(temp, performanceNumber);
			} else if (userChoice == 2) {
				System.out.println("To remove an employee, please enter their ID number: ");
				int idNumber = scan.nextInt();
				performance.remove(employees.get(idNumber));
				employees.remove(idNumber);
			} else if (userChoice == 3) {
				System.out.println("To modify an employee's performance, please enter their ID number: ");
				int idNumber = scan.nextInt();
				System.out.println("Enter their new performance number: ");
				int newPerformance = scan.nextInt();
				performance.put(employees.get(idNumber), newPerformance);
			} else if (userChoice == 4) {
				Set<Employee> performanceList = performance.keySet();
				for (Employee e : performanceList) {
					System.out.println("Performance of employee " + e + ": " + performance.get(e));
				}
			} else if (userChoice == 5) {
				Set<Employee> employeeList = performance.keySet();
				for (Employee e : employeeList) {
					employeesHash.add(e);
				}
				for (Employee e : employeesHash) {
					System.out.println("Hash code of employee " + e + ": " + e.hashCode());
				}
			} else if (userChoice == 6) {
				break;
			}
		}
	}
	
	public void showMenu() {
		System.out.println("1. Add Employee\n2. Remove Employee\n3. Modify Performances\n4. Print All Performances\n5. Add To Hash Set And Print Hash Code\n6. Quit");
	}
	
	public class Employee implements Comparable<Employee> {
		public String firstName;
		public String lastName;
		public int idNumber;
		
		public Employee() {
			firstName = "";
			lastName = "";
			idNumber = 0;
		}
		
		public Employee(String firstName, String lastName, int idNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
		}
		
		public String toString() {
			return firstName + " " + lastName + " (ID Number: " + idNumber + ")";
		}
		
		public boolean equals(Employee e) {
			if (this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.idNumber == e.idNumber) {
				return true;
			}
			return false;
		}
		
		public int hashCode() {
			final int HASH_MULTIPLIER = 29;
			int h = HASH_MULTIPLIER * firstName.hashCode() + lastName.hashCode();
			h = HASH_MULTIPLIER * h + ((Integer) idNumber).hashCode();
			return h;
		}

		public int compareTo(Employee e) {
			if (this.lastName.compareTo(e.lastName) == 0) {
				if (this.firstName.compareTo(e.firstName) == 0) {
					return this.idNumber-e.idNumber;
				}
				return this.firstName.compareTo(e.firstName);
			}
			return this.lastName.compareTo(e.lastName);
		}
		
	}
	
}
