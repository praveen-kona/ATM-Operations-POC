package Project2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ATM implements ATMOperations{
	
	private Account account;
	private Scanner sc;
	
	public ATM(Account account,Scanner sc)
	{
		this.account=account;
		this.sc=sc;
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance: "+account.getBalance());
		
	}

	@Override
	public void withdraw() {
		
		try
		{
			System.out.println("Enter withdrawal amount: ");
			double amount=sc.nextDouble();
			account.withdraw(amount);
		}
		
			catch (InputMismatchException e) {
			    System.out.println("Please enter a valid number!");
			    sc.nextLine();
		}
		
		
	}

	@Override
	public void deposit() {
		try
		{
			System.out.println("Enter deposit amount: ");
			double amount=sc.nextDouble();
			account.deposit(amount);
		}
		catch (InputMismatchException e) {
		    System.out.println("Please enter a valid number!");
		    sc.nextLine();
		}
		
		
	}
		
		
	

	@Override
	public void changePin() {
		
		try
		{
			System.out.println("Enter Current PIN: ");
			int currentPin=sc.nextInt();
			if(currentPin==account.getPin())
			{
				System.out.println("Enter New PIN: ");
				int newPin=sc.nextInt();
				if(newPin>=1000 && newPin<=9999)
				{
					System.out.println("Confirm new PIN: ");
					int confirmationPin=sc.nextInt();
					if(newPin==confirmationPin)
					{
						account.setPin(newPin);
						System.out.println("PIN changed successfully!");
					}
					else
					{
						System.out.println("New PINs do not match!");
					}
				}
				else
				{
					System.out.println("Invalid New PIN! PIN must be 4 digits.");
				}
				
				
			}
			else
			{
				System.out.println("Invalid current PIN!");
			}
			
			
		}
		catch (InputMismatchException e) {
		    System.out.println("Please enter a valid 4-digit PIN!");
		    sc.nextLine();
		}
		}
}
