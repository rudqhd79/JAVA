package test.ch13.sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// synchronized(동기화)
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초 정지
		} catch (InterruptedException e) {
			// 출력창에 this.memory는 매개변수 memory이다
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	} // 코드가 들어가면 동기화 된 메소드는 잠긴다(잠기는 것은 여길 지나가는 값들이 메소드의 작업을 끝낼 때 까지 기다린 후 다음 값이 들어간다)
		// 대신 기다리고 있는 값들의 순서는 랜덤으로 정해진다

	// 코드 블록에 동기화(원하는 범위에 동기화를 지정)
	public void setMemory2(int memory) {
		synchronized (this) { // 여기서 this는 그 지점부터 시작이라는 뜻
			this.memory = memory;
			try {
				Thread.sleep(2000); // 2초 정지
			} catch (InterruptedException e) {
				// 출력창에 this.memory는 매개변수 memory이다
				System.out.println(Thread.currentThread().getName() + ":" + this.memory);
			}
		}
	}
}
