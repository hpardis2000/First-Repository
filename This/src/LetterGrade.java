
public enum LetterGrade {
	A(90,100,true),B(80,89,true),C(70,79,true),D(60,69,false),F(0,59,false);
	
	private final int low,high;
	private final boolean passing;
	
	private LetterGrade(int low,int high,boolean passing) {
		this.low=low;
		this.high=high;
		this.passing=passing;
	}
	public int getLow() {
		return this.low;
	}
	public int getHigh() {
		return this.high;
	}
	public boolean isPassing() {
		return this.passing;
	}
	public static LetterGrade getLetterGrade(int numericGrade) {
		LetterGrade[] letterGrade=LetterGrade.values();
		for(LetterGrade possibleValue : letterGrade) {
			if(possibleValue.getHigh() >= numericGrade && possibleValue.getLow()<= numericGrade) {
				return possibleValue;
			}
		}
		
		return null;
	}
}


