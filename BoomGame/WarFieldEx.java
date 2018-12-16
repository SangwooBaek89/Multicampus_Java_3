package BoomGame;

import java.util.Random;
import BoomGame.BoomInterface.BoomImpossible;
import BoomGame.BoomInterface.BoomPossible;
import BoomGame.BoomType.*;
import BoomGame.MyBoom.AppleBoom;
import BoomGame.MyBoom.GrapeBoom;
import BoomGame.MyBoom.MyBoom;
import BoomGame.MyBoom.PeachBoom;

public class WarFieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarField field = new WarField(10);
		MyBoom arrBoom[] = new MyBoom[] { 
				new AppleBoom(2, 2), 
				new GrapeBoom(4, 5), 
				new PeachBoom(7, 8)
				};

		/*
		 * 이 부분 간결하게 정리할 것!!
		 */
		Class[] cls = { BoomGame.BoomType.BoomA.class, BoomGame.BoomType.BoomB.class, BoomGame.BoomType.BoomC.class,
				BoomGame.BoomType.BoomD.class };

		Random random = new Random();

		for (int i = 0; i < arrBoom.length; i++) {
			int sel = random.nextInt(cls.length);
			try {
				Boom tempBoom = (Boom) cls[sel].newInstance();
				arrBoom[i].setIFboomType(tempBoom);
			} catch (Exception e) {
				System.out.println("error occur");
				e.printStackTrace();
			}
		}

		// 속성 부여
		arrBoom[0].setIFboom(new BoomPossible());
		arrBoom[1].setIFboom(new BoomPossible());
		arrBoom[2].setIFboom(new BoomPossible());

		// 폭탄 드랍
		for (int i = 0; i < arrBoom.length; i++) {
			field.underAttack(arrBoom[i]);
			System.out.println();
			System.out.println(arrBoom[i].toString());
		}
		// 맵 상태 표시

		System.out.println();

		field.print();

		System.out.println();

		System.out.println("피해받지 않은 곳 수 : " + field.safeZoneNumPrint());
	}

}
