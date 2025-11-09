import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account  acc = new Account(1001, "Caue", 2000.0);
		System.out.println("acc balance: " + acc.getBalance());
		BusinessAccount bacc = new BusinessAccount(1002, "Junior", 0.0, 500.0);
		
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Black", 2000.0, 500.0);
		System.out.println("acc3 balance: " + acc2.getBalance());
		Account acc3 = new SavingsAccount(1004, "Chorine", 2000.0, 0.1);
		System.out.println("acc3 balance: " + acc3.getBalance());
		System.out.println("--------------------");
		
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
		
		// Testing different withdraws methods
		
		acc.withdraw(100);
		acc2.withdraw(100);
		acc3.withdraw(100);
		
		
		System.out.println("acc standard balance update: " + acc.getBalance());
		System.out.println("acc2 business balance update: " + acc2.getBalance());
		System.out.println("acc3 Savings balance update: " + acc3.getBalance());
		sc.close();

	}

}
