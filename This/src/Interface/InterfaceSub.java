package Interface;

public interface InterfaceSub {

	public abstract void show();
	public abstract int minues(int x, int y);
	
	
	default void run() {
		System.out.println("Run!");
	}
	  default int sum(int x, int y) {
		 return x+y;
	 }
	
}
