
public class MultithreadingTester {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			Multithreading myThread=new Multithreading(i);
			myThread.start();
		}
	}

}
