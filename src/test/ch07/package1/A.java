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

//상속을 통해 알 수 있는 점은

//protected는 상속관계 && 같은 패키지에 있지 않으면 사용이 불가하다
/*상속된 서브클래스가 super();
(빈칸은 생성자 또는
메소드 의미 || .을 통한 사용은
필드값이나 선언된 값을 쓸 때 의미)
를 사용하면 부모클래스의
 필드, 메소드를 쓸 수 있다!*/ 
//상속을 통해 부모클래스에서 가져올 때 super나 this를 대신 사용 할 수 있다
 