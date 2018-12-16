package BoomGame;

import BoomGame.MyBoom.MyBoom;

public class WarField {
	private int field[][];
	
	public WarField(int size) {
		field = new int[size][size];
	}
	
	//폭탄을 떨어뜨릴 수 있는 인덱스인지 확인합니다.
	public boolean isIn(int x, int y) {
		if(((x >= 0) && (x < field.length)) && ((y >= 0) && (y < field[0].length))) {
			return true;
		}
		return false;
		
	}
	
	public void underAttack(MyBoom myBoom) {
		if(myBoom.actionAttack()) myBoom.myBoomBoom(this);
	}
	
	public void mark(int x, int y) {
		if((isIn(x, y)) && field[x][y] == 0) {
			field[x][y] = 1;
		}
	}
	
	public void mark(int x, int y, int type) {
		if(isIn(x, y)) field[x][y] = type;
	}
	
	public void print() {
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field[i].length; j++) {
				if(field[i][j] == 0 || field[i][j] == 1) {
					System.out.print(field[i][j] + " ");
				}else {
					System.out.print((char)field[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public int safeZoneNumPrint() {
		int result = 0;
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field[0].length; j++) {
				if(field[i][j] == 0) result++;
			}
		}
	return result;
	}
}
