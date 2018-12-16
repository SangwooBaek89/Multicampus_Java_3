package chapter17_exception;

public class ThrowsEx {
/*
 * 예외처리를 findclass에서 안하면 메인메소드는 에러 표시 안함 : finclass가 책임
 * 
 */
	public static void main(String[] args) {
		// TO Auto-generated method stub
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void findClass() throws ClassNotFoundException {
		
			Class cls = Class.forName("java.lang.String2");
		
	}
}
