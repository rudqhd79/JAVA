package ch08;

public class RemoteControl_EX {

	public static void main(String[] args) {
		// 같은 리모컨으로 tv와 audio를 키는 느낌이다
		// rc는 리모컨
		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
/*		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();    */

		// static의 특성을 가졌기 때문에 객체생성을 하지 않고 호출한다
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);

	}
}
