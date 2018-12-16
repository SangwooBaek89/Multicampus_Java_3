package chapter12_타입변환_다형성.tire;

/*
 * OCP = 전략패턴 (기능 확장에 열려 있음, 수정은 안됨)
 *  - 객체간의 coupling은 약해야 함
 */
public class Car {
	// 필드의 다형성
	Tire[] tires = new Tire[]{
			new Tire(7, "frontLeft"),
			new Tire(7, "frontRight"),
			new Tire(7, "rearLeft"),
			new Tire(7, "rearRight")
	};

	int run() {
		System.out.println("run...");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("stop...");
	}
}
