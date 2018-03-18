package BankAccountApp;

public class checking extends account {
	
// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
// Constructor to initialize settings account properties
	
	public checking(String name, String sSN, double initDeposit) {
		super(name , sSN , initDeposit);
		
		accountNumber = "2" + accountNumber;
		setDebitcard();
		}
	
 // set the Base rate 
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
	
// list any methods to specific to saving account	
	  private void setDebitcard()
	  {
		  debitCardNumber = (int) (Math.random() * Math.pow(10, 12)); 
		  debitCardPin = (int) (Math.random() * Math.pow(10, 4)); 
	  }
	  
// list any methods to specific to checking account	
	public void showInfo() {
		System.out.println("Checking Account Created Successfully...");
		super.showInfo();
				System.out.println("Your CHECKING Account feature:\n " +
		                  "\nDebit Card Number: "+ debitCardNumber + 
		                  "\nDebit Card Pin: " + debitCardPin
		                  );
	}
	
}
