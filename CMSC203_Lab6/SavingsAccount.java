
public class SavingsAccount extends BankAccount{

	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber()+"-"+savingsNumber;
		
	}
	
	public void postInterest()
	{
		deposit(rate/12.0 *getBalance()); // can use expression as deposit argument
		
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount sa, double balance)
	{
		super(sa, balance);
		savingsNumber = ++sa.savingsNumber;
		this.accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
}
