package chapter13;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi  = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("truck run");
			}
		});
		
		Vehicle vehicle = new Taxi();
		Bus busEx = (Bus) vehicle;
		/*if(vehicle instanceof Bus) {
			Bus busEx = (Bus) vehicle;
			busEx.checkFare();
		}else {
			System.out.println("casting error");
		}*/
	}
}	
