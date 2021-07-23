package Interface;
interface Abc{
	public abstract void show();
	
}
//class AbcImpl implements Abc{
//	public void show() {
//		System.out.println("show in class");
//	}
//}

public class InterfaceTester  {

	public static void main(String[] args) {
		
		Abc obj = () -> System.out.println("in show");
			
		
			
		
		obj.show();
		
		
	}

}

