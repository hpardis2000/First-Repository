package Lambda;

import java.time.LocalDate;
import java.util.Comparator;

public class Students implements Comparable<Students>{
	
	private String firstName,lastName,id;
	private LocalDate registrationDate;
	
	public static final Comparator<Students> NAME_COMPARATOR = new NameComparator();
	public static final Comparator<Students> REGISTERATION_DATE_COMPARATOR=new RegisterationDateComparator();
	
	public Students(String firstName, String lastName, String id, LocalDate registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.registrationDate = registrationDate;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "Students [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", registrationDate="
				+ registrationDate + "]\n";
	}
	@Override
	public int compareTo(Students o) {
		
		return id.compareTo(o.id);
	}

	public static class NameComparator implements Comparator<Students>{

		@Override
		public int compare(Students s1, Students s2) {
			if(s1.getLastName().equals(s2.getLastName())) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}else {
			return s1.getLastName().compareTo(s2.getLastName());
			}
		}
		
	}
	
	public static class RegisterationDateComparator implements Comparator<Students>{

		@Override
		public int compare(Students s1, Students s2) {
			return s1.getRegistrationDate().compareTo(s2.getRegistrationDate());
		}
		
	}
	
//	@Override
//	public int compareTo(Students obj) {
//		if(obj instanceof Students) {
//			Students otherStudents=(Students)obj;
//			if(id.equals(otherStudents.id)&& firstName.equals(otherStudents.firstName)&& lastName.equals(otherStudents.lastName)) {
//				return 1;
//			}
//		
//		}
//		return -1;
//	}
}
