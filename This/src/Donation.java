import java.time.*;



public class Donation {
	private double amount;
	private LocalDate date;
	 
	public static final double DEFAULT_DONATION_AMOUNT=25;
	
	public Donation(double amount, LocalDate date) {
		this.amount=amount;
		this.date=date;
		
	}
	public Donation(LocalDate date) {
		this(DEFAULT_DONATION_AMOUNT,date);
	}
	public Donation() {
		this(DEFAULT_DONATION_AMOUNT,LocalDate.now());
	}
	public Donation(double amount) {
		this(amount,LocalDate.now());
	}

	public double getAmount() {
		return this.amount;
	}
	public LocalDate getDate() {
		return this.date;
	}
	public void setAmount(double amount) {
		if(amount>=0) {
		this.amount=amount;
		}
	}
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public String toString() {
		return "Amount is: " + amount + " made on: " + date;
	}
}
