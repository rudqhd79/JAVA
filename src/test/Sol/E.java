package test.Sol;

public class E extends C {


	@Override
	public  void method4() {}

	
	public static void main(String[] args) {
		B b = new B();
		D d = new D();
		b.method1();
		d.method3();
		
		C c = new E();
		E e = new E();
		c.method2();
		e.method4();
	}
}
