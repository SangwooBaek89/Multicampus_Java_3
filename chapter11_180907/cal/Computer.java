package chapter11_180907.cal;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("children");
		return 3.14159 * r * r;
	}
}
