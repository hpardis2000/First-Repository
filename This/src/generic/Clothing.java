package generic;

public abstract class Clothing extends Item implements Comparable<Item>{

	public static enum Size {SMALL, MEDIUM, LARGE};
	
	private Size size;
	
	public Clothing(String name,Size size) {
		super(name);
		this.size=size;
	}
	
	@Override
	public String toString() {
		return super.toString() +  "\n Size: " + size;
	}
	
	@Override
	public int compareTo(Item item) {
		if(item instanceof Clothing) {
			Clothing otherClothing=(Clothing)item;
			int parentComare=super.compareTo(item);
			if(parentComare==0) {
				return size.compareTo(otherClothing.size);
			}else {
				return parentComare;
			}
			}else {
				return super.compareTo(item);
				//throw new IllegalArgumentException("Clothing item need ");
			}
	}
}
