import java.util.Scanner;

public class Rational {
	
	private int numerator;
	private int denominator;
	private Scanner scan;
	
	public Rational() {
		numerator = 0;
		denominator = 0;
		scan = new Scanner(System.in);
	}
	
	// Gets the numerator.
	public int getNumerator() {
		return numerator;
	}
	
	// Gets the denominator.
	public int getDenominator() {
		return denominator;
	}
	
	// Sets the numerator.
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	// Sets the denominator.
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	// Gets the user's inputs.
	public void inputRational() {
		System.out.print("Please enter a numerator: ");
		setNumerator(scan.nextInt());
		System.out.print("Please enter a denominator: ");
		setDenominator(scan.nextInt());
	}
	
	// Prints out the rational number.
	public String toString() {
		return getNumerator() + "/" + getDenominator();
		//return getNumerator() + "\n-\n" + getDenominator();
	}
	
	// Gets the greatest common divisor among the numbers.
	private int gcd(int m, int n) {
		int r;
		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	
	// Adds rational numbers.
	public Rational add(Rational f) {
		Rational newNumber = new Rational();
		int fNumerator = f.getNumerator();
		int fDenominator = f.getDenominator();
		int finalNumerator = this.getNumerator()*fDenominator+this.getDenominator()*fNumerator;
		int finalDenominator = this.getDenominator()*fDenominator;
		int scalar = gcd(finalNumerator, finalDenominator);
		newNumber.setNumerator(finalNumerator/scalar);
		newNumber.setDenominator(finalDenominator/scalar);
		return newNumber;
	}
	
	// Subtracts rational numbers.
	public void sub(Rational f1, Rational f2) {
		Rational newNumber = new Rational();
		int f1Numerator = f1.getNumerator();
		int f1Denominator = f1.getDenominator();
		int f2Numerator = f2.getNumerator();
		int f2Denominator = f2.getDenominator();
		int finalNumerator = f1Numerator*f2Denominator-f1Denominator*f2Numerator;
		int finalDenominator = f1Denominator*f2Denominator;
		int scalar = gcd(finalNumerator, finalDenominator);
		if (scalar < 0) {
			scalar = scalar*-1;
		}
		newNumber.setNumerator(finalNumerator/scalar);
		newNumber.setDenominator(finalDenominator/scalar);
		// this.setNumerator(finalNumerator/scalar); // In case he needs a rational in main.
		// this.setDenominator(finalDenominator/scalar); // In case he needs a rational in main.
		System.out.println(f1.toString() + " - " + f2.toString() + " = " + newNumber.toString());
	}
	
	// Multiplies rational numbers.
	public Rational mul(Rational f) {
		Rational newNumber = new Rational();
		int fNumerator = f.getNumerator();
		int fDenominator = f.getDenominator();
		int finalNumerator = this.getNumerator()*fNumerator;
		int finalDenominator = this.getDenominator()*fDenominator;
		int scalar = gcd(finalNumerator, finalDenominator);
		newNumber.setNumerator(finalNumerator/scalar);
		newNumber.setDenominator(finalDenominator/scalar);
		return newNumber;
	}
	
	// Divides rational numbers.
	public void div(Rational f1, Rational f2) {
		Rational newNumber = new Rational();
		int f1Numerator = f1.getNumerator();
		int f1Denominator = f1.getDenominator();
		int f2Numerator = f2.getNumerator();
		int f2Denominator = f2.getDenominator();
		int finalNumerator = f1Numerator*f2Denominator;
		int finalDenominator = f1Denominator*f2Numerator;
		int scalar = gcd(finalNumerator, finalDenominator);
		if (scalar < 0) {
			scalar = scalar*-1;
		}
		newNumber.setNumerator(finalNumerator/scalar);
		newNumber.setDenominator(finalDenominator/scalar);
		// this.setNumerator(finalNumerator/scalar); // In case he needs a rational in main.
		// this.setDenominator(finalDenominator/scalar); // In case he needs a rational in main.
		System.out.println(f1.toString() + " / " + f2.toString() + " = " + newNumber.toString());
	}
	
}
