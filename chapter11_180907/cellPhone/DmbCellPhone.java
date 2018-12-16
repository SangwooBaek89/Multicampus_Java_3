package chapter11_180907.cellPhone;

public class DmbCellPhone extends CellPhone {
	private int channel;

	public DmbCellPhone(String model, String color, int channel) {
		// TODO Auto-generated constructor stub
		super(model, color);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println(channel);
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel);
	}

	void turnOffDb() {
		System.out.println("Dmb");
	}
}
