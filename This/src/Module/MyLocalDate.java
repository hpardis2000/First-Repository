package Module;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class MyLocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		System.out.println(today.format(outputFormatter));
		
		LocalDate aprilFools=LocalDate.of(2025, Month.MAY, 10);
		Period timeToFool=Period.between(today, aprilFools);
		System.out.println("period time is: " + timeToFool.get(ChronoUnit.DAYS));
		System.out.println("period time is: " + timeToFool.getDays());
		System.out.println("period time is: " + ChronoUnit.DAYS.between(today, aprilFools));
		
		
		String midTermString="11-06-2013";
		DateTimeFormatter inputFormatter=DateTimeFormatter.ofPattern("LL-dd-yyyy");
		LocalDate midTerm=LocalDate.parse(midTermString,inputFormatter);
		System.out.println("This is mid term: " + midTerm.format(outputFormatter));
		
		
		String birthdayString = "09-11-1975";
		LocalDate myBirtday=LocalDate.parse(birthdayString,inputFormatter);
		System.out.println("my birthday is: " + myBirtday.format(outputFormatter));
		LocalDate myCourrentYearBirtday=LocalDate.of(LocalDate.now().getYear(), myBirtday.getMonth(), myBirtday.getDayOfMonth());
		System.out.println(myCourrentYearBirtday);
		Boolean alreadyHappened;
		alreadyHappened=today.isAfter(myCourrentYearBirtday);
		System.out.println(alreadyHappened?"passed" : "not yet");
		
		
		Instant programStart = Instant.now();
		
		try {
			Thread.sleep(3000);
		}catch(Exception ex) {
			
		}
		
		Instant programEnd=Instant.now();
		
		Duration duration= Duration.between(programStart, programEnd);
		System.out.println("..........................." + duration.getSeconds());
		System.out.println(ChronoUnit.SECONDS.between(programStart, programEnd));
		
		
		LocalDate tomorrow = today.plus(1,ChronoUnit.DAYS);
		System.out.println(tomorrow.format(outputFormatter));
		
		LocalTime now=LocalTime.now();
		System.out.println(now);
		
		LocalDateTime nowToday=LocalDateTime.now();
		System.out.println(nowToday);
		
	}
	
	
	
}
