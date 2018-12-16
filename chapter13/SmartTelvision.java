package chapter13;

public class SmartTelvision implements RemoteControl, Searchable {
	private int volume;

	public SmartTelvision() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("smart tv search method");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("smart tv turn on method");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("smart tv turn off method");
	}

	@Override
	public void setVolum(int volume) {
		// TODO Auto-generated method stub
		System.out.println("smart tv set volume method");
	}

}
