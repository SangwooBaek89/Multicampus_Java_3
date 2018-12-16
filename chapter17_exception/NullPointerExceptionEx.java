package chapter17_exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(args.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("array out of index error");
		} catch (NumberFormatException e) {
			System.out.println("num format error");
		}

		
	}
}
