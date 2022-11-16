package test.ch06;

public class GetSet {
	private int speed;
	private boolean stop;
	// 자동차가 멈췄을때 true, 자동차가 달릴때 false

	public int getSpeed() {
		return speed;
	}

	public int getsetSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		return speed;
	}

//	public boolean isStop() {
//		return stop;
//	}

	public boolean setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) {
			this.speed = 0;
		}
		return stop;
		// 1개만 있으면 {}생략 가능
	}

}
