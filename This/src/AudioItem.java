
public abstract class AudioItem implements Downloadable , Comparable<AudioItem>{
private String title;
private double price;
private int numSeconds;
private static final double DEFAULT_PRICE=0.99;
private static int numberOfAudioItems=0;
public AudioItem(String title,double price,int numSeconds) {
	this.title=title;
	this.price=price;
	this.numSeconds=numSeconds;
	AudioItem.numberOfAudioItems++;
}
public AudioItem(String title,int numSeconds) {
	this(title,DEFAULT_PRICE,numSeconds);
}
public static int getNumberOfAudioItems() {
	return AudioItem.numberOfAudioItems;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNumSeconds() {
	return numSeconds;
}
public void setNumSeconds(int numSeconds) {
	this.numSeconds = numSeconds;
}
@Override
public String toString() {
	return "AudioItem [title=" + title + ", price=" + price + ", numSeconds=" + numSeconds + "]";
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof AudioItem) {
		AudioItem otherAudioItem=(AudioItem)obj;
		return otherAudioItem.title.equalsIgnoreCase(title) &&
				otherAudioItem.numSeconds==numSeconds && 
				Math.abs(this.price - otherAudioItem.price) < 0.0001; 
	}else {
		return false;
	}
}
public abstract void playSample();

@Override
public void download() {
	System.out.println("Downloading item " + title);
}

@Override
public int compareTo(AudioItem otherItem) {
	if(title.equalsIgnoreCase(otherItem.title)) {
		//return Double.compare(price, otherItem.price);
		if(price > otherItem.price) {
			return 1;
		}else if(price < otherItem.price) {
			return -1;
		}else {
			return 0;
		}
	}else {
	return title.compareToIgnoreCase(otherItem.title);
	}
}

}
