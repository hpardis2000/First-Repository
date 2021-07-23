package Interface;

public class Consultant extends Person {

	public Consultant(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + " (Consultant)";
	}

	@Override
	public void pay() {
		System.out.println("paying " + getName() + " Consultant");
	}

	@Override
	public void benefits() {
		System.out.println("Benefits " + getName() + " Consultant");
		
	}
//
//	@Override
//	public void review() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
 