package test.Sol.Class;

public class MyTV {
	
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		if (isPowerOn == true) {
			isPowerOn = false;
		}
		else if (isPowerOn == false) {
			isPowerOn = true;
		}
		else {
			return;
		}
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
	}

	void volumeUp() {
		if (volume < MAX_VOLUME) {
			volume++;
		}
		return;
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
	}

	void volumeDown() {
		if (volume > MIN_VOLUME) {
			volume--;
		}
		return;
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
	}

	void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
		return;
		// (4)만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		// 그렇지 않으면 1을 증가시킨다.
	}

	void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
		return;
		// (5) 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		// 그렇지 않으면 1을 감소시킨다.
	}
	public static void main(String args[]) {
		MyTV t = new MyTV();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
} // class MyTv

class Example {
	
}
