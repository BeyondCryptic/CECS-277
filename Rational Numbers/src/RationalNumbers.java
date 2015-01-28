/**
 * 
 * @author David Van
 * @version 1.0
 *
 */

public class RationalNumbers {
	
	/** First rational number. */
	public static Rational myRational;
	/** Second rational number. */
	public static Rational myRational2;
	/** Third, optional, rational number. */
	public static Rational myRational3;
	
	/**
	 * 
	 * @param args Gets arguments from the user when launching from command line.
	 */
	public static void main(String[] args) {
		
		// Creates three rational numbers.
		myRational = new Rational();
		myRational2 = new Rational();
		myRational3 = new Rational();
		
		// Gets the input from the user for the first two rational numbers.
		myRational.inputRational();
		System.out.println("The first number is: ");
		System.out.println(myRational.toString());
		myRational2.inputRational();
		System.out.println("The second number is: ");
		System.out.println(myRational2.toString());
		
		// Show the two rational numbers added.
		System.out.println("The numbers added is: ");
		System.out.print(myRational.toString() + " + ");
		System.out.print(myRational2.toString() + " = ");
		System.out.println(myRational.add(myRational2).toString()); // Comment this out if below happens.
		// myRational3 = myRational.add(myRational2); // In case he needs a rational in main.
		// System.out.println(myRational3.toString()); // In case he needs a rational in main.
		
		// Show the two rational numbers subtracted.
		System.out.println("The numbers subtracted is: ");
		myRational.sub(myRational, myRational2); // Comment this out if below happens.
		// myRational3.sub(myRational, myRational2); // In case he needs a rational in main.
		// System.out.println(myRational3.toString()); // In case he needs a rational in main.
		
		// Show the two rational numbers multiplied.
		System.out.println("The numbers multiplied is: ");
		System.out.print(myRational.toString() + " * ");
		System.out.print(myRational2.toString() + " = ");
		System.out.println(myRational.mul(myRational2).toString()); // Comment this out if below happens.
		// myRational3 = myRational.mul(myRational2); // In case he needs a rational in main.
		// System.out.println(myRational3.toString()); // In case he needs a rational in main.
		
		// Show the two rational numbers divided.
		System.out.println("The numbers divided is: ");
		myRational.div(myRational, myRational2); // Comment this out if below happens.
		// myRational3.div(myRational, myRational2); // In case he needs a rational in main.
		// System.out.println(myRational3.toString()); // In case he needs a rational in main.
		
		// Print the decimal answer of the two rational numbers being divided.
		System.out.println("The number in decimal: " + Rational(myRational, myRational2));
		
		// Change the numbers per the requirements of this project.
		System.out.println("Changing numerator and denominator...");
		
		myRational.setNumerator(2);
		myRational2.setDenominator(5);
		
		// Prints out the changed numbers.
		System.out.println("Numerator: " + myRational.getNumerator());
		System.out.println("Denominator: " + myRational2.getDenominator());
		
	}
	/**
	 * Print the decimal answer of the two rational numbers being divided.
	 * @param f1 First rational number.
	 * @param f2 Second rational input.
	 * @return Print the decimal answer of the two rational numbers being divided.
	 */
	public static double Rational(Rational f1, Rational f2) { // Print the decimal answer of the two rational numbers being divided.
		double decimalAnswer;
		decimalAnswer = (double)(f1.getNumerator()*f2.getDenominator())/(double)(f1.getDenominator()*f2.getNumerator());
		return decimalAnswer;
	}
}
