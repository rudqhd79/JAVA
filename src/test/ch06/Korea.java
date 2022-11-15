package test.ch06;

//자바에서 상수는 불변의 값(final), 공유해서 사용 가능(전역변수로 사용 가능한 static)
public class Korea {
	// final 필드
	final String nation = "대한민국";
	// final을 붙이면 저장된 값들을 절대로 변경 할 수 없다. (최종값)
	// JS로 치면 const같은 느낌이다
	// final 필드는 초기값을 무조건 줘야 한다
	final String ssn;
	// final에 초기값이 없을 경우에는 생성자에서 초기값을 줄 수 있다.
	// 주민번호

	// 인스턴트 필드
	String name;

	// 생성자
	Korea(String ssn, String name) {
		this.ssn = ssn;
		// final에 초기값이 없을 경우에는 생성자에서 초기값을 줄 수 있다.
		this.name = name;
	}
}
