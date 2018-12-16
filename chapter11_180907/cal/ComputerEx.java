package chapter11_180907.cal;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;

		Calculator cal1 = new Calculator();
		System.out.println(cal1.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
	}

}
