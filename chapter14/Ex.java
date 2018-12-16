package chapter14;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		InterfaceA ia = impl;
		InterfaceB ib = impl;
		InterfaceC ic = impl;
		
		ia.methodA();
		ib.methodB();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
