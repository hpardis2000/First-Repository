package Interface;

public class Employee extends Person {
	private String id;
	
	public Employee(String name, String id) {
		super(name);
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tEmployee [id=" + id + "]";
	}

	@Override
	public void pay() {
		System.out.println("Paying " + getName());
		
	}

	
	@Override
	public void benefits() {
		System.out.println("Process benefit for " + getName());
		
	}


//	@Override
//	public void review() {
//		// TODO Auto-generated method stub
//		
//	}

	
	

	

}
