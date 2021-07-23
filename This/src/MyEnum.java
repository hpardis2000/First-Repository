
public class MyEnum {
	
	enum ClassType{
		ClASS_A(101,"first class"),CLASS_B(102,"second class"),CLASS_C(103,"third class");
		
		private String abriviation;
		private int classId;
		private ClassType(int classId, String abriviation) {
			this.classId=classId;
			this.abriviation=abriviation;
		}
		public String toString() {
			return "id: " + classId;
		}
		public void runClass() {
			System.out.println(classId + " + " + abriviation);
		}
		
	};
	
	
	
	private int id;
	private String name;
	private ClassType enumClass;
	public MyEnum(int id, String name,ClassType enumClass) {
		this.id=id;
		this.name=name;
		this.enumClass=enumClass;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return "Id: " + id + " Name: " + name + " " + enumClass.classId;
	}

}
