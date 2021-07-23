
public class Multithreading extends Thread{

	private int index;
	public Multithreading(int index) {
		this.index=index;
	}
		
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i + "From thread of " + index);
				try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
		
	}

