import java.util.ArrayList;
import java.util.Scanner;

public class LetterGradeTester {

	public static void main(String[] args) {
	ArrayList<GradeRecord> gradeList = new ArrayList<GradeRecord>();
	Scanner scan=new Scanner(System.in);
	System.out.println("How many records? ");
	int numRecords=Integer.parseInt(scan.nextLine());
	
	for(int i=0;i<numRecords;i++) {
		System.out.println("Enter the name: ");
		String name=scan.nextLine();
		System.out.println("Enter the numeric Grade: ");
		int numericGrade=Integer.parseInt(scan.nextLine());
		
		GradeRecord record=new GradeRecord(name, numericGrade);
		gradeList.add(record);
	}
	System.out.println(gradeList);
	int numAs=0;
	int numpassing=0;
	for(GradeRecord record : gradeList) {
		if(record.getLetterGrade()==LetterGrade.A) {
			numAs++;
		}
		if(record.getLetterGrade().isPassing()) {
			numpassing++;
		}
	}
	System.out.println("There are " + gradeList.size() + " grade records.");
	System.out.println("There are " + numAs + " As.");
	System.out.println("There are " + numpassing + " passing grades.");
	}

}
