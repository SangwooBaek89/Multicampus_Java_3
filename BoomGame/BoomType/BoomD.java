package BoomGame.BoomType;

import BoomGame.WarField;

public class BoomD extends Boom{

	public BoomD() {
		// TODO Auto-generated constructor stub
		super('D', "D형 폭탄");
	}

	@Override
	public void boom(WarField field, int x, int y) {
		// TODO Auto-generated method stub
		field.mark(x-1, y-1);
		field.mark(x+1, y+1);
		field.mark(x+1, y-1);
		field.mark(x-1, y+1);
		field.mark(x, y, type);
		
	}

}
