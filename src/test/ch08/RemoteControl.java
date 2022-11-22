package test.ch08;

public interface RemoteControl {

	// 상수는 보통 값을 변하지 않기 하기 위해 static final을 적어주는데
	// interface에 선언된 필드는 모두 public static final 특성을 갖는다
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// public 추상메소드 (abstract)
	// 추상메소드는 구현하는것이 없어서 {} 내용 적는 칸이 없어도 된다
	// public이 없어도 public abstract가 컴파일과정(출력할 때)에서 자동으로 붙는다
	// 자동으로 붙는 이유는 추상메소드 이기 때문이다
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드: 인터페이스에서 실행 메소드를 구현하고 싶을때 사용
	default void setMute(boolean mute) { // 음소거
		if (mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제");
		}
	}

	// 정적(static) 메소드
	// 코드를 구현 할 수 있다.
	// public이 없어도 컴파일 과정에서 public이 붙는다
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}
}
