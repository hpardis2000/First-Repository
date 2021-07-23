package Interface;

public interface HRProcessor {

	
	
	default void review() {
		System.out.println("processing review");
	}
	void pay();
	void benefits();
}
