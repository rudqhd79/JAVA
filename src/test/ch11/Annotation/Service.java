package test.ch11.Annotation;

public class Service {
	//필드
	//@PrintAnnotation를 필드에도 적용 시킬 수 있다
	String test;
	
	//생성자
	//@PrintAnnotation를 생성자에도 적용 시킬 수 있다
	Service() {}
	
	//메소드
	//@PrintAnnotation는 Annotation 파일하고 연동시키는 것이다
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	
	//value와 number를 어노테이션으로 값을 넘겨줄 수도 있다
	@PrintAnnotation(value="#", num=20)
	public void method3() {
		System.out.println("method3");
	}

}
