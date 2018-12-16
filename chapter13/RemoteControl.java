package chapter13;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolum(int volume);
	
	default void setMute(boolean mute) {
		if(mute) System.out.println("mute");
		else System.out.println("no mute");
	}
	
	static void changeBattery() {
		System.out.println("change battery");
	}
}
