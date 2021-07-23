public class StudentTester {

	public static void main(String[] args) {
		Student.Status ss1=Student.Status.PART_TIME;
		Student s1=new Student(101,Student.Status.FULL_TIME);
		System.out.println(s1);
		System.out.println(Student.Status.FULL_TIME);
	}

}
