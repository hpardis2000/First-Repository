
public class FractionTester {

	public static void main(String[] args) {
		Fraction frac1=new Fraction(1, 2);
		Fraction frac2=new Fraction(2, 3);
		Fraction frac3=new Fraction(5, 9);
		Fraction frac4=new Fraction(2, 8);
		System.out.println(frac4.isReduced());
		System.out.println(frac4.createNewReduceFraction().isReduced());
		

	}

}
