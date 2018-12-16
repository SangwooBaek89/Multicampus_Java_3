package chapter17_exception;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceinsufficientException {
		if (balance < money) {
			throw new BalanceinsufficientException("잔고부족 : " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
