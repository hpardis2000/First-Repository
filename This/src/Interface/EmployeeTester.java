package Interface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTester {

	public static void main(String[] args) {
		List<Person> personList=new ArrayList<>();
		personList.add(new Employee("waly woker","w123"));
		personList.add(new Employee("Erin Earner", "E567"));
		personList.add(new Employee("sal slaker","s899"));
		personList.add(new Intern("Ida imani", "I765"));
		personList.add(new Consultant("cal jimijon"));
		
		for(Person p : personList) {
			p.pay();
			p.benefits();
			
			if(p instanceof Intern) {
				((Intern) p).awardCredit();
			}
			//System.out.println(p);
		}

	}

}
