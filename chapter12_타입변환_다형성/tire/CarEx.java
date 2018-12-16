package chapter12_타입변환_다형성.tire;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		for(int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0 && problemLocation % 2 == 0) {
				car.tires[problemLocation - 1] = new HankookTire(5, car.tires[problemLocation - 1].location); 
				System.out.println(car.tires[problemLocation - 1].location + " tire를 HankookTire로 변환, rotation value : " + car.tires[problemLocation - 1].accumulatedRoation);
			}else if(problemLocation != 0 && problemLocation % 2 == 1) {
				car.tires[problemLocation - 1] = new KumhoTire(5, car.tires[problemLocation - 1].location);
				System.out.println(car.tires[problemLocation - 1].location + " tire를 KumhoTire로 변환, rotation value : " + car.tires[problemLocation - 1].accumulatedRoation);
			}
		
		}
	}

}
