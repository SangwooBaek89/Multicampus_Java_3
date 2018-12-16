package chapter11_180907.airplane;

public class AirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		
		sa.setFlyMode(FlyMode.SUPER);
		sa.fly();
		
		sa.setFlyMode(FlyMode.NORMAL);
		sa.fly();
		
		/*
		필드는 private으로 보호해야 하며, 수정 시 setter를 통해 접근해야 함.
		sa.flyMode = FlyMode.SUPER;
		sa.fly();
		
		sa.flyMode = FlyMode.NORMAL;
		sa.fly();
		*/
	}

}
