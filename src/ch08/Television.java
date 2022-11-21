package ch08;

public class Television implements RemoteControl {

	// 볼륨 필드
	private int volume;

	// 인터페이스에 정의된 추상 메소드는 반드시 구현을 해줘야 한다
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	//디폴트 메소드는 오버라이드 할 때 반드시 public을 해줘야 한다
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:  " + volume);
	}
}
