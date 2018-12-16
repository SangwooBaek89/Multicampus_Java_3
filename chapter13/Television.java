package chapter13;

public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF");

	}

	@Override
	public void setVolum(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("current tv vol " + volume);

	}

}
