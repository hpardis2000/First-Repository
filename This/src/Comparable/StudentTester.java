package Comparable;

import java.util.*;

public class StudentTester {

	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(new Student("ali","kamali",109));
		students.add(new Student("bahram","lotfi",102));
		students.add(new Student("bahman","zamani",101));
		students.add(new Student("rahman","rahimi",104));
		students.add(new Student("zahrta","kamalifardala",105));
		
		
		 Comparator<Student> FIRST_NAME_COMPARATOR = (s1, s2) ->{
					return s1.getFirstName().compareTo(s2.getFirstName());
		 };
			
		Comparator<Student> LAST_NAME_COMPARATOR=(Student s1, Student s2)-> {
				return s1.getLastName().compareTo(s2.getLastName());
		};
		
		Collections.sort(students,FIRST_NAME_COMPARATOR);
		System.out.println(students);
		Collections.sort(students,LAST_NAME_COMPARATOR);
		System.out.println(students);
	}

}
