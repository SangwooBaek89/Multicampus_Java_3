package chapter12_타입변환_다형성.vehicle;

public class Truck extends Vehicle{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("truck run");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("truck stop");
	}
}
