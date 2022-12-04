package test.ch13.multiThread;

public class ThreadName_EX {

	public static void main(String[] args) {

		// main thread 이름 가져오기
		// currentThread()는 현재 실행되고 있는 코드를 가져온다
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		// thread를 3개를 생산(void run()이 3번 돌아간다)
		for (int i = 0; i < 3; i++) {

			// thread에 이름주기
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + "실행"); // getName()은 thread 이름을 가져온다
				}

			}; // 익명 객체

			threadA.start();
		}

		// chat thread 생성
		// thread에 이름주기
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				System.out.println(getName() + "실행"); // getName()은 thread 이름을 가져온다
			}
			
		}; // 익명 객체
		
		//getName()으로 얻은 이름대신 실행전에 이름을 chat-thread로 바꾼다
		chatThread.setName("chat-thread");	//thread가 실행되기 전에 이름을 바꾼다
		chatThread.start();
	}

}
