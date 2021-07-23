package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTester {

	public static void main(String[] args) {
		List<Students> students=new ArrayList<Students>();
		
		students.add(new Students("ali","rezaei","r121",LocalDate.of(2018, 10,10)));
		students.add(new Students("hamid","ghaderi","h421",LocalDate.of(1975, 9,21)));
		students.add(new Students("rahman","davari","D121",LocalDate.of(2008, 10,5)));
		students.add(new Students("tala","taghdarian","t251",LocalDate.of(1800, 9,2)));
		
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		Collections.sort(students, Students.NAME_COMPARATOR);
		System.out.println(students);
		Collections.sort(students,Students.REGISTERATION_DATE_COMPARATOR);
		System.out.println(students);
	}

}
