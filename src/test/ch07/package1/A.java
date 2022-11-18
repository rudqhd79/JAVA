package test.ch07.package1;

/*protected는 상속 관계,
 * 같은 패키지 일 때 접근이 가능하다
 * (필드, 생성자, 메소드)*/
public class A {
	//필드
	protected String field;
	
	//생성자
	protected A() {}
	
	//메소드
	protected void method() {}
	
}
