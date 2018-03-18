package BankAccountApp;
import java.util.Scanner;
public class BankService {

	Scanner sc = new Scanner(System.in);
	public void service(){
		while(true) {
			System.out.println("-----------------------------------------");
	System.out.println("Account Opening Menu: \n\n1. Saving Account \n2. Cheking Account \n0. Exit \n\npress Choice Number(1/2):");
	int choice = sc.nextInt();
	if(choice==1) {
		System.out.println("\n---------------------------------------");
		System.out.println("Enter Full Name: ");
		sc.nextLine();
		String fname = sc.nextLine();
		System.out.println("\n---------------------------------------");
		System.out.println("Enter 12 digit Aadhaar Number:");
		String aadhaar = sc.nextLine();
		System.out.println("\n---------------------------------------");
		System.out.println("Enter Deposit Amount:");
		int deposit = sc.nextInt();
		saving savacc1 = new saving(fname,aadhaar,deposit);
		System.out.println("\n**********************************************");
		savacc1.showInfo();
		savacc1.compound();
		
		while(true) {
		System.out.println("\nTransaction Menu: \n\n1. Deposit \n2. Withdraw \n3. Money Tranfer \n0. Exit Transaction Menu \n\n Select Transaction Number: ");
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Deposit Amount: ");
			double dep = sc.nextDouble();
			savacc1.deposit(dep);
		}
		if(ch==2) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Withdrow Amount: ");
			int wid = sc.nextInt();
			savacc1.withdraw(wid);
		}
		if(ch==3) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Transferee Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Transfer Amount: ");
			double transamt = sc.nextDouble();
			savacc1.transfer(name, transamt);
		}
		if(ch==0) {break;}
	}
	}
	
	if(choice==2) {
		System.out.println("\n---------------------------------------");
		System.out.println("Enter Full Name: ");
		sc.nextLine();
		String fname = sc.nextLine();
		System.out.println("\n---------------------------------------");
		System.out.println("Enter 12 digit Aadhaar Number:");
		String aadhaar = sc.nextLine();
		System.out.println("\n---------------------------------------");
		System.out.println("Enter Opening Deposit Amount:");
		int deposit = sc.nextInt();
		checking chekacc1 = new checking(fname,aadhaar,deposit );
		System.out.println("**********************************************");
		chekacc1.showInfo();
		chekacc1.compound();
		
		while(true) {
		System.out.println("\nTransaction Menu: \n\n1. Deposit \n2. Withdraw \n3. Money Tranfer \n0. Exit Transaction Menu\n\nSelect Transaction Number: ");
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Deposit Amount: ");
			double dep = sc.nextDouble();
			chekacc1.deposit(dep);
		}
		if(ch==2) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Withdrow Amount: ");
			int wid = sc.nextInt();
			chekacc1.withdraw(wid);
		}
		if(ch==3) {
			System.out.println("---------------------------------------");
			System.out.println("Enter Transferee Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Transfer Amount: ");
			double transamt = sc.nextDouble();
			chekacc1.transfer(name, transamt);
		}
		if(ch==0) {break;}
	}
	}
	if(choice==0) {
		System.exit(0);
	}
}
}
}
	
	

