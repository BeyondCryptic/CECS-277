
public class RationalNumbers {
	
	public static Rational myRational;
	public static Rational myRational2;
	
	public static void main(String[] args) {
		myRational = new Rational();
		myRational2 = new Rational();
		
		myRational.inputRational();
		System.out.println("The first number is: ");
		System.out.println(myRational.toString());
		myRational2.inputRational();
		System.out.println("The second number is: ");
		System.out.println(myRational2.toString());
		
		System.out.println("The numbers added is: ");
		System.out.print(myRational.toString() + " + ");
		System.out.print(myRational2.toString() + " = ");
		System.out.println(myRational.add(myRational2).toString());
		
		System.out.println("The numbers subtracted is: ");
		myRational.sub(myRational, myRational2);
		
		System.out.println("The numbers multiplied is: ");
		System.out.print(myRational.toString() + " * ");
		System.out.print(myRational2.toString() + " = ");
		System.out.println(myRational.mul(myRational2).toString());
		
		System.out.println("The numbers divided is: ");
		myRational.div(myRational, myRational2);
		
		System.out.println(Rational(myRational, myRational2));
		
		myRational.setNumerator(2);
		myRational2.setDenominator(5);
		
		System.out.println("Numerator: " + myRational.getNumerator());
		System.out.println("Denominator: " + myRational2.getDenominator());
		
	}
	
	public static double Rational(Rational f1, Rational f2) {
		double decimalAnswer;
		decimalAnswer = (double)(f1.getNumerator()*f2.getDenominator())/(double)(f1.getDenominator()*f2.getNumerator());
		return decimalAnswer;
	}
}
