package chapter13;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc; 
		rc = new Television();
		rc.turnOff();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		
		SmartTelvision st = new SmartTelvision();
		RemoteControl rc2 = st;
		rc2.turnOn();
		Searchable sa = st;
		sa.search("test");
	}

}
