package chapter13;

public class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("audio on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("audio off");
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("current audio vol " + volume);

	}

}
