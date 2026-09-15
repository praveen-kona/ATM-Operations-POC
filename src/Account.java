package Project2;

public class Account {

	private  Customer customer;
	private long accountNumber;
	private int pin;
	private double balance;
	
	public Account(long accountNumber,int pin,double balance,Customer customer)
	{
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.balance=balance;
		this.customer=customer;
	}
	
	//getters and setters
	
	public Customer getCustomer() {
	    return customer;
	}
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	
	public  void setPin(int pin)
	{
		this.pin=pin;
	}
	public int getPin()
	{
		return pin;
	}
	protected void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void withdraw(double amount)
	{
		if (amount <= 0) {
	        System.out.println("Invalid withdrawal amount!");
	    }
	    else if (amount > getBalance()) {
	        System.out.println("Insufficient balance!");
	    }
	    else {
	        setBalance(getBalance() - amount);
	    }
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			setBalance(getBalance()+amount);
		}
		else
		{
			System.out.println("Invalid deposit amount!");
		}
	}
}
