package generic;

public class Book extends Item{
	
	private String author;
	
	public Book(String name,String author) {
		super(name);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t Author: " + author ;
	}
	

}
