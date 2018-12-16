package chapter13;

public class Car {
	Tire tires[];
	
	public Tire[] getTires() {
		return tires;
	}

	public void setTires(int index, Tire tire) {
		this.tires[index] = tire;
	}

	// TODO Auto-generated method stub
	public Car(Tire tires[]) {
		this.tires = tires;
		
	}
	
	void run() {
		for(Tire t : tires) t.roll();
	}
}
