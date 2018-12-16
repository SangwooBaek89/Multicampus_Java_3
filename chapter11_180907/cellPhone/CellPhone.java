package chapter11_180907.cellPhone;

public class CellPhone {
	private String model;
	private String color;

	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("power on");
	}

	void powerOff() {
		System.out.println("power off");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void bell() {
		System.out.println("bell");
	}

	void sendVoice(String msg) {
		System.out.println("send voice : " + msg);
	}
}
