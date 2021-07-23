package Interface;

public interface CollegeProcessor {
	default void review() {
		System.out.println("reviewing College");
	}
	
	void awardCredit();

}
