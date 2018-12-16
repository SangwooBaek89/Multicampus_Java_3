package chapter17_exception;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.deposit(10000);
		System.out.println("deposit : " + ac.getBalance());
		
		try {
			ac.withdraw(30000);
		} catch(BalanceinsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println();
			e.printStackTrace();
		}
	}

}
