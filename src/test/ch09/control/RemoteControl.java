package test.ch09.control;

public interface RemoteControl {
	//추상메소드
	//추상메소드는 반드시 구현을 해줘야 하기 때문에 익명객체로 쓰일 때에는 추상메소드를 전부 override 해야한다
	void turnOn();
	void turnOff();
}
