package chapter12_타입변환_다형성.abstractEx;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		// TODO Auto-generated constructor stub
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("turn on");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
}
