
public class Student {
	enum Status{
		FULL_TIME(true,"F"),PART_TIME(true,"P"),INACTIVE(false,"IN");
		
		private boolean benefits;
		private String abriviation;
		private Status(boolean benefits,String abriviation) {
			this.benefits=benefits;
			this.abriviation=abriviation;
		}
		public boolean getBenefits() {
			return this.benefits;
		}
		public String toString() {
			return this.abriviation;
		}
		
	};
	
	private int id;
	private String name;
	private String phone;
	private Status status;
	private static final String PHONE_COMPANY = "555-5555";
	private static final String DEFAULT_NAME="NO NAME";
	public Student(int id, String name , String phone, Status status) {
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.status=status;
	}
	public Student(int id, String name,Status status) {
		this(id,name,PHONE_COMPANY,status);
	}
	public Student(int id,Status status) {
		this(id,DEFAULT_NAME,status);
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setId() {
		this.id=id;
	}
	public void setName() {
		this.name=name;
	}
	public void setPhone() {
		this.phone=phone;
	}
	public String toString() {
		return "name: " + this.name + "\n\tId: " + this.id + "\n\t\tPhone: " + this.phone;
	
	}
	

}
