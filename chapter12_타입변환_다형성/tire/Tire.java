package chapter12_타입변환_다형성.tire;

public class Tire {
	public int maxRotation;
	public int accumulatedRoation;
	public String location;

	public Tire(int accumulatedRoation, String location) {
		this.accumulatedRoation = accumulatedRoation;
		this.location = location;
		maxRotation = 10;
	}
	
	public boolean roll() {
		++accumulatedRoation;
		if(accumulatedRoation < maxRotation) {
			System.out.println((location + " Tire의 현재 rotation 값 : "  + accumulatedRoation + "회"));
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
