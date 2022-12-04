package test.ch13.mainThread;

import java.awt.Toolkit;

//메인 스레드 역할 클래스
public class BeepPrint_EX {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();// 빔 소리를 낸다
			try {
				//thread는 동시에 여러가지 일을 처리하기 위해 사용한다
				Thread.sleep(500);// 1000이 1초 500은 0.5초 동안 일시정지
			} catch (Exception e) {}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("딩~");
			try {
				//thread는 동시에 여러가지 일을 처리하기 위해 사용한다
				Thread.sleep(500);// 1000이 1초 500은 0.5초 동안 일시정지
			} catch (Exception e) {}
		}

	}
}
