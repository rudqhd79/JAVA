package test.ch07.poly;

//Person은 슈퍼클래스 Student는 서브클래스
public class Student extends Person {
	// 필드
	public int studentNo; // 학번

	// 생성자
	// 생성자의 매개변수는 슈퍼클래스의 매개변수와 같다
	// 다만, 생성자의 매개변수 in StudentNo는 오직 서브클래스의 매개변수이기 때문에
	// int StudentNo를 쓰려면 강제변환을 해야 한다
	public Student(String name, int StudentNo) {
		super(name); // 부모 클래스의 생성자 호출 (매개변수 name호출)
		// this는 필드 값
		this.studentNo = StudentNo;
	}

	// 메소드
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
