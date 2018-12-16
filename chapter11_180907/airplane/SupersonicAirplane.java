package chapter11_180907.airplane;

public class SupersonicAirplane extends Airplane{
	
	/*
	문제점 : flyMode가 int형이라 1, 2외에 아무거나 올 수 있음...
	public static final int NORMAL = 1;
	public static final int SUPER = 2;
	public int flyMode = NORMAL;
	*/
	
	private FlyMode flyMode = FlyMode.NORMAL;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == FlyMode.SUPER) {
			System.out.println("super flying...");
		} else {
			super.fly();
		}
	}

	public FlyMode getFlyMode() {
		return flyMode;
	}

	public void setFlyMode(FlyMode flyMode) {
		this.flyMode = flyMode;
	}
}
