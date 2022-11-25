package test.ch11.Object_EX;

//아무것도 없어도 extends Object가 있는 것과 같다
// public class Member extends Object와 같다
//따라서 아무것도 안적혀 있어도 Override 할 수 있다
public class Member {

	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	//논리적 동등 만들기: 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		//obj가 Member를 갖고 있는지?
		if(obj instanceof Member) {
			//target은 Member 타입인 obj이다
			Member target = (Member)obj;	//강제 형변환(부모타입이 자식타입으로 변환됨)
			
			//target.id는 슈퍼클래스 Object가 서브클래스의 id를 가지는 것이다
			if (id.equals(target.id)) {	//여기서의 equals는 String의 quals(순수하게 문자값 비교)
				return true;
			}
	}
		return false;
	}
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		//Object 최상위 객체 생성가능
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		//obj1과 obj2는 주소가 같기 때문에 equals나 ==으로 비교를 해보면 모두 '같다'라는 결과가 나온다
		System.out.println(obj1.equals(obj2));	//번지수 비교
		System.out.println(obj1 == obj2);	    //번지수 비교
		
		String a = "1";
		String b = "2";
		if(a == b); // "=="주소를 비교
		if (a.equals(b));	//".equals" 값을 비교
		//논리적 동등 : 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
	}
	*/
}
