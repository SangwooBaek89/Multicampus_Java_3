package BoomGame.MyBoom;

import BoomGame.WarField;
import BoomGame.BoomInterface.IFboom;
import BoomGame.BoomType.IFboomType;

public class MyBoom {
	IFboomType IFboomType;
	IFboom IFboom;
	String name;
	int x;
	int y;
	
	public MyBoom() {
		// TODO Auto-generated constructor stub
	}

	public MyBoom(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public IFboomType getIFboomType() {
		return IFboomType;
	}

	public void setIFboomType(IFboomType iFboomType) {
		IFboomType = iFboomType;
	}

	public IFboom getIFboom() {
		return IFboom;
	}

	public void setIFboom(IFboom iFboom) {
		IFboom = iFboom;
	}

	public boolean actionAttack() {
		return this.IFboom.attack();
	}
	
	public void myBoomBoom(WarField field) {
		IFboomType.boom(field, this.x, this.y);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String boomState;
		if(actionAttack()) boomState = "정상";
		else boomState = "불량";
		String str = "name : " + name + ", 부여 속성 : " + IFboomType.getName() + ", 상태 : " + boomState;
		return str;
	}
}
