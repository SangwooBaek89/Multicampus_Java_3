package chapter17_exception;

public class BalanceinsufficientException extends Exception {
	public BalanceinsufficientException() {
		
	}
	
	public BalanceinsufficientException(String msg) {
		super(msg);
	}
}
