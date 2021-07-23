package generic;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FeatureSpot <T extends Item> {
	
	private T item;
	private LocalTime start,end;
	private int featuredItemCount;
	
	public FeatureSpot() {
		this.featuredItemCount=0;
		this.item=null;
	}
	public void featureItem(T item,int numberOfMinutes) {
		featuredItemCount++;
		this.item=item;
		this.start=LocalTime.now();
		this.end=this.start.plusMinutes(numberOfMinutes);
	}
	public boolean isAnythingFeatured() {
		LocalTime now = LocalTime.now();
		return (start.isBefore(now)&& now.isBefore(end));
		
	}
	
	public T getItem() {
		return item;
	}

	public LocalTime getStart() {
		return start;
	}
	public LocalTime getEnd() {
		return end;
	}
	
	@Override
	public String toString() {
		if(!isAnythingFeatured()) {
			return " there is no featured item at this time." + 
		"\n\tThere have been" + featuredItemCount + "items featured.";
			
		}else {
			return "featured item!\n" + item.toString() +
					"\nThis item will be featured until " + end.truncatedTo(ChronoUnit.MINUTES) +
					"\nThere have been " + featuredItemCount + " items featured.\n";
		}
	}
}
