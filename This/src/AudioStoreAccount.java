import java.util.ArrayList;

public class AudioStoreAccount {
private String name,accountId;
private double balance;
private ArrayList<AudioItem> itemList;
private static double totalMoneySpent=0;
private static final double DEFAULT_INITIAL_BALANCE=0;

public AudioStoreAccount(String name,String accountId,double balance) {
	this.name=name;
	this.accountId=accountId;
	this.balance=balance;
	itemList=new ArrayList<AudioItem>();
}
public AudioStoreAccount(String name,String accountId) {
	this(name,accountId,DEFAULT_INITIAL_BALANCE);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	if(balance >=0) {
	this.balance = balance;
	}
}
public ArrayList<AudioItem> getItemList() {
	return itemList;
}
public void setItemList(ArrayList<AudioItem> itemList) {
	this.itemList = itemList;
}
@Override
public String toString() {
	return "AudioStoreAccount [name=" + name + ", accountId=" + accountId + ", balance=" + balance + ", itemList="
			+ itemList + "]";
}
public boolean addItem(AudioItem newItem) {
	double itemPrice=newItem.getPrice();
	if (balance >=itemPrice){
		balance -= itemPrice;
	boolean success=itemList.add(newItem);
	 if(success) {
		 AudioStoreAccount.totalMoneySpent +=itemPrice;
	 }
	 return success;
	}else {
		System.out.println("Insufficient Funds");
		return false;
	}
}
public boolean removeItem(AudioItem newItem) {
	return itemList.remove(newItem);
}
public static double getTotalMoneySpent() {
	return AudioStoreAccount.totalMoneySpent;
}
}
