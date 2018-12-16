package chapter12_타입변환_다형성.tire;

public class HankookTire extends Tire{

	public HankookTire(int accumulatedRoation, String location) {
		super(accumulatedRoation, location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRoation;
		if(accumulatedRoation < maxRotation) {
			System.out.println((location + " 한국 Tire 현재 rotation 값 : "  + (maxRotation - accumulatedRoation) + "회"));
			return true;
		}else {
			System.out.println("*** " + location + " 한국 Tire 펑크 ***");
			return false;
		}
	}

}
