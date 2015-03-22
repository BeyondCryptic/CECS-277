
public class Hashing {
	
	public Hashing() {
		
	}
	
	public class Employee {
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
		
		public int hashCode() {
			final int HASH_MULTIPLIER = 29;
			int h = HASH_MULTIPLIER * firstName.hashCode() + lastName.hashCode();
			h = HASH_MULTIPLIER * h + ((Integer) idNumber).hashCode();
			return h;
		}
		
	}
	
}
