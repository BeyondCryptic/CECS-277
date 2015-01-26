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
		return getNumerator() + "\n-\n" + getDenominator();
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
		//f.getNumerator();
	}
	
}
