package BankAccountApp;

public class saving extends account{
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// List properties specific to saving account
	
	
	// Constructor to initialize settings account properties
	
	public saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
	
		accountNumber = "1" + accountNumber;
		SafetyDepositBox();
	}
	
// set the rate 
		public void setRate() {
			rate = getBaseRate() * .25;
		}
		
	private void SafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
// list  methods to specific to saving account -
	public void showInfo() {
		System.out.println("Saving Account Created Successfully...");
		super.showInfo();
		System.out.println(" Your Saving Account Features:\n " +
	                   "\nSafety Deposit Box ID : " + safetyDepositBoxID +
	                   "\nSafety Deposit Box Key: " + safetyDepositBoxKey 
	                   );
	}
}
