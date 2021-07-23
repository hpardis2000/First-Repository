package Interface;

import java.util.Collection;
import java.util.Collections;

public abstract class Person implements HRProcessor {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	//public abstract void review();

	
	
}
