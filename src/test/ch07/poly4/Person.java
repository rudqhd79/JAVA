package test.ch07.poly4;

public class Person {
	// 필드
	public String name;

	// 생성자
	// 매개변수를 필드 값을 넣음
	public Person(String name) {
		//this를 할 수 있는 이유는 필드값이기 때문이다
		//만약 지금과 다른 매개변수를 넣고 this를 쓰려면 필드에 매개변수를 똑같이 선언해야한다
		this.name = name;
	}

	// 메소드
	public void walk() {
		System.out.println("걷습니다.");
	}
}
