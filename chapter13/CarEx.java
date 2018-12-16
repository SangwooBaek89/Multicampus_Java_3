package chapter13;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tires[] = {
				new HankookTire(),
				new HankookTire(),
				new HankookTire(),
				new HankookTire()
		};
		
		Car myCar = new Car(tires);
		myCar.setTires(3, new KumhoTire());
		myCar.run();
		System.out.println("-----------");
		Car yourCar = new Car(tires);
		yourCar.setTires(1, new Tire() {
			@Override
			public void roll() {
				// TODO Auto-generated method stub
				System.out.println("unknown new tire");
			}
		});
		yourCar.run();

	}

}
