package chapter12_타입변환_다형성;

public class Child extends Parent{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("child - method1");
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("child - method2");
	}
	
	public void method3() {
		System.out.println("child - method3");
	}

}
