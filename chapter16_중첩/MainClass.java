package chapter16_중첩;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o1 = new Outer();
		o1.test(100);
		Outer o2 = new Outer();
		o2.test(200);;
		
		System.out.println(o1.num1);
		System.out.println(o2.num1);
		
		o1.inner.test(1000);
		o2.inner.test(2000);
		System.out.println(o1.num1);
		System.out.println(o2.num1);
	}

}
