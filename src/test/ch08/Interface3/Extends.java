package test.ch08.Interface3;

public class Extends {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		A ia = impl;	//자동 형변환
		ia.methodA();
		
		B ib = impl; //자동 형변환
		ib.methodB();
		
		C ic = impl; //자동 형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
