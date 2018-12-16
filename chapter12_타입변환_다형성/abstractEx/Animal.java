package chapter12_타입변환_다형성.abstractEx;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("breathe");
	}
	public abstract void sound();
}
