public class MyEnumTester {

	public static void main(String[] args) {
		MyEnum.ClassType c3=MyEnum.ClassType.CLASS_C;
		MyEnum e1=new MyEnum(1, "hamid", MyEnum.ClassType.ClASS_A);
		MyEnum e2=new MyEnum(2,"hasan",c3);
		
		MyEnum.ClassType c1 =MyEnum.ClassType.ClASS_A;
		MyEnum.ClassType c2=MyEnum.ClassType.CLASS_B;
		MyEnum.ClassType [] values= MyEnum.ClassType.values();
		for(MyEnum.ClassType temp : values) {
			System.out.println(temp);
		}
		
		
		
		
	}

}
