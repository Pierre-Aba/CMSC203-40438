
public class CheckingAccount extends BankAccount{
private static final double FEE = .15;

	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount+FEE <= getBalance())
		{
			setBalance(getBalance()-FEE-amount);
		}
		else
		{
			completed = false;
		}
		return completed;
	}
}
