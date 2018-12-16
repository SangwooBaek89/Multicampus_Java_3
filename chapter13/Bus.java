package chapter13;

public class Bus implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("bus run");
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크합니다.");
	}

}
