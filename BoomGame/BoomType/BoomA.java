package BoomGame.BoomType;

import BoomGame.WarField;

public class BoomA extends Boom{
	
	public BoomA() {
		// TODO Auto-generated constructor stub
		super('A', "A형 폭탄");
	}

	@Override
	public void boom(WarField field, int x, int y) {
		field.mark(x-1, y);
		field.mark(x+1, y);
		field.mark(x, y-1);
		field.mark(x, y+1);
		field.mark(x, y, type);
	}

}
