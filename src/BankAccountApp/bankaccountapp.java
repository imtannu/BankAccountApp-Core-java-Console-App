package BankAccountApp;

//import java.util.Scanner;

public class bankaccountapp {

	public static void main(String[] args) {
		
		BankService service = new BankService();
		service.service();
	
		/*	Scanner sc = new Scanner(System.in);
		System.out.println("Account Opening Application : \n1. Saving Account \n2. Checking Account ");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Enter First Name: ");
			sc.nextLine();
			String fname = sc.nextLine();
			System.out.println("Enter 12 digit Aadhaar Number:");
			String aadhaar = sc.nextLine();
			System.out.println("Enter Deposit Amount:");
			int deposit = sc.nextInt();
			saving savacc1 = new saving(fname,aadhaar,deposit);
			System.out.println("**********************************************");
			savacc1.showInfo();
			savacc1.compound();
			
			System.out.println("Transaction Options: \n1. Deposit \n2. Withdraw \n3. Money Transfer \n Select Transaction Number: ");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("Enter Deposit Amount: ");
				double dep = sc.nextDouble();
				savacc1.deposit(dep);
			}
			if(ch==2) {
				System.out.println("Enter Withdrow Amount: ");
				int wid = sc.nextInt();
				savacc1.withdraw(wid);
			}
			if(ch==3) {
				System.out.println("Enter Transferee Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter Transfer Amount: ");
				double transamt = sc.nextDouble();
				savacc1.transfer(name, transamt);
			}
		}
		
		if(choice==2) {
			System.out.println("Enter First Name: ");
			sc.nextLine();
			String fname = sc.nextLine();
			System.out.println("Enter 12 digit Aadhaar Number:");
			String aadhaar = sc.nextLine();
			System.out.println("Enter Opening Deposit Amount:");
			int deposit = sc.nextInt();
			checking chekacc1 = new checking(fname,aadhaar,deposit );
			System.out.println("**********************************************");
			chekacc1.showInfo();
			chekacc1.compound();
			
			System.out.println("Transaction Options: \n1. Deposit \n2. Withdraw \n3. Money Tranfer \n Select Transaction Number: ");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("Enter Opening Deposit Amount: ");
				double dep = sc.nextDouble();
				chekacc1.deposit(dep);
			}
			if(ch==2) {
				System.out.println("Enter Withdrow Amount: ");
				int wid = sc.nextInt();
				chekacc1.withdraw(wid);
			}
			if(ch==3) {
				System.out.println("Enter Transferee Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter Transfer Amount: ");
				double transamt = sc.nextDouble();
				chekacc1.transfer(name, transamt);
			}
		}
		*/
	}
}
