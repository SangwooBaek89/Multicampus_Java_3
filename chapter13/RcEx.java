package chapter13;

public class RcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new RemoteControl() {
			String name = "anoymous";
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("name : " + name + " on");
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println(name + " off");
			}
			
			@Override
			public void setVolum(int volume) {
				// TODO Auto-generated method stub
				equalize(volume);
				System.out.println(volume + " set");
			}
			
			public void equalize(int volume) {
				System.out.println("classic mode");
			}
		};
	}

}
