package BoomGame.BoomType;

import BoomGame.WarField;

public class BoomB extends Boom {

	public BoomB() {
		// TODO Auto-generated constructor stub
		super('B',"B형 폭탄");
	}
	
	@Override
	public void boom(WarField field, int x, int y) {
		// TODO Auto-generated method stub
		new BoomA().boom(field, x, y);
		field.mark(x-2, y+0);
		field.mark(x+0, y-2);
		field.mark(x+2,y+0);
		field.mark(x+0,y+2);
		field.mark(x, y, type);
	}

}
