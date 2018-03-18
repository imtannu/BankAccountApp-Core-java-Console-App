package BankAccountApp;

public abstract class account implements IBaseRate {
	
// List common Properties for both checking and savings account
	String name;
	String aadhaar;
	double balance;
	static int index = 10000;
	String accountNumber;
	double rate;
	
// Constructor to set base properties and  the account
	public account(String name, String aadhaar, double initDeposit) {
		this.name = name;
		this.aadhaar = aadhaar;
		this.balance = initDeposit;
		setRate();
		
// set Account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
// method to generate common account number	
	private String setAccountNumber() {
		String  lastTwoOfaadhaar = aadhaar.substring(aadhaar.length()-2, aadhaar.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
         return lastTwoOfaadhaar + uniqueID + randomNumber;	
	}
	
	public void compound() {
		double AccuredIntrest = balance * (rate/100);
		balance = balance + AccuredIntrest;
		System.out.println("Accured Intrest: " + AccuredIntrest);
		showBalance();
	}
	
// List Common methods - Transactions
	public void deposit(double deposit) {
		balance = balance + deposit;
		System.out.println("---------------------------------------");
		System.out.println("Deposit of Rs :" + deposit + " is Successful...");
		showBalance();
	}
	public void withdraw(int withdrow) {
		balance = balance - withdrow ;
		System.out.println("---------------------------------------");
		System.out.println("withdrawal of Rs:" + withdrow + " is Successful...");
		showBalance();
	}
	public void transfer(String toWhom, double tranfer) {
		balance = balance - tranfer;
		System.out.println("---------------------------------------");
		System.out.println("Tranfer of Rs: " + tranfer + " is Successfully Transfered to " + toWhom);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Now Your Account Balance Is : " + balance);
		System.out.println("------------------------------------");
	}
	
// show common info for both accounts 	
	public void showInfo() {
		
		System.out.println("\nAccount Information:\n");
		System.out.println(
				" Account Name :  " +  name +
				"\n Account Number : " + accountNumber +
				"\n Account Balance : " + balance +
				"\n Intrest Rate :  " + rate
				);	
		System.out.println("\n---------------------------------------");
	}
}
