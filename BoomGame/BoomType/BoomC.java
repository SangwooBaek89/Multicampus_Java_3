package BoomGame.BoomType;

import BoomGame.WarField;

public class BoomC extends Boom{

	public BoomC() {
		// TODO Auto-generated constructor stub
		super('C', "C형 폭탄");
	}

	@Override
	public void boom(WarField field, int x, int y) {
		// TODO Auto-generated method stub
		new BoomB().boom(field, x, y);
		field.mark(x-3, y);
		field.mark(x, y-3);
		field.mark(x+3, y);
		field.mark(x, y+3);
		field.mark(x, y, type);
	}

}
