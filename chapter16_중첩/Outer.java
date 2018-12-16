package chapter16_중첩;

public class Outer {
	int num1;
	
	Inner inner = new Inner();
	
	class Inner{
		public void test(int num) {
			num1 = num;
		}
	}
	
	public void test(int num) {
		inner.test(num);
	}
}
