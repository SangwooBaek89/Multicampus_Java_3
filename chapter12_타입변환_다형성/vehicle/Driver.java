package chapter12_타입변환_다형성.vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		vehicle.stop();
	}
}
