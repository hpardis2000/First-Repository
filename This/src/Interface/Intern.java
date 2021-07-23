package Interface;

public class Intern extends Employee implements HRProcessor,CollegeProcessor{

	public Intern(String name, String id) {
		super(name,id);
	}
	
	public void awardCredit() {
		System.out.println("Awarding Credit");
	}

	@Override
	public void review() {
		
		CollegeProcessor.super.review();
	}
}
