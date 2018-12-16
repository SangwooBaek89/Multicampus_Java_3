package chapter16_중첩;

import chapter16_중첩.Button.OnClickListener;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println(("exit"));
				System.exit(0);
			}
		});
	}
}
