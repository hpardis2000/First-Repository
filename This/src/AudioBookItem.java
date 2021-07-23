
public class AudioBookItem extends AudioItem {
	private String author;
	private int numChapters;
	
	public AudioBookItem(String title, double price,int numSeconds,String author,int numChapters) {
		super(title, price, numSeconds);
		this.author=author;
		this.numChapters=numChapters;
	}
	
	@Override
	public void playSample() {
		System.out.println("Sampling " + getTitle() + "(1 chapter out of " + numChapters + ")");
	}
@Override
public String toString() {
	String parentString=super.toString();
	parentString += "\n\t Author: " + author +
			"\n\tNumber Of Chapther: " + numChapters;
	return parentString;
}
}
