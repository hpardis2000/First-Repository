package Comparable;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	//public static final Comparator<Student> FIRST_NAME_COMPARATOR=new FirstNameComparator();
	//public static final Comparator<Student> LAST_NAME_COMPARATOR =new LastNameComparator();
	
	private String firstName,lastName;
	private int id;
	public Student(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "\n";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student obj=(Student)o;
			return (firstName.equals(obj.firstName)&& lastName.equals(obj.lastName)&& this.id==obj.id);
		}
		return false;
	}
	
	
	@Override
	public int compareTo(Student otherStudent) {
		if(id>otherStudent.id) {
			return 1;
		}
	return -1;
	}
	
//	public static class FirstNameComparator implements Comparator<Student>{
//		
//		@Override
//		public int compare(Student s1, Student s2) {
//			return s1.getFirstName().compareTo(s2.getFirstName());
//		}
//	}
	
//	public static class LastNameComparator implements Comparator<Student>{
//		
//		@Override
//		public int compare(Student s1,Student s2) {
//			return s1.getLastName().compareTo(s2.getLastName());
//		}
//	}
}
