package test.ch07.poly;

public class Person {
	// 필드
	public String name;

	// 생성자
	// 매개변수를 필드 값을 넣음
	public Person(String name) {
		this.name = name;
	}

	// 메소드
	public void walk() {
		System.out.println("걷습니다.");
	}
}
