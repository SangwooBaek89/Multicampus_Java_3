package chapter12_타입변환_다형성.vehicle;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Truck());
	}

}
