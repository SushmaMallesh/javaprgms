package customexception.com;

public class Sbi implements Atm{
	public static void main(String[] args) {
	private double balance;
	{
		this.balance=1000;
	}
public double withdrawal (double amount)throws Atmexp{
	if(amount<=0) {
		throw new Atmexp(amount+"not available in account");
	}
	balance=balance-amount;
	return balance;
}
}
}