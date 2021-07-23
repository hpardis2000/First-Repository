
public class Fraction {
  private int numerator, denominator;
  
  
  public Fraction(int initialNumerator, int initialDenominator){
	  
	  if(initialDenominator!=0) {
		  numerator=initialNumerator;
	  denominator=initialDenominator;
	  }
  }
   public int getNumerator() {
	   return numerator;
   }
   public void setNumerator(int newNumerator) {
	   numerator=newNumerator;
   }
   public int getDenominator() {
	   return denominator;
   }
   public void setDenominator(int newDenominator) {
	   if(newDenominator!=0) {
		   denominator=newDenominator;
	   }
   }
   public String toString() {
	   return numerator + "/" + denominator;
   }
   public double getValue() {
	   return (1.0 * numerator) / (double)denominator;
   }
   public boolean isReduced() {
	  
	   return greatestCommonFactor(numerator,denominator) ==1;
   }
   public Fraction createNewReduceFraction() {
	   if(isReduced()) {
		   return new Fraction(numerator, denominator);
	   }else {
		   int greatestCommonFactor=greatestCommonFactor(numerator,denominator);
		   int reducedNumerator=numerator/ greatestCommonFactor;
		   int reducedDenominator=denominator/greatestCommonFactor;
		   return new Fraction(reducedNumerator, reducedDenominator);
	   }
   }
 
   public int lowestCommonDenominator(Fraction otherFraction) {
	   //loest common multiple= (a*b) / gcd(a,b)
   int lcmNum=denominator * otherFraction.denominator; // a*b
   int lcmDen= greatestCommonFactor(denominator,otherFraction.denominator); // gcd(a,b)
   return lcmNum / lcmDen;
   }
   private int findSmaller(int number1, int number2) {
	   if(number1 < number2) {
		   return number1;
	   }else {
	   return number2;
	   }
   }
   private int greatestCommonFactor(int number1, int number2) {
	   int greatestCommonFactor=1;
	   int maxFactorToCheck=findSmaller(number1, number2);
	   for(int possibleFactor=1;possibleFactor<=maxFactorToCheck;possibleFactor++ ) {
		   if((number1 % possibleFactor==0)&&(number2 % possibleFactor==0)){
			   greatestCommonFactor=possibleFactor;
		   }
   }
	   return greatestCommonFactor;
   }
   }
