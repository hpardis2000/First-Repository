package Comparable;

public class Test {
	class subTest {
		
	}

	private  static String str = "Javatpoint";  
	//nested class which is a Static class  
	public static class B  
	{  
	//non-static method of Static class  
	public void show()   
	{  
	System.out.println(str);   
	}  
	public static void run() {
		System.out.println("Run");
	}
	}  
	public static void main(String args[])  
	{  
		
		B b=new B();
		b.show();
		
	}  
	
}
