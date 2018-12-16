package chapter12_타입변환_다형성.tire;

public class KumhoTire extends Tire{

	public KumhoTire(int accumulatedRoation, String location) {
		super(accumulatedRoation, location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRoation;
		if(accumulatedRoation < maxRotation) {
			System.out.println((location + " 금호타이어의 현재 rotation 값 : "  + accumulatedRoation + "회"));			return true;
		}else {
			System.out.println("*** " + location + " 금호타이어 Tire 펑크 ***");
			return false;
		}
	}

}
