package BoomGame.BoomType;
import BoomGame.WarField;

public abstract class Boom implements IFboomType{
	private String name;
	// 상속 사용 시 필드 접근제한자는 protected로
	protected char type;

	
	public Boom(char type, String name) {
		super();
		this.type = type;
		this.name  = name;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public abstract void boom(WarField field, int x, int y);

}
