package chapter12_타입변환_다형성;

public class ParentChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Parent parent = child;
		//parent.method1();
		//parent.method2();
		//parent.method3();
		
		Parent parent2 = new Parent();
		test(child);
		test(parent);
		test(parent2);
	}
	public static void test(Parent p) {
		p.method2();
	}

}
