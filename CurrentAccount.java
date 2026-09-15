package Project2;

public class CurrentAccount extends Account {

    public CurrentAccount(long accountNumber, int pin, double balance,Customer customer) {
        super(accountNumber, pin, balance,customer);
    }
    
    @Override
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
    	        System.out.println("Withdrawal Successful!");
    	        System.out.println("Remaining Balance: " + getBalance());
    	    }
    }
}
