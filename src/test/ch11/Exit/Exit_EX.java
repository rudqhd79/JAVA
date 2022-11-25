package test.ch11.Exit;

public class Exit_EX {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 5) {
				// 프로세스 종료
				System.out.println("프로그램 강제 종료");
				System.exit(0);
				// (0) : 정상종료
				// (1) 또는 (-1) : 비정상종료

			}
		}
	}

}
