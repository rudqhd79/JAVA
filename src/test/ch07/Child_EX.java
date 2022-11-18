package test.ch07;

public class Child_EX {

	public static void main(String[] args) {
	 //자식 객체
//		Child child = new Child();
		
		//자동 타입 변환 (부모가 자식을 품고 있다)
//		Parent parent = child;
		
		/*method1은 자동형변*/
//		parent.method1();
		
		/*자동 타입 변환이 일어났을 때는
		 * 부모객체에서 method2를 호출하는데
		 * 오버라이드 된 것만 호출한다*/
//		parent.method2();
		
		/*자동 형변환이 있으면 자식 객체에 있는
		 * 필드, 메소드를 불러오지 못한다*/
//		parent.method3();
		
//		parent.a = 2;
		
		/*부모 클래스에 선언된 b가 없기 때문에
		 불러오지 못한다
		 (자식 객체에 있는 필드는 불러오지 못한다)*/
//		parent.b = 1;
		
		//------------------------자동 타입변환-----------------
		//------------------------강제 타입변환-----------------
	
		Parent parent1 = new Child(); // 자동 타입변환

		// instanceof: 객체타입 확인을 위한 자바에서 제공하는 연산자

		// parent가 Child객체를 담고 있는지 물어보는 것
		if(parent1 instanceof Child){
			Child child1 = (Child) parent1; // 강제 타입변환
			child1.b = 1; // 자식 객체에 있는 필드에 접근 가능
			child1.method2(); // 자식 메소드에 있는 필드에 접근 가능
			child1.method3(); // 자식 메소드에 있는 필드에 접근 가능
			 //parent가 Child 타입이 아니라면 강제타입 변환을 할 수 없으므로	 
			
		}
	}
}
