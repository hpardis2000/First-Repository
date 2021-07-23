package Comparable;
interface A{}
public class Outer {

	public int outerId;
	public static int outerStaticId=1;
	public void show() {
		System.out.println("show in outer");
	}
	class Inner{
		public int innerId;
		
		public void show() {
			System.out.println("show in inner");
		}
	}
	abstract static class InnerStatic{
		
		public int innerStaticId;
		public void show() {
			System.out.println("show in innerstatic ");
		}
	}
	
	public static void main(String[] args) {
		
		Outer out1=new Outer();
		out1.outerId=1;
		outerStaticId=2;
		System.out.println(outerStaticId);
		System.out.println(out1.outerId);
		out1.show();
		
		Inner in1=out1.new Inner();
		in1.show();
		
		
		InnerStatic instatic = new InnerStatic() {};
		instatic.show();
		
		A a= new A() {
			
		};
	}
	
}
