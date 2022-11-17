package test.ch07;

//자식 클래스
//phone은 슈퍼클래스 SmartPhone은 서브클래스
public class SmartPhone extends phone {
	// 필드
	public boolean wifi;

	// 생성자
	public SmartPhone(String model, String color) {
//		super(model, color);	//부모 생성자 호출
		super(model, color); // 부모클래스 생성자에 매개변수가 없으면 super도 매개변수 없이 하면 된다
		// super는 부모클래스의 필드값만 받아오는 역할이다
		System.out.println("자식 생성자 실행");
		this.model = model;
		this.color = color;
	}

	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");

	}
}
