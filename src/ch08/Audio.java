package ch08;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨:  " + volume);
	}

	// 필드
	private int memoryVolume;

	//디폴트 메소드는 오버라이드 할 때 반드시 public을 해줘야 한다
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("음소거 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			// setVolume(this.memoryVolume);의 현재 값은 5다
			// main에는 5라고 값을 적어줬기 때문이다
			setVolume(this.memoryVolume);
			System.out.println("음소거 해제");
		}
	}
}
