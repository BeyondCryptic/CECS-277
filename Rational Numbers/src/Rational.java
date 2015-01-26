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
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void inputRational() {
		System.out.print("Please enter a numerator: ");
		setNumerator(scan.nextInt());
		System.out.print("Please enter a denominator: ");
		setDenominator(scan.nextInt());
	}
	
	public String toString() {
		return getNumerator() + "/" + getDenominator();
		//return getNumerator() + "\n-\n" + getDenominator();
	}
	
	private int gcd(int m, int n) {
		int r;
		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	
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
		System.out.println(f1.toString() + " - " + f2.toString() + " = " + newNumber.toString());
	}
	
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
	
	public void div(Rational f1, Rational f2) {
		Rational newNumber = new Rational();
		int f1Numerator = f1.getNumerator();
		int f1Denominator = f1.getDenominator();
		int f2Numerator = f2.getDenominator(); // Flipped to divide
		int f2Denominator = f2.getNumerator(); // Flipped to divide
		int finalNumerator = f1Numerator*f2Numerator;
		int finalDenominator = f1Denominator*f2Denominator;
		int scalar = gcd(finalNumerator, finalDenominator);
		if (scalar < 0) {
			scalar = scalar*-1;
		}
		newNumber.setNumerator(finalNumerator/scalar);
		newNumber.setDenominator(finalDenominator/scalar);
		System.out.println(f1.toString() + " / " + f2.toString() + " = " + newNumber.toString());
	}
	
}
